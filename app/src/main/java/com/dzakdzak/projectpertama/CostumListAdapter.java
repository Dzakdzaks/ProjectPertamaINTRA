package com.dzakdzak.projectpertama;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dzaky on 08/10/2017.
 */

public class CostumListAdapter extends ArrayAdapter<String> {

    //instalisasi TextView, imageView, dan activity nya
    private final Activity context;
    private final String[] title;
    private final Integer[] gambar;


    //kenalkan layout tadi yang akan kita masukkan textview dan imageview
    public CostumListAdapter(Activity context, String[] menuTitle, Integer[] menuGambar) {
        super(context, R.layout.list_item,menuTitle);

        this.context = context;
        this.gambar = menuGambar;
        this.title = menuTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //memnaggil layout listitemimage ke dalam layout activity listbuah image
        LayoutInflater inflater = context.getLayoutInflater();
        //untuk memanggil layout
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        //kenalkan TextView dan imageView tadi
        TextView txtJudul = (TextView)rowView.findViewById(R.id.tv);
        ImageView imgbuah = (ImageView)rowView.findViewById(R.id.img);

        txtJudul.setText(title[position]);
        imgbuah.setImageResource(gambar[position]);
        return rowView;
    }
}
