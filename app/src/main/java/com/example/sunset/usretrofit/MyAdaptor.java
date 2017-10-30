package com.example.sunset.usretrofit;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * Created by sunset on 2017/9/7.
 */

public class MyAdaptor extends BaseAdapter {
    private Context context;
    private List<Map<String,Object>> data;
    public MyAdaptor(Context context,List<Map<String,Object>> data) {
        this.context=context;
        this.data=data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.list_raw, null);
        }
        ImageView img = (ImageView)view.findViewById(R.id.imageView2);
        TextView title = (TextView)view.findViewById(R.id.title);
        TextView author = (TextView)view.findViewById(R.id.author);
        title.setText((String)data.get(i).get("title"));
        author.setText((String)data.get(i).get("author"));
        Glide.with(context)
                .load((String) data.get(i).get("img"))
                .centerCrop()
                .placeholder(R.drawable.ic_launcher)
                .crossFade()
                .into(img);
        return view;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

}
