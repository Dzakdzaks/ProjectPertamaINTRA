package com.dzakdzak.projectpertama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi widget
        Button buttonIntent = (Button)findViewById(R.id.button);
        buttonIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //intent ke activity lain
                startActivity(new Intent(getApplicationContext(), ActivityDua.class));
            }
        });

    }
}
