package com.example.sunset.usretrofit.API;

import com.example.sunset.usretrofit.model.De;
import com.example.sunset.usretrofit.model.Os;
import com.example.sunset.usretrofit.model.Return;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by sunset on 2017/9/23.
 */

public interface Vurt {
    @GET("list")
    Call<Os> requestNews();

    @FormUrlEncoded
    @POST("reboot")
    @Headers("API-Key:ZBOB4XNSBMFRJRXVCF52L6JY6PMNCSK2BTHQ")
    Call<Void> reboot(@Field("SUBID") int id);

    @FormUrlEncoded
    @POST("destroy")
    @Headers("API-Key:ZBOB4XNSBMFRJRXVCF52L6JY6PMNCSK2BTHQ")
    Call<Void> delete(@Field("SUBID") int id);


    @GET("list")
    @Headers("API-Key:ZBOB4XNSBMFRJRXVCF52L6JY6PMNCSK2BTHQ")
    Call<De> list();
}
