package com.gpsirsa;

import android.app.DownloadManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import static com.gpsirsa.R.layout.list_view;

public class syllabus_page extends  AppCompatActivity implements android.widget.AdapterView.OnItemSelectedListener  {


    public Button button;
    //public Button button1;
    Spinner spinner;
    private static String[] names= new String[] {"-SELECT BRANCH-","Computer Engineering","Electronic Engineering","Electrical Engineering","Civil Engineering","Mechanical Engineering","Agriculture Engineering"};
    int i;
    public DownloadManager downloadManager;
    Spinner spinner1;
    private static String[] names1= new String[] {"-SELECT SEMESTER-","1ST","2ND","3RD","4TH","5TH","6TH"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_page);
        spinner();
        //select_c();
    }

    public void spinner()
    {
        spinner = (Spinner)findViewById(R.id.spinner3);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        Toast.makeText(syllabus_page.this,"Please Select Any Branch", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        computer cc =new computer();
                        cc.button();
                        spinner2();
                        break;
                    case 2:
                        electronic ec =new electronic();
                        ec.button();
                        spinner2();
                        break;
                    case 3:
                        electrical ee =new electrical();
                        ee.button();
                        spinner2();
                        break;
                    case 4:
                        civil cl =new civil();
                        cl.button();
                        spinner2();
                        break;
                    case 5:
                        mechanical me =new mechanical();
                        me.button();
                        spinner2();
                        break;
                    case 6:
                        agriculture ag=new agriculture();
                        ag.button();
                        spinner2();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_gallery_item,names);
        spinner.setAdapter(adapter);
    }
    public void spinner2()
    {
        spinner1 = (Spinner)findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,list_view,names1);
        spinner1.setAdapter(adapter1);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        this.i =i;
       adapterView.getItemAtPosition(i);
        switch (adapterView.getId())
        {
            case R.id.spinner3:
                break;
            case R.id.spinner1:
                break;
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {


    }


     class computer {
         String[] copl = new String[] {"www.google.com","https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-1.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-2.pdf","https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-3.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-4.pdf","https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-5.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-6.pdf"};
        Button button1;
        public void button()
        {
            button1= (Button)findViewById(R.id.button6);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            if(i==0)
                            {
                                Toast.makeText(syllabus_page.this,"Please Select Any Semester", Toast.LENGTH_SHORT).show();

                            }
                            else if(i==1){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==2){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==3){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==4){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==5){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==6) {
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else {
                                Toast.makeText(syllabus_page.this,"yha bhi nhi kiya kuch re", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
            );
        }
        public void sl()
        {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(copl[i]));
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }


    }



    class electronic {
         String[] elcl = new String[] {"www.google","https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-11.pdf","https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-21.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-31.pdf","https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-41.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-51.pdf","https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-61.pdf"};
         Button button1;
        public void  button()
        {
            button1= (Button)findViewById(R.id.button6);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            if(i==0)
                            {
                                Toast.makeText(syllabus_page.this,"Please Select Any Semester", Toast.LENGTH_SHORT).show();

                            }
                            else if(i==1){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==2){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==3){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==4){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==5){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==6) {
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else {
                                Toast.makeText(syllabus_page.this,"yha bhi nhi kiya kuch re", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
            );
        }
        public void sl()
        {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(elcl[i]));
            //Toast.makeText(syllabus_page.this,String.valueOf(copl[i]),Toast.LENGTH_LONG).show();
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

    }

    class electrical {
        String[] electrical = new String[] {"www.google",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-12.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-22.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-32.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-42.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-52.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-62.pdf"};
        Button button1;
        public void  button()
        {
            button1= (Button)findViewById(R.id.button6);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            if(i==0)
                            {
                                Toast.makeText(syllabus_page.this,"Please Select Any Semester", Toast.LENGTH_SHORT).show();

                            }
                            else if(i==1){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==2){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==3){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==4){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==5){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==6) {
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else {
                                Toast.makeText(syllabus_page.this,"yha bhi nhi kiya kuch re", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
            );
        }
        public void sl()
        {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(electrical[i]));
            //Toast.makeText(syllabus_page.this,String.valueOf(copl[i]),Toast.LENGTH_LONG).show();
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

    }

    class civil {
        String[] civil = new String[] {"www.google",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-13.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-23.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-33.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-43.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-53.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-63.pdf"};
        Button button1;
        public void  button()
        {
            button1= (Button)findViewById(R.id.button6);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            if(i==0)
                            {
                                Toast.makeText(syllabus_page.this,"Please Select Any Semester", Toast.LENGTH_SHORT).show();

                            }
                            else if(i==1){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==2){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==3){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==4){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==5){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==6) {
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else {
                                Toast.makeText(syllabus_page.this,"yha bhi nhi kiya kuch re", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
            );
        }
        public void sl()
        {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(civil[i]));
            //Toast.makeText(syllabus_page.this,String.valueOf(copl[i]),Toast.LENGTH_LONG).show();
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

    }

    class mechanical {
        String[] mechanical = new String[] {"www.google",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-14.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-24.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-34.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-44.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-54.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-64.pdf"};
        Button button1;
        public void  button()
        {
            button1= (Button)findViewById(R.id.button6);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            if(i==0)
                            {
                                Toast.makeText(syllabus_page.this,"Please Select Any Semester", Toast.LENGTH_SHORT).show();

                            }
                            else if(i==1){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==2){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==3){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==4){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==5){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==6) {
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else {
                                Toast.makeText(syllabus_page.this,"yha bhi nhi kiya kuch re", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
            );
        }
        public void sl()
        {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(mechanical[i]));
            //Toast.makeText(syllabus_page.this,String.valueOf(copl[i]),Toast.LENGTH_LONG).show();
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

    }

    class agriculture {
        String[] agriculture = new String[] {"www.google",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-15.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-25.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-35.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-45.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-55.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/08/detailed-content-sem-65.pdf"};
        Button button1;
        public void  button()
        {
            button1= (Button)findViewById(R.id.button6);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            if(i==0)
                            {
                                Toast.makeText(syllabus_page.this,"Please Select Any Semester", Toast.LENGTH_SHORT).show();

                            }
                            else if(i==1){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==2){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==3){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==4){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==5){
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else if(i==6) {
                                sl();
                                Toast.makeText(syllabus_page.this,"Downloading Start", Toast.LENGTH_LONG).show();
                            }
                            else {
                                Toast.makeText(syllabus_page.this,"yha bhi nhi kiya kuch re", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
            );
        }
        public void sl()
        {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(agriculture[i]));
            //Toast.makeText(syllabus_page.this,String.valueOf(copl[i]),Toast.LENGTH_LONG).show();
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

    }


}

