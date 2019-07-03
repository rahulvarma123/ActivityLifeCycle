package com.example.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second);
    }

    @Override
    protected void onRestart() {
        super.onRestart ( );
        Log.v ("Activity","onRestart of Second Activity");
    }

    @Override
    protected void onStart() {
        super.onStart ( );
        Log.v ("Activity","onStart of Second Activity");
    }

    @Override
    protected void onResume() {
        super.onResume ( );
        Log.v ("Activity","onResume of Second Activity");
    }

    @Override
    protected void onPause() {
        super.onPause ( );
        Log.v ("Activity","onPause of Second Activity");
    }

    @Override
    protected void onStop() {
        super.onStop ( );
        Log.v ("Activity","onStop of Second Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy ( );
        Log.v ("Activity","onDestroy of Second Activity");
    }
}
