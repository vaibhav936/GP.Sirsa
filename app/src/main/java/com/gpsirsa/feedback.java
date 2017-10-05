package com.gpsirsa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class feedback extends AppCompatActivity {
    ImageButton gmail,phone,facebook,whatapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);



        gmail=(ImageButton)findViewById(R.id.imageButton14);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                String aEmailList[] = { "vaibhavpandey936@gmail.com" };
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);
                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "My subject");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "My message body.");
                startActivity(emailIntent);
            }
        });

        phone=(ImageButton)findViewById(R.id.imageButton13);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+919068064102"));
                startActivity(callIntent);
            }
        });

        whatapp=(ImageButton)findViewById(R.id.imageButton12);
        whatapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number ="9068064102";
                Uri uri = Uri.parse("smsto:" + number);
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(i, ""));
            }
        });

    }


}
