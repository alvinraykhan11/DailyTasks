package com.mercubuanauasmobile.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onResume() {
        super.onResume();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        image = (ImageView) findViewById(R.id.imageView);
        image.animate().alphaBy(1f).setDuration(2000);
        new CountDownTimer(2000,1500){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        }.start();






    }
}
