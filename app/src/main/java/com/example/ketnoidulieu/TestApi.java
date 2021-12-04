package com.example.ketnoidulieu;

import java.util.List;

import retrofit2.http.GET;

public interface TestApi {

    @GET("DevTides/DogsApi/master/dogs.json")
    Single<List<DogBreed>> getDogs();
}
