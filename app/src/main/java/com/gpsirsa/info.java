package com.gpsirsa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public void fees(View view) {
        Intent intent =new Intent(info.this,fees.class);
        startActivity(intent);
    }
    public void admission(View view) {
        Intent intent =new Intent(info.this,admission.class);
        startActivity(intent);
    }
    public void placement(View view) {
        Intent intent =new Intent(info.this,placement.class);
        startActivity(intent);
    }
    public void scholarship(View view) {
        Intent intent =new Intent(info.this,scholarship.class);
        startActivity(intent);
    }

}


