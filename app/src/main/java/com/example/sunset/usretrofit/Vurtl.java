package com.example.sunset.usretrofit;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sunset.usretrofit.API.NewsService;
import com.example.sunset.usretrofit.API.Vurt;
import com.example.sunset.usretrofit.model.De;
import com.example.sunset.usretrofit.model.Detail;
import com.example.sunset.usretrofit.model.Os;
import com.example.sunset.usretrofit.model.Return;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sunset on 2017/9/23.
 */

public class Vurtl extends AppCompatActivity {
    private Button send;
    private TextView msg;
    private TextView ms;
    private TextView relog;
    private final  String API_KEY="ZBOB4XNSBMFRJRXVCF52L6JY6PMNCSK2BTHQ";
    //curl -H 'API-Key: ZBOB4XNSBMFRJRXVCF52L6JY6PMNCSK2BTHQ' https://api.vultr.com/v1/server/list
    //"SUBID":"7193584"
    //curl -H 'API-Key: ZBOB4XNSBMFRJRXVCF52L6JY6PMNCSK2BTHQ' https://api.vultr.com/v1/server/reboot --data 'SUBID=7193584'
    //curl -H 'API-Key: ZBOB4XNSBMFRJRXVCF52L6JY6PMNCSK2BTHQ' https://api.vultr.com/v1/server/reboot --data 'SUBID=10651796'
    //curl -H 'API-Key: ZBOB4XNSBMFRJRXVCF52L6JY6PMNCSK2BTHQ' https://api.vultr.com/v1/server/destroy --data 'SUBID=10635824'
    //curl -H 'API-Key: ZBOB4XNSBMFRJRXVCF52L6JY6PMNCSK2BTHQ' https://api.vultr.com/v1/server/destroy --data 'SUBID=576965'
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vurtl);
        send=(Button)findViewById(R.id.send);
        msg=(TextView)findViewById(R.id.sta);
        ms=(TextView)findViewById(R.id.co);
        relog=(TextView)findViewById(R.id.rebootlog);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 getos();
               // reboot(10651796);
                reboot(7193584);
               // destory();
            }
        });
    }
    private void getos() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.vultr.com/v1/server/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final Vurt service = retrofit.create(Vurt.class);
       // Call<String> repos = service.restart("10636332");//type 请求的是
        final Call<De> repos = service.list();//pe 请求的是

        repos.enqueue(new Callback<De>() {
            @Override
            public void onResponse(Call<De> call, Response<De> response) {
                try {
                  //  Log.e("相应",response.body().getAllowed_bandwidth_gb());
                    Log.e("相应",response.body().get_$7193584().getLocation());
                    Log.e("相应",response.body().get_$7193584().getAllowed_bandwidth_gb());
                    Log.e("相应",response.body().get_$7193584().getCost_per_month());
                    ms.setText("服务器地点:"+response.body().get_$7193584().getLocation());
                    msg.setText("服务器流量:"+response.body().get_$7193584().getAllowed_bandwidth_gb()+" GB");
                   // Log.e("相应",response.body().getLocation());
                   // Log.e("相应",response.headers().toString());
                    }
                catch (Exception e) {
                    Log.e("错误",Log.getStackTraceString(e));}
            }

            @Override
            public void onFailure(Call<De> call, Throwable t) {
                //Log.e("相应错误",t.toString());
                ms.setText("网链接错误"+t.toString());
                t.printStackTrace();
            }
        });
    }
    private void reboot(int cuid) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.vultr.com/v1/server/")
                .addConverterFactory(new NullOnEmptyConverterFactory())
                .build();
        final Vurt service = retrofit.create(Vurt.class);
         Call<Void> repos = service.reboot(cuid);//type 请求的是
        //final Call repos = service.list();//pe 请求的是

        repos.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    //  Log.e("相应",response.body().getAllowed_bandwidth_gb());
                 //   Log.e("相应",response.body().toString());
                    // Log.e("相应",response.body().getLocation());
                    Log.e("reboot相应",response.message());
                    Log.e("reboot相应",response.headers().toString());
                    msg.setText("重启结果"+response.message());
                    ms.setText("响应头:"+response.headers().toString());

                }
                catch (Exception e) {
                    relog.setText("重启服务器错误: "+Log.getStackTraceString(e));
                    Log.e("reboot错误",Log.getStackTraceString(e));}
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Log.e("reboot相应错误",t.toString());
                relog.setText("重启服务器网络问题: "+t.toString());
                t.printStackTrace();
            }
        });
    }
    private void destory() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.vultr.com/v1/server/")
                .addConverterFactory(new NullOnEmptyConverterFactory())
                .build();
        final Vurt service = retrofit.create(Vurt.class);
        Call<Void> repos = service.delete(10651738);//type 请求的是
        //final Call repos = service.list();//pe 请求的是

        repos.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    //  Log.e("相应",response.body().getAllowed_bandwidth_gb());
                    //   Log.e("相应",response.body().toString());
                    // Log.e("相应",response.body().getLocation());
                    Log.e("相应",response.message());
                    Log.e("相应",response.headers().toString());

                }
                catch (Exception e) {
                    Log.e("错误des",Log.getStackTraceString(e));}
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Log.e("相应错误des",t.toString());
                t.printStackTrace();
            }
        });
    }
}
