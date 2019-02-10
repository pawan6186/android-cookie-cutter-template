package {{cookiecutter.package_dir.replace('/','.')}}.network.services;

import {{cookiecutter.package_dir.replace('/','.')}}.models.Fact;
import {{cookiecutter.package_dir.replace('/','.')}}.models.FactResponse;
import {{cookiecutter.package_dir.replace('/','.')}}.network.ApiUrls;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FactsService {
    @GET(ApiUrls.FACTS_URL)
    Call<FactResponse> getFacts();
}
