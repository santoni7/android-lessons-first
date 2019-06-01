package com.bigdig.myfirstandroidapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "ActivityLifecycle";

    private Button btnHitMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "onCreate()");


        btnHitMe = findViewById(R.id.btn_hit_me);
        btnHitMe.setText("Hit me from code!");

        btnHitMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LOG_TAG, "Button was clicked");

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("number", 13);
                startActivityForResult(i, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1
                && resultCode == RESULT_OK
                && data != null){
            int res = data.getIntExtra("result", -1);

            Log.d(LOG_TAG, "Result: " + res);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        Log.d(LOG_TAG, "onDestroy()");
        super.onDestroy();
    }
}
