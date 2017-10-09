package com.dzakdzak.projectpertama;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailList extends AppCompatActivity {

    String judul, keterangan;
    int gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        judul = getIntent().getStringExtra("judul");
        gambar = getIntent().getIntExtra("gambar", 0);
        keterangan = getIntent().getStringExtra("keterangan");

        ImageView img = (ImageView) findViewById(R.id.imageDetail);
        TextView txt = (TextView) findViewById(R.id.tvDetail);

        setTitle(judul);
        img.setImageResource(gambar);
        txt.setText(keterangan);


    }
}
