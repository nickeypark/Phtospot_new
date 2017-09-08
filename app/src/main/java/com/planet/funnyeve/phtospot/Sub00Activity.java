package com.planet.funnyeve.phtospot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Sub00Activity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sub, menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub00);
        //객체 선언
        ImageButton mainBtn1,mainBtn2,mainBtn3,mainBtn4; //객체 선언
        ImageView imageView,imageView2,imageView3,imageView4,imageView5 ;
        //객체 연결
        imageView = (ImageView)findViewById(R.id.subphoto01);
        imageView2 = (ImageView)findViewById(R.id.subphoto02);
        imageView3 = (ImageView)findViewById(R.id.subphoto03);
        imageView4 = (ImageView)findViewById(R.id.subphoto04);
        imageView5 = (ImageView)findViewById(R.id.subphoto05);

        mainBtn1 =(ImageButton) findViewById(R.id.tabButton1);
        mainBtn2 =(ImageButton) findViewById(R.id.tabButton2);
        mainBtn3 =(ImageButton) findViewById(R.id.tabButton3);
        mainBtn4 =(ImageButton) findViewById(R.id.tabButton4);


        imageView.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00_01Activity.class);
                startActivity(intent);


            }
        });
        imageView2.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00_01Activity.class);
                startActivity(intent);


            }
        });
        imageView3.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00_01Activity.class);
                startActivity(intent);


            }
        });
        imageView4.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00_01Activity.class);
                startActivity(intent);


            }
        });
        imageView5.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext (), Sub00_01Activity.class);
                startActivity(intent);


            }
        });


        mainBtn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //String name = nameText.getText().toString();
                Intent in = new Intent(getApplicationContext(), MapsActivity.class);
                //intent.putExtra("nameText", name);
                startActivity(in);
            }
        });

        mainBtn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //String name = nameText.getText().toString();
                Intent in = new Intent(getApplicationContext(), Sub04Activity.class);
                //intent.putExtra("nameText", name);
                startActivity(in);
            }
        });

        mainBtn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Picked",Toast.LENGTH_SHORT).show();
            }
        });

        mainBtn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //String name = nameText.getText().toString();
                Intent in = new Intent(getApplicationContext(), Sub04Activity.class);
                //intent.putExtra("nameText", name);
                startActivity(in);
            }
        });

    }
}
