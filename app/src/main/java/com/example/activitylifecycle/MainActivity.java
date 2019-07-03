package com.example.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_first);
        Log.v("Activity","onCreate() of First Activity");

        btn = findViewById (R.id.button);

        btn.setOnClickListener (this);

    }

    @Override
    protected void onRestart() {
        super.onRestart ( );
        Log.v ("Activity","onRestart of First Activity");

    }

    @Override
    protected void onStart() {
        super.onStart ( );
        Log.v ( "Activity", "onStart() of First Activity");

    }

    @Override
    protected void onResume() {
        super.onResume ( );
        Log.v ("Activity","onResume of First Activity");
    }

    @Override
    protected void onPause() {
        super.onPause ( );
        Log.v ("Activity","onPause of First Activity");
    }

    @Override
    protected void onStop() {
        super.onStop ( );
        Log.v ("Activity","onStop of First Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy ( );
        Log.v ("Activity","onDestroy of First Activity");
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent (this, SecondActivity.class);
        startActivity(i);


    }
}
