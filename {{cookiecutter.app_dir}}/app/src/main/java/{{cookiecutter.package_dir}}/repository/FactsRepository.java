package {{cookiecutter.package_dir.replace('/','.')}}.repository;

import android.support.annotation.WorkerThread;

import {{cookiecutter.package_dir.replace('/','.')}}.models.Fact;
import {{cookiecutter.package_dir.replace('/','.')}}.models.FactResponse;
import {{cookiecutter.package_dir.replace('/','.')}}.network.services.FactsService;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import retrofit2.Response;

public class FactsRepository {
    private FactsService mFactService;

    public FactsRepository(FactsService factsService) {
        mFactService = factsService;
    }

    @WorkerThread
    public List<Fact> getFacts() throws IOException{
            Response<FactResponse> response =  mFactService.getFacts().execute();
            if(response.isSuccessful()){
                return response.body().getRows();
            }

            return Collections.emptyList();
    }
}
