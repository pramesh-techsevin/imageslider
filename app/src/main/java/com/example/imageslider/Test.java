package com.example.imageslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;

import com.jsibbold.zoomage.ZoomageView;


public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        ZoomageView imageZoom = (ZoomageView) findViewById(R.id.myZoomageView);

    }
}
