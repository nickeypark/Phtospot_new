package com.planet.funnyeve.phtospot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Sub00_01Activity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sub, menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub00_01);

        //객체 선언
        ImageView imageView;
        //객체 연결
        imageView = (ImageView)findViewById(R.id.imgDetlView);

        imageView.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Intent intent = new Intent(getApplicationContext (), Sub00_01Activity.class);
                //startActivity(intent);
                finish();

            }
        });

    }
}
