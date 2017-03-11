package com.example.sunset.usretrofit.API;

import com.example.sunset.usretrofit.model.Contributer;
import com.example.sunset.usretrofit.model.Repo;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by sunset on 2017/3/10.
 */

public interface GItHubService {
    @GET("index")
    Call<Contributer> contributorsByAddConverterGetCall(@Query("type") String type,@Query("key") String key);
}
