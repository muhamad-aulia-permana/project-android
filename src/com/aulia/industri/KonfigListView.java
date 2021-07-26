package com.aulia.industri;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class KonfigListView extends ArrayAdapter<String> {
    //Declarasi
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
 
    public KonfigListView(Activity context,String[] web, Integer[] imageId) {
        super(context, R.layout.isi_lv_menunavigasi, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
 
    }
 
    @Override
    public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            //Load Custom Layout untuk list
            View rowView= inflater.inflate(R.layout.isi_lv_menunavigasi, null, true);
            //Declarasi komponen
            TextView txtTitle = (TextView) rowView.findViewById(R.id.txtList);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.imgIcon);
 
            //Set Parameter Value
            txtTitle.setText(web[position]);
            imageView.setImageResource(imageId[position]);
 
            return rowView;
        }

}
