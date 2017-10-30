package com.example.sunset.usretrofit.API;

import com.example.sunset.usretrofit.model.Return;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sunset on 2017/3/10.
 */

public interface NewsService {
    @GET("index")
    Call<Return> requestNews(@Query("type") String type, @Query("key") String key);
}
