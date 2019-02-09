package {{cookiecutter.package_dir.replace('/','.')}};

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import {{cookiecutter.package_dir.replace('/','.')}}.dependencies.AppComponent;

import javax.inject.Inject;


public class BaseFragment<T extends ViewModel> extends Fragment {
    protected @Inject ViewModelFactory mViewModelFactory;
    protected T mViewModel;

    public void initViewModel(Class<T> cls){
        FragmentActivity activity = getActivity();
        if(activity != null){
            if(mViewModelFactory != null){
                mViewModel = ViewModelProviders.of(activity,mViewModelFactory).get(cls);
            } else{
                throw new RuntimeException("ViewModelProvider is null. Make sure you are calling getAppComponent().inject(Fragment.this) before initialising the view model in Fragment");
            }
        } else {
           throw new RuntimeException("view model cannot be created with null Activity");
        }
    }

    public AppComponent getAppComponent(){
        Activity activity = getActivity();
        if(activity != null){
            Application app = activity.getApplication();
            if(app instanceof {{cookiecutter.app_dir}}){
                return (({{cookiecutter.app_dir}})app).getAppComponent();
            }
        }

        throw new RuntimeException("Unable to find AppComponent");
    }

}
