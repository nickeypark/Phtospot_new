package com.planet.funnyeve.phtospot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportAction(toolbar);

        // 툴바 홈버튼을 활성화
        //    getSupportActionBar() .setDisplayHomeAsUpEnabled(true);
        // 툴바 홈버튼을 활성화
        //    getSupportActionBar() .setHomeAsUpIndicator(R.drawable.ic_menu_slideshow);

        final ImageButton mainBtn1 =(ImageButton) findViewById(R.id.imageBtn1);
        ImageButton mainBtn2 =(ImageButton) findViewById(R.id.imageBtn2);
        ImageButton mainBtn3 =(ImageButton) findViewById(R.id.imageBtn3);

        mainBtn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //String name = nameText.getText().toString();
                Intent in = new Intent(getApplicationContext(), Sub00Activity.class);
                //intent.putExtra("nameText", name);
                startActivity(in);
            }
        });

        mainBtn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //String name = nameText.getText().toString();
                Intent in = new Intent(getApplicationContext(), Sub01Activity.class);
                //intent.putExtra("nameText", name);
                startActivity(in);
            }
        });

        mainBtn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //String name = nameText.getText().toString();
                Intent in = new Intent(getApplicationContext(), Activity.class);
                //intent.putExtra("nameText", name);
                startActivity(in);
            }
        });


    }
}
