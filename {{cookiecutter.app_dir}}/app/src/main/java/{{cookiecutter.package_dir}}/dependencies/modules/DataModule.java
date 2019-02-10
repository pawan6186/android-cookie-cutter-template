package {{cookiecutter.package_dir.replace('/','.')}}.dependencies.modules;

import {{cookiecutter.package_dir.replace('/','.')}}.network.services.FactsService;
import {{cookiecutter.package_dir.replace('/','.')}}.repository.FactsRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {
    @Singleton
    @Provides
    FactsRepository providesFactRepository(FactsService factsService){
        return new FactsRepository(factsService);
    }
}
