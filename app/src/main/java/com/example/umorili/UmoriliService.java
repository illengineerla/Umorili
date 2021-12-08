package com.example.umorili;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UmoriliService {
    @GET("api/get")
    Call<List<UPost>> getData(@Query("name") String resourceName, @Query("num") int count);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://umorili.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
}
