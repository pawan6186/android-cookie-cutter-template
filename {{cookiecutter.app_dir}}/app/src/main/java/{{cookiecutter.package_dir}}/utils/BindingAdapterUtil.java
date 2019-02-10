package {{cookiecutter.package_dir.replace('/','.')}}.utils;


import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import {{cookiecutter.package_name}}.R;

public class BindingAdapterUtil {
    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String imageUrl) {

        //Handling issue with image urls
        if(imageUrl !=null && imageUrl.contains("http://")){
           imageUrl = imageUrl.replace("http://", "https://");
        }

        Glide.with(view.getContext())
                .load(imageUrl)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model,
                                                Target<Drawable> target,
                                                boolean isFirstResource) {
                        view.post(() -> view
                                .setImageDrawable(ContextCompat.getDrawable(view.getContext(),
                                        R.drawable.ic_default_image)));
                        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model,
                                                   Target<Drawable> target,
                                                   DataSource dataSource, boolean isFirstResource) {
                        return false;
                    }
                })
                .apply(new RequestOptions()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .centerCrop())
                .into(view);
    }
}
