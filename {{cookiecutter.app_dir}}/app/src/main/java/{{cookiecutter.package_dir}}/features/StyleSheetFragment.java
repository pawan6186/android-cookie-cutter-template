package {{cookiecutter.package_dir.replace('/','.')}}.features;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import {{cookiecutter.package_dir.replace('/','.')}}.BaseFragment;
import {{cookiecutter.package_name}}.R;

public class StyleSheetFragment extends BaseFragment<HomeViewModel> {
    public static StyleSheetFragment newInstance(){
        return new StyleSheetFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_stylesheet,container,false);
    }
}

