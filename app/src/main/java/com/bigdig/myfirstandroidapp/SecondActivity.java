package com.bigdig.myfirstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int number = getIntent().getIntExtra("number", 0);
        Log.d("ActivityLifecycle", "SecondActivity was created. Number=" + number);

        Intent result = new Intent();
        result.putExtra("result", number * 2);

        setResult(RESULT_OK, result);
    }
}
