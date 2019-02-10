package {{cookiecutter.package_dir.replace('/','.')}}.dependencies.modules;

import android.content.Context;

import {{cookiecutter.package_dir.replace('/','.')}}.{{cookiecutter.app_dir}};

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final {{cookiecutter.app_dir}} app;

    public AppModule({{cookiecutter.app_dir}} templateApp) {
        this.app = templateApp;
    }

    @Singleton
    @Provides
    public Context provideApplicationContext() {
        return app;
    }
}
