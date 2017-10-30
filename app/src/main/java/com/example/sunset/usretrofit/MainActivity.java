package com.example.sunset.usretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.sunset.usretrofit.API.NewsService;
import com.example.sunset.usretrofit.model.Return;
import com.example.sunset.usretrofit.model.Detail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    String  type="top";
    Spinner selectNewsType;
    ListView news;
    List<String> title;
    ImageView imageView;
    private String[] types = {"top","shehui","guonei","guoji","yule","tiyu","junshi","keji"};
    ArrayAdapter<String> adapter;
    SimpleAdapter simpleAdapter;
    List<Map<String,Object>> data;
    MyAdaptor myAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=new ArrayList<>();
        selectNewsType=(Spinner)findViewById(R.id.spinner);
        news=(ListView)findViewById(R.id.news);
        data=new ArrayList<Map<String, Object>>();
        HashMap map = new HashMap<String, Object>();
        data.add(map);
        myAdaptor=new MyAdaptor(this,data);
        simpleAdapter = new SimpleAdapter(this,data,R.layout.list_raw,
                new String[]{"title","author","img"},
                new int[]{R.id.title,R.id.author,R.id.imageView2});
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,title);
        news.setAdapter(myAdaptor);
        selectNewsType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String[] languages = getResources().getStringArray(R.array.news_type);
                Toast.makeText(MainActivity.this, "选择新闻类型是:"+languages[i], Toast.LENGTH_LONG).show();
                type=types[i];
                getNews();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        getNews();
    }

    private void getNews() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/toutiao/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final NewsService service = retrofit.create(NewsService.class);
        Call<Return> repos = service.requestNews(type,"0320c04dd513482aabcf8a0aeed855eb");//type 请求的是
        repos.enqueue(new Callback<Return>() {
            @Override
            public void onResponse(Call<Return> call, Response<Return> response) {
                try {
                    Return contributorList = response.body();
                    data.clear();
                    Map<String, Object> map;
                    for (Detail contributor : contributorList.getResult().getData()){
                        map = new HashMap<String, Object>();
                        map.put("img", contributor.getThumbnailPicS());
                        map.put("title", contributor.getTitle());
                        map.put("author", contributor.getAuthorName());
                        data.add(map);
                    }
                    myAdaptor.notifyDataSetChanged();
                }
                catch (Exception e) {
                   Log.e("错误",Log.getStackTraceString(e));
                }
            }

            @Override
            public void onFailure(Call<Return> call, Throwable t) {
                Log.e("相应错误",t.toString());
                t.printStackTrace();
            }
        });
    }
    private void getos() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/toutiao/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final NewsService service = retrofit.create(NewsService.class);
        Call<Return> repos = service.requestNews(type,"0320c04dd513482aabcf8a0aeed855eb");//type 请求的是
        repos.enqueue(new Callback<Return>() {
            @Override
            public void onResponse(Call<Return> call, Response<Return> response) {
                try {
                    Return contributorList = response.body();
                    data.clear();
                    Map<String, Object> map;
                    for (Detail contributor : contributorList.getResult().getData()){
                        map = new HashMap<String, Object>();
                        map.put("img", contributor.getThumbnailPicS());
                        map.put("title", contributor.getTitle());
                        map.put("author", contributor.getAuthorName());
                        data.add(map);
                    }
                    myAdaptor.notifyDataSetChanged();
                }
                catch (Exception e) {
                    Log.e("错误",Log.getStackTraceString(e));
                }
            }

            @Override
            public void onFailure(Call<Return> call, Throwable t) {
                Log.e("相应错误",t.toString());
                t.printStackTrace();
            }
        });
    }
}