package com.planet.funnyeve.phtospot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

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

        ImageButton mainBtn1,mainBtn2,mainBtn3; //객체 선언
        ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6;

        mainBtn1 =(ImageButton) findViewById(R.id.imageBtn1);
        mainBtn2 =(ImageButton) findViewById(R.id.imageBtn2);
        mainBtn3 =(ImageButton) findViewById(R.id.imageBtn3);

        imageView = (ImageView)findViewById(R.id.mphoto01);
        imageView2 = (ImageView)findViewById(R.id.mphoto02);
        imageView3 = (ImageView)findViewById(R.id.mphoto03);
        imageView4 = (ImageView)findViewById(R.id.mphoto04);
        imageView5 = (ImageView)findViewById(R.id.mphoto05);
        imageView6 = (ImageView)findViewById(R.id.mphoto06);

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
                Intent in = new Intent(getApplicationContext(), Sub00_02Activity.class);
                //intent.putExtra("nameText", name);
                startActivity(in);
            }
        });

        mainBtn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //String name = nameText.getText().toString();
                Intent in = new Intent(getApplicationContext(), MapsActivity.class);
                //intent.putExtra("nameText", name);
                startActivity(in);
            }
        });



        imageView.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00Activity.class);
                startActivity(intent);


            }
        });
        imageView2.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00Activity.class);
                startActivity(intent);


            }
        });
        imageView3.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00Activity.class);
                startActivity(intent);


            }
        });
        imageView4.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00Activity.class);
                startActivity(intent);


            }
        });
        imageView5.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00Activity.class);
                startActivity(intent);


            }
        });
        imageView6.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00Activity.class);
                startActivity(intent);


            }
        });

    }
}
