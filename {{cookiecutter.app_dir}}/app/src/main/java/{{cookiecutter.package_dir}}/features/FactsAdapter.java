package {{cookiecutter.package_dir.replace('/','.')}}.features;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import {{cookiecutter.package_name}}.R;
import {{cookiecutter.package_name}}.databinding.ItemFactBinding;
import {{cookiecutter.package_dir.replace('/','.')}}.models.Fact;
import com.google.android.gms.common.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactsAdapter extends RecyclerView.Adapter<FactsAdapter.ViewHolder> {
    List<Fact> mFacts = new ArrayList<>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemFactBinding itemFactBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),R.layout.item_fact, viewGroup, false);
        return new ViewHolder(itemFactBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bind(mFacts.get(i));
    }

    @Override
    public int getItemCount() {
        return mFacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemFactBinding mItemFactBinding;
        public ViewHolder(@NonNull ItemFactBinding itemViewBinding) {
            super(itemViewBinding.getRoot());
            mItemFactBinding = itemViewBinding;
        }

        public void bind(Fact fact){
            mItemFactBinding.setFact(fact);
        }
    }

    public void updateData(List<Fact> facts){
        if(!CollectionUtils.isEmpty(mFacts)){
            mFacts.clear();
        }
        mFacts.addAll(facts);
        notifyDataSetChanged();
    }
}
