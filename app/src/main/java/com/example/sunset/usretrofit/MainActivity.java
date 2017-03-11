package com.example.sunset.usretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sunset.usretrofit.API.GItHubService;
import com.example.sunset.usretrofit.API.gitapi;
import com.example.sunset.usretrofit.model.Contributer;
import com.example.sunset.usretrofit.model.Datum;
import com.example.sunset.usretrofit.model.IpModel;
import com.example.sunset.usretrofit.model.Repo;
import com.example.sunset.usretrofit.model.gitmodel;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Button click;
    TextView tv;
    EditText edit_user;
    ProgressBar pbar;
    String API = "https://api.github.com";  // BASE URL
    String  type="top";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.tv);
        edit_user = (EditText) findViewById(R.id.edit);
        pbar = (ProgressBar) findViewById(R.id.pb);
        pbar.setVisibility(View.INVISIBLE);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edit_user.getText().toString().equals(""));
                    type=edit_user.getText().toString();
                getIpInformation("59.108.54.37");
             //   Log.e("相应","哟2");
            }
        });
    }

    private void getIpInformation(String ip) {
        String url = "http://ip.taobao.com/service/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/toutiao/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       // Log.e("相应","哟3");
        GItHubService service = retrofit.create(GItHubService.class);
        Call<Contributer> repos = service.contributorsByAddConverterGetCall(type,"0320c04dd513482aabcf8a0aeed855eb");
       // Log.e("相应","哟4");
        repos.enqueue(new Callback<Contributer>() {
            @Override
            public void onResponse(Call<Contributer> call, Response<Contributer> response) {
            //    Log.e("相应",response.headers()+"哟");
                try {
                //   Log.e("相应",response+"哟");
                    Contributer contributorList = response.body();
                    for (Datum contributor : contributorList.getResult().getData()){
                        Log.e("title=", contributor.getTitle());
                        Log.e("author=",contributor.getAuthorName() );
                    }
                }
                catch (Exception e) {
                   Log.e("错误",e.toString());
                }
            }

            @Override
            public void onFailure(Call<Contributer> call, Throwable t) {
                Log.e("相应错误",t.toString());
                t.printStackTrace();
            }
        });
      //  Log.e("相应","哟5");

    }
}