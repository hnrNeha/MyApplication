package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class custombaseadapter extends BaseAdapter {
    Context context;
    String listmat[];
    int listimgs[];
    LayoutInflater inflater;


    public custombaseadapter(Context ctx,String[] matter,int [] images){
        this.context=ctx;
        this.listmat=matter;
        this.listimgs=images;
        inflater=LayoutInflater.from(ctx);
    }




    @Override
    public int getCount() {
        return listmat.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.activity_customlistview, null);
        TextView txtview=(TextView)view.findViewById(R.id.textview);
        ImageView images=(ImageView) view.findViewById(R.id.imageIcom);
        txtview.setText(listmat[i]);
        images.setImageResource(listimgs[i]);

        return view;
    }
}
