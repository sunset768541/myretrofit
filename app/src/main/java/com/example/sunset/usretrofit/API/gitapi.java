package com.example.sunset.usretrofit.API;

import com.example.sunset.usretrofit.model.IpModel;
import com.example.sunset.usretrofit.model.gitmodel;

import java.util.concurrent.Callable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by sunset on 2017/3/10.
 */

public interface gitapi {
    @GET("getIpInfo.php")
    Call<IpModel> getIpMsg(@Query("ip")String ip);
}
