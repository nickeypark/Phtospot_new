package com.planet.funnyeve.phtospot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

public class Sub02Activity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sub, menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub02);
    }
}
