package com.example.secondchancelove;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ReligionsAdapter extends BaseAdapter {

    Context context;
    String[] religions;
    LayoutInflater inflter;


    public ReligionsAdapter(Context applicationContext, String[] religions) {

        this.context = applicationContext;
        this.religions = religions;
        inflter = (LayoutInflater.from(applicationContext));

    }


    @Override
    public int getCount() {
        return religions.length;
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
        view = inflter.inflate(R.layout.religion_spinner_items, null);
       // ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView names = (TextView) view.findViewById(R.id.hindu_txt);
//        TextView muslim = (TextView) view.findViewById(R.id.muslim_txt);
      //  TextView christian = (TextView) view.findViewById(R.id.christian_txt);
       // icon.setImageResource(flags[i]);
        names.setText(religions[i]);
      //  muslim.setText(religions[i]);
       // christian.setText(religions[i]);

        return view;
    }
}
