package com.commit451.reptar.sample;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GitHub {

    String API_URL = "https://api.github.com";

    @GET("/repos/{owner}/{repo}/contributors")
    Single<List<Contributor>> contributors(@Path("owner") String owner,
                                           @Path("repo") String repo);

    @GET("/repos/{owner}/{repo}/contributors")
    Single<Response<List<Contributor>>> contributorsResponse(@Path("owner") String owner,
                                                                  @Path("repo") String repo);
}
