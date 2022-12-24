package com.example.bartimageswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bartIsShowing;

    public void fade(View view){
        Log.i("Info","image pressed");
        ImageView bart1=(ImageView) findViewById(R.id.imageView);
        ImageView bart2=(ImageView)findViewById(R.id.imageView2);

        if(bartIsShowing) {
            bartIsShowing=false;
            bart1.animate().alpha(0).setDuration(2000);
            bart2.animate().alpha(1).setDuration(2000);

        }else{
            bartIsShowing=true;
            bart1.animate().alpha(1).setDuration(2000);
            bart2.animate().alpha(0).setDuration(2000);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}