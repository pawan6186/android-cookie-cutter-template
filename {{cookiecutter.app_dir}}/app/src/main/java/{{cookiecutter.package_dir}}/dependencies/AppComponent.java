package {{cookiecutter.package_dir.replace('/','.')}}.dependencies;

import {{cookiecutter.package_dir.replace('/','.')}}.{{cookiecutter.launcher_activity_name}};
import {{cookiecutter.package_dir.replace('/','.')}}.dependencies.modules.AppModule;
import {{cookiecutter.package_dir.replace('/','.')}}.dependencies.modules.DataModule;
import {{cookiecutter.package_dir.replace('/','.')}}.dependencies.modules.NetworkModule;
import {{cookiecutter.package_dir.replace('/','.')}}.dependencies.modules.ViewModelModule;
import {{cookiecutter.package_dir.replace('/','.')}}.features.HomeFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ViewModelModule.class, NetworkModule.class, DataModule.class})
public interface AppComponent{
    void inject({{cookiecutter.launcher_activity_name}} mainActivity);
    void inject(HomeFragment fragment);
}
