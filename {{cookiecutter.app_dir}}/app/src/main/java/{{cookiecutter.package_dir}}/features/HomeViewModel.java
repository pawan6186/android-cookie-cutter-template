package {{cookiecutter.package_dir.replace('/','.')}}.features;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import {{cookiecutter.package_dir.replace('/','.')}}.models.Fact;
import {{cookiecutter.package_dir.replace('/','.')}}.repository.FactsRepository;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import timber.log.Timber;

public class HomeViewModel extends ViewModel {

    @Inject
    FactsRepository mFactsRepository;
    private MutableLiveData <List<Fact>> mFacts = new MutableLiveData<>();
    private MutableLiveData <String> mError = new MutableLiveData<>();

    @Inject public HomeViewModel(){}

    public LiveData<List<Fact>> getFacts(){
        new Thread(() -> {
            try {
                mFacts.postValue(mFactsRepository.getFacts());
            } catch (IOException e) {
                Timber.e(e);
                mError.postValue(e.getMessage());
            }
        }).start();
        return mFacts;
    }
    public LiveData<String> getError(){
        return mError;
    }
}
