package com.gpsirsa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class downloads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.downloads);
    }


    public void Syllabus(View view) {
        Intent intent =new Intent(downloads.this,syllabus_page.class);
        startActivity(intent);
    }
    public void paper(View view) {
        Intent intent =new Intent(downloads.this,question_paper.class);
        startActivity(intent);
    }



}
