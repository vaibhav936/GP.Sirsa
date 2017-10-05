package com.gpsirsa;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.layout.simple_gallery_item;
import static android.R.layout.simple_list_item_1;
import static com.gpsirsa.R.layout.list_view;

public class question_paper extends AppCompatActivity implements android.widget.AdapterView.OnItemSelectedListener {
    Spinner spinner, spinner1, spinner2;
    private static String[] names = new String[]{"-SELECT BRANCH-", "Computer Engineering", "Electronic Engineering", "Electrical Engineering", "Civil Engineering", "Mechanical Engineering", "Agriculture Engineering"};
    public Button button1;
    private static String[] names1 = new String[]{"-SELECT SEMESTER-", "1ST", "2ND", "3RD", "4TH", "5TH", "6TH"};
    int i;
    public DownloadManager downloadManager;
    String sp1, sp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper);
        spinner();

    }

    public void spinner() {
        spinner = (Spinner) findViewById(R.id.spinner3);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                sp1 = String.valueOf(spinner.getSelectedItem());

                switch (i) {
                    case 0:
                        Toast.makeText(question_paper.this, "Please Select Any Branch", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        spinner2();
                        break;
                    case 2:
                        spinner2();
                        break;
                    case 3:
                        spinner2();
                        break;
                    case 4:
                        spinner2();
                        break;
                    case 5:
                        spinner2();
                        break;
                    case 6:
                        spinner2();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, simple_list_item_1, names);
        spinner.setAdapter(adapter);
    }

    public void spinner2() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, list_view, names1);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                sp2 = String.valueOf(spinner1.getSelectedItem());
                if (sp1 == "Computer Engineering") {
                    computer jj = new computer();
                    jj.spinner3();
                    jj.button();

                } else if (sp1 == "Electronic Engineering") {
                    electronic ee = new electronic();
                    ee.spinner3();
                    ee.button();

                } else if (sp1 == "Electrical Engineering") {
                    electrical el = new electrical();
                    el.spinner3();
                    el.button();

                } else if (sp1 == "Mechanical Engineering") {
                    mechanical mm = new mechanical();
                    mm.spinner3();
                    mm.button();

                } else if (sp1 == "Civil Engineering") {
                    civil cv =new civil();
                    cv.spinner3();
                    cv.button();

                } else if (sp1 == "Agriculture Engineering") {
                    agriculture ag = new agriculture();
                    ag.spinner3();
                    ag.button();

                } else {
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        this.i = i;
        adapterView.getItemAtPosition(i);
        switch (adapterView.getId()) {
            case R.id.spinner3:
                break;
            case R.id.spinner1:
                break;
            case R.id.spinner4:
                break;
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    class computer implements AdapterView.OnItemSelectedListener {
        // <!-spinner names subject computer branch-!>
        String[] spinnervalue = new String[]{};
        String[] c1 = new String[]{"COMMUNICATION SKILLS – I", "APPLIED MATHEMATICS - I", "APPLIED PHYSICS – I", "APPLIED CHEMISTRY-I", "ENGINEERING DRAWING – I"};
        String[] c2 = new String[]{"COMMUNICATION SKILLS – II", "APPLIED MATHEMATICS - II", "APPLIED PHYSICS – II", "APPLIED CHEMISTRY-II", "(BEE)BASIC ELECTRICAL ENGINEERING", "ANALOG ELECTRONICS – I"};
        String[] c3 = new String[]{"OPERATING SYSTEMS", "(CPI)COMPUTER PERIPHERALS AND INTERFACING", "DATA COMMUNICATION", "DIGITAL ELECTRONICS - I", "(IWD)INTERNET AND WEB DESIGNING"};
        String[] c4 = new String[]{"DATA STRUCTURES USING ‘C’", "COMPUTER ORGANIZATION", "DATABASE MANAGEMENT SYSTEM", "OBJECT ORIENTED PROGRAMMING USING C++", "(MPD)MICROPROCESSORS AND PERIPHERAL DEVICES"};
        String[] c5 = new String[]{"COMPUTER NETWORKS", "SOFTWARE ENGINEERING", "ENVIRONMENTAL EDUCATION", "(RDBMS)RELATIONAL DATABASE MANAGEMENT SYSTEM", "VISUAL BASIC", "PHP"};
        String[] c6 = new String[]{"NETWORK SECURITY", "PROGRAMMING IN JAVA", "(EDM)ENTREPRENEURSHIP DEVELOPMENT AND MANAGEMENT", "DISTRIBUTED COMPUTING"};
        private int i;
        // <!-Urls for download computer branch-!>
        String[] link = new String[]{};
        String[] c1u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904d33c68b.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904de33903.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904e878339.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905487b68e.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9055e9cefd.pdf"};
        String[] c2u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9056d481a1.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905799e44b.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905826e1be.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9058b030ab.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108d0e52597.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108cd44a05c.pdf"};
        String[] c3u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n57108d42c8b89.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108d9800f16.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108de36832a.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108d721010f.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108dc23647c.pdf"};
        String[] c4u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n57108e30e9886.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108e953f38c.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108e4eeb019.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108dfd5074f.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108e735618a.pdf"};
        String[] c5u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n57108ed34e70f.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108f6579ec9.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108eb2cbae9.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108e4eeb019.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108f0b958b3.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108f2796632.pdf",};
        String[] c6u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n57108fcf9f740.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108ff24f920.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710901a136d2.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108fa8e35ac.pdf"};


        public void spinner3() {
            spinner2 = (Spinner) findViewById(R.id.spinner4);
            spinner2.setEnabled(true);
//changing spinner value dipend on semester
            //vaibhav pandey
            if (sp1 == "Computer Engineering" && sp2 == "1ST") {
                spinnervalue = c1;

            }
            if (sp1 == "Computer Engineering" && sp2 == "2ND") {
                spinnervalue = c2;
            }
            if (sp1 == "Computer Engineering" && sp2 == "3RD") {
                spinnervalue = c3;
            }
            if (sp1 == "Computer Engineering" && sp2 == "4TH") {
                spinnervalue = c4;
            }
            if (sp1 == "Computer Engineering" && sp2 == "5TH") {
                spinnervalue = c5;
            }
            if (sp1 == "Computer Engineering" && sp2 == "6TH") {
                spinnervalue = c6;
            }
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(question_paper.this, simple_gallery_item, spinnervalue);
            spinner2.setOnItemSelectedListener(this);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter2);
        }

        public void download() {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(link[i]));
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

        public void button() {
            button1 = (Button) findViewById(R.id.button14);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (sp2 == "1ST") {
                                link = c1u;
                                download();

                            } else if (sp2 == "2ND") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = c2u;
                                download();

                            } else if (sp2 == "3RD") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = c3u;
                                download();
                            } else if (sp2 == "4TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = c4u;
                                download();
                            } else if (sp2 == "5TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = c5u;
                                download();
                            } else if (sp2 == "6TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = c6u;
                                download();
                            } else {
                            }
                        }
                    }
            );
        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            this.i = i;
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class electronic implements AdapterView.OnItemSelectedListener {
        // <!-spinner names subject electronic branch-!>
        String[] spinnervalue = new String[]{};
        String[] e1 = new String[]{"COMMUNICATION SKILLS – I", "APPLIED MATHEMATICS - I", "APPLIED PHYSICS – I", "APPLIED CHEMISTRY-I", "ENGINEERING DRAWING – I"};
        String[] e2 = new String[]{"COMMUNICATION SKILLS – II", "APPLIED MATHEMATICS - II", "APPLIED PHYSICS – II", "APPLIED CHEMISTRY-II", "BASIC ELECTRICAL ENGINEERING", "ANALOG ELECTRONICS – I"};
        String[] e3 = new String[]{"ANALOG ELECTRONICS - II", "(CPA)COMPUTER PROGRAMMING AND APPLICATIONS", "(PCE)PRINCIPLES OF COMMUNICATION ENGINEERING", "DIGITAL ELECTRONICS - I", "(EIAM)ELECTRONIC INSTRUMENTS AND MEASUREMENT", "ELECTRICAL MACHINES"};
        String[] e4 = new String[]{"(NFTL)NETWORK FILTERS AND TRANSMISSION LINES", "INSTRUMENTATION", "DIGITAL ELECTRONICS - II", "(MPD)MICROPROCESSORS AND PERIPHERAL DEVICES"};
        String[] e5 = new String[]{"CONSUMER ELECTRONICS", "OPTICAL FIBER COMMUNICATION", "MICROWAVE AND RADAR ENGINEERING", "POWER ELECTRONICS", "ENVIRONMENTAL EDUCATION"};
        String[] e6 = new String[]{"MAINTENANCE OF COMPUTER SYSTEM", "WIRELESS AND MOBILE COMMUNICATION", "MEDICAL ELECTRONICS", "VLSI SYSTEM DESIGN", "(EDM)ENTREPRENEURSHIP DEVELOPMENT AND MANAGEMENT"};
        private int i;
        // <!-Urls for download electronic branch-!>
        String[] link = new String[]{};
        String[] e1u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904d33c68b.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904de33903.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904e878339.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905487b68e.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9055e9cefd.pdf"};
        String[] e2u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9056d481a1.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905799e44b.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905826e1be.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9058b030ab.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108d0e52597.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108cd44a05c.pdf"};
        String[] e3u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710927eacc38.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710930a623f7.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57109398c3223.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571092da3e55b.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710934b36a90.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710932e50ff0.pdf"};
        String[] e4u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n57109369f1152.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571093c3693ee.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571093ef36248.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108e735618a.pdf"};
        String[] e5u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710949ead18f.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571094e051491.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710949ead18f.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57109502979d9.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108eb2cbae9.pdf"};
        String[] e6u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710959ae33a6.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710953139187.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710955810607.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710901a136d2.pdf"};


        public void spinner3() {
            spinner2 = (Spinner) findViewById(R.id.spinner4);
            spinner2.setEnabled(true);
//changing spinner value dipend on semester
            //vaibhav pandey
            if (sp1 == "Electronic Engineering" && sp2 == "1ST") {
                spinnervalue = e1;

            }
            if (sp1 == "Electronic Engineering" && sp2 == "2ND") {
                spinnervalue = e2;
            }
            if (sp1 == "Electronic Engineering" && sp2 == "3RD") {
                spinnervalue = e3;
            }
            if (sp1 == "Electronic Engineering" && sp2 == "4TH") {
                spinnervalue = e4;
            }
            if (sp1 == "Electronic Engineering" && sp2 == "5TH") {
                spinnervalue = e5;
            }
            if (sp1 == "Electronic Engineering" && sp2 == "6TH") {
                spinnervalue = e6;
            }
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(question_paper.this, simple_gallery_item, spinnervalue);
            spinner2.setOnItemSelectedListener(this);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter2);
        }

        public void download() {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(link[i]));
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

        public void button() {
            button1 = (Button) findViewById(R.id.button14);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (sp2 == "1ST") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = e1u;
                                download();

                            } else if (sp2 == "2ND") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = e2u;
                                download();

                            } else if (sp2 == "3RD") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = e3u;
                                download();
                            } else if (sp2 == "4TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = e4u;
                                download();
                            } else if (sp2 == "5TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = e5u;
                                download();
                            } else if (sp2 == "6TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = e6u;
                                download();
                            } else {
                            }
                        }
                    }
            );
        }


        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            this.i = i;
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class electrical implements AdapterView.OnItemSelectedListener {
        // <!-spinner names subject Electrical branch-!>
        String[] spinnervalue = new String[]{};
        String[] el1 = new String[]{"COMMUNICATION SKILLS – I", "APPLIED MATHEMATICS - I", "APPLIED PHYSICS – I", "APPLIED CHEMISTRY-I", "ENGINEERING DRAWING – I"};
        String[] el2 = new String[]{"COMMUNICATION SKILLS – II", "APPLIED MATHEMATICS - II", "APPLIED PHYSICS – II", "APPLIED CHEMISTRY-II", "FUNDAMENTALS OF ELECTRICAL ENGINEERING", "ENGINEERING DRAWING – II"};
        String[] el3 = new String[]{"(EEEM)ELECTRICAL AND ELECTRONICS ENGINEERING MATERIALS", "(EMAMI)ELECTRICAL MEASUREMENTS AND MEASURING INSTRUMENTS", "ELECTRONICS - I", "COMPUTER PROGRAMMING AND APPLICATIONS", "(EEDM)ELECTRICAL ENGINEERING DESIGN AND DRAWING - I"};
        String[] el4 = new String[]{"ELECTRICAL MACHINES - I", "ENERGY SOURCES AND MANAGEMENT OF ELECTRICAL ENERGY", "ELECTRONICS-II", "ELECTRICAL ENGINEERING DESIGN AND DRAWING - II", "INSTRUMENTATION", "(EACEE)ESTIMATING AND COSTING IN ELECTRICAL ENGINEERING"};
        String[] el5 = new String[]{"ELECTRICAL MACHINES-II", "ELECTRICAL POWER –I", "INDUSTRIAL ELECTRONICS AND CONTROL OF DRIVES", "DIGITAL ELECTRONICS AND MICROPROCESSORS", "ENVIRONMENTAL EDUCATION"};
        String[] el6 = new String[]{"UTILIZATION OF ELECTRICAL ENERGY", "ELECTRICAL POWER-II", "ENERGY MANAGEMENT", "OPTICAL FIBER COMMUNICATION", "INSTALLATION AND MAINTENANCE OF ELECTRICAL EQUIPMENT"};
        private int i;
        // <!-Urls for download Electrical branch-!>
        String[] link = new String[]{};
        String[] el1u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904d33c68b.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904de33903.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904e878339.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n571095f31bcac.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9055e9cefd.pdf"};//ed 2 krni hhh///////gdfhjdf
        String[] el2u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9056d481a1.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905799e44b.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905826e1be.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9058b030ab.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108d0e52597.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108cd44a05c.pdf"};
        String[] el3u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n571096673c5c2.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571096880a15e.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571096b57c58b.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571096ec29ed9.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571096d19f888.pdf"};
        String[] el4u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n57109718c7c81.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571097517e0ac.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571097a5118b9.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710978193529.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571097e0aa675.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571097c5bb394.pdf"};
        String[] el5u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n57109808e4252.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710984016161.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710985d1f713.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57109890369f9.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108eb2cbae9.pdf"};
        String[] el6u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n571098ab504d0.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571098f3118f8.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710991750aa1.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571099327da2c.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710995734a44.pdf"};


        public void spinner3() {
            spinner2 = (Spinner) findViewById(R.id.spinner4);
            spinner2.setEnabled(true);
//changing spinner value dipend on semester
            //vaibhav pandey
            if (sp1 == "Electrical Engineering" && sp2 == "1ST") {
                spinnervalue = el1;

            }
            if (sp1 == "Electrical Engineering" && sp2 == "2ND") {
                spinnervalue = el2;
            }
            if (sp1 == "Electrical Engineering" && sp2 == "3RD") {
                spinnervalue = el3;
            }
            if (sp1 == "Electrical Engineering" && sp2 == "4TH") {
                spinnervalue = el4;
            }
            if (sp1 == "Electrical Engineering" && sp2 == "5TH") {
                spinnervalue = el5;
            }
            if (sp1 == "Electrical Engineering" && sp2 == "6TH") {
                spinnervalue = el6;
            }
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(question_paper.this, simple_gallery_item, spinnervalue);
            spinner2.setOnItemSelectedListener(this);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter2);
        }

        public void download() {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(link[i]));
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

        public void button() {
            button1 = (Button) findViewById(R.id.button14);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (sp2 == "1ST") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = el1u;
                                download();

                            } else if (sp2 == "2ND") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = el2u;
                                download();

                            } else if (sp2 == "3RD") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = el3u;
                                download();
                            } else if (sp2 == "4TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = el4u;
                                download();
                            } else if (sp2 == "5TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = el5u;
                                download();
                            } else if (sp2 == "6TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = el6u;
                                download();
                            } else {
                            }
                        }
                    }
            );
        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            this.i = i;
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class mechanical implements AdapterView.OnItemSelectedListener {
        // <!-spinner names subject Electrical branch-!>
        String[] spinnervalue = new String[]{};
        String[] m1 = new String[]{"COMMUNICATION SKILLS – I", "APPLIED MATHEMATICS - I", "APPLIED PHYSICS – I", "APPLIED CHEMISTRY-I", "ENGINEERING DRAWING – I"};
        String[] m2 = new String[]{"COMMUNICATION SKILLS – II", "APPLIED MATHEMATICS - II", "APPLIED PHYSICS – II", "APPLIED CHEMISTRY-II", "FUNDAMENTALS OF ELECTRICAL ENGINEERING", "ENGINEERING DRAWING – II"};
        String[] m3 = new String[]{"STRENGTH OF MATERIALS", "THERMODYNAMICS", "BASICS OF ELECTRICAL AND ELECTRONICS ENGINEERING", "WORKSHOP TECHNOLOGY-1", "MACHINE DRAWING"};
        String[] m4 = new String[]{"MATERIALS AND METALLURGY", "HYDRAULICS AND HYDRAULIC MACHINES", "I.C. ENGINES", "MACHINE DESIGN AND DRAWING", "WORKSHOP TECHNOLOGY-II"};
        String[] m5 = new String[]{"THEORY OF MACHINES", "REFRIGERATION AND AIR CONDITIONING", "WORKSHOP TECHNOLOGY - III", "ENVIRONMENTAL EDUCATION"};
        String[] m6 = new String[]{"AUTOMOBILE ENGINEERING", "INSPECTION AND QUALITY CONTROL", "INDUSTRIAL ENGINEERING", "(EDM)ENTREPRENEURSHIP DEVELOPMENT AND MANAGEMENT"};
        private int i;
        // <!-Urls for download Electrical branch-!>
        String[] link = new String[]{};
        String[] m1u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904d33c68b.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904de33903.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904e878339.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n571095f31bcac.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9055e9cefd.pdf"};//ed 2 krni hhh///////gdfhjdf
        String[] m2u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9056d481a1.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905799e44b.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905826e1be.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9058b030ab.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108d0e52597.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108cd44a05c.pdf"};
        String[] m3u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a50b2b3fc.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a528ced7c.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571096673c5c2.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a54615eee.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a563989cd.pdf"};
        String[] m4u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a58f3c5d6.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a57a7370b.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a5b22db87.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a5ef3f07e.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a5d0d57da.pdf"};
        String[] m5u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a66046170.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a61250e0d.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a632e92da.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108eb2cbae9.pdf"};
        String[] m6u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a6eb65c64.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a6c967aa0.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a69db2b20.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710901a136d2.pdf"};


        public void spinner3() {
            spinner2 = (Spinner) findViewById(R.id.spinner4);
            spinner2.setEnabled(true);
//changing spinner value dipend on semester
            //vaibhav pandey
            if (sp1 == "Mechanical Engineering" && sp2 == "1ST") {
                spinnervalue = m1;

            }
            if (sp1 == "Mechanical Engineering" && sp2 == "2ND") {
                spinnervalue = m2;
            }
            if (sp1 == "Mechanical Engineering" && sp2 == "3RD") {
                spinnervalue = m3;
            }
            if (sp1 == "Mechanical Engineering" && sp2 == "4TH") {
                spinnervalue = m4;
            }
            if (sp1 == "Mechanical Engineering" && sp2 == "5TH") {
                spinnervalue = m5;
            }
            if (sp1 == "Mechanical Engineering" && sp2 == "6TH") {
                spinnervalue = m6;
            }
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(question_paper.this, simple_gallery_item, spinnervalue);
            spinner2.setOnItemSelectedListener(this);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter2);
        }

        public void download() {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(link[i]));
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

        public void button() {
            button1 = (Button) findViewById(R.id.button14);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (sp2 == "1ST") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = m1u;
                                download();

                            } else if (sp2 == "2ND") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = m2u;
                                download();

                            } else if (sp2 == "3RD") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = m3u;
                                download();
                            } else if (sp2 == "4TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = m4u;
                                download();
                            } else if (sp2 == "5TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = m5u;
                                download();
                            } else if (sp2 == "6TH") {
                                Toast.makeText(question_paper.this,"Downloading Start", Toast.LENGTH_LONG).show();
                                link = m6u;
                                download();
                            } else {
                            }
                        }
                    }
            );
        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            this.i = i;
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

    class civil implements AdapterView.OnItemSelectedListener {
        // <!-spinner names subject civil branch-!>
        String[] spinnervalue = new String[]{};
        String[] cv1 = new String[]{"COMMUNICATION SKILLS – I", "APPLIED MATHEMATICS - I", "APPLIED PHYSICS – I", "APPLIED CHEMISTRY-I", "ENGINEERING DRAWING – I"};
        String[] cv2 = new String[]{"COMMUNICATION SKILLS – II", "APPLIED MATHEMATICS - II", "APPLIED PHYSICS – II", "APPLIED CHEMISTRY-II", "ENGINEERING DRAWING – II"};
        String[] cv3 = new String[]{"FLUID MECHANICS", "SURVEYING - I", "CONSTRUCTION MATERIALS", "WORKSHOP TECHNOLOGY-1", "MACHINE DRAWING"};
        String[] cv4 = new String[]{"MATERIALS AND METALLURGY", "HYDRAULICS AND HYDRAULIC MACHINES", "I.C. ENGINES", "MACHINE DESIGN AND DRAWING", "WORKSHOP TECHNOLOGY-II"};
        String[] cv5 = new String[]{"THEORY OF MACHINES", "REFRIGERATION AND AIR CONDITIONING", "WORKSHOP TECHNOLOGY - III", "ENVIRONMENTAL EDUCATION"};
        String[] cv6 = new String[]{"AUTOMOBILE ENGINEERING", "INSPECTION AND QUALITY CONTROL", "INDUSTRIAL ENGINEERING", "(EDM)ENTREPRENEURSHIP DEVELOPMENT AND MANAGEMENT"};
        private int i;
        // <!-Urls for download civil branch-!>
        String[] link = new String[]{};
        String[] cv1u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904d33c68b.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904de33903.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904e878339.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n571095f31bcac.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9055e9cefd.pdf"};//ed 2 krni hhh///////gdfhjdf
        String[] cv2u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9056d481a1.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905799e44b.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905826e1be.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9058b030ab.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108cd44a05c.pdf"};
        String[] cv3u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a50b2b3fc.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a528ced7c.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571096673c5c2.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a54615eee.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a563989cd.pdf"};
        String[] cv4u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a58f3c5d6.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a57a7370b.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a5b22db87.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a5ef3f07e.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a5d0d57da.pdf"};
        String[] cv5u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a66046170.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a61250e0d.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a632e92da.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108eb2cbae9.pdf"};
        String[] cv6u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a6eb65c64.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a6c967aa0.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a69db2b20.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710901a136d2.pdf"};


        public void spinner3() {
            spinner2 = (Spinner) findViewById(R.id.spinner4);
//changing spinner value dipend on semester
            //vaibhav pandey
            if (sp1 == "Civil Engineering" && sp2 == "1ST") {
                spinnervalue = cv1;
                spinner2.setEnabled(true);
            }
            if (sp1 == "Civil Engineering" && sp2 == "2ND") {
                spinnervalue = cv2;
                spinner2.setEnabled(true);
            }
            if (sp1 == "Civil Engineering" && sp2 == "3RD") {
                spinner2.setEnabled(false);
                //spinnervalue = cv3;
            }
            if (sp1 == "Civil Engineering" && sp2 == "4TH") {
                spinner2.setEnabled(false);
                //  spinnervalue = cv4;
            }
            if (sp1 == "Civil Engineering" && sp2 == "5TH") {
                spinner2.setEnabled(false);
                // spinnervalue = cv5;
            }
            if (sp1 == "Civil Engineering" && sp2 == "6TH") {
                spinner2.setEnabled(false);
                // spinnervalue = cv6;
            }
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(question_paper.this, simple_gallery_item, spinnervalue);
            spinner2.setOnItemSelectedListener(this);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter2);
        }

        public void download() {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(link[i]));
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

        public void button() {
            button1 = (Button) findViewById(R.id.button14);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (sp2 == "1ST") {
                                link = cv1u;
                                download();

                            } else if (sp2 == "2ND") {
                                link = cv2u;
                                download();

                            } else if (sp2 == "3RD") {
                                Toast.makeText(question_paper.this, "Sorry Not Available", Toast.LENGTH_SHORT).show();
                                spinner2.setEnabled(false);
                               // link = cv3u;
                               // download();
                            } else if (sp2 == "4TH") {
                                Toast.makeText(question_paper.this, "Sorry Not Available", Toast.LENGTH_SHORT).show();
                                link = cv4u;
                               // download();
                            } else if (sp2 == "5TH") {
                                Toast.makeText(question_paper.this, "Sorry Not Available", Toast.LENGTH_SHORT).show();
                                link = cv5u;
                               // download();
                            } else if (sp2 == "6TH") {
                                Toast.makeText(question_paper.this, "Sorry Not Available", Toast.LENGTH_SHORT).show();
                                link = cv6u;
                               // download();
                            } else {
                            }
                        }
                    }
            );
        }


        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            this.i = i;
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }



    class agriculture implements AdapterView.OnItemSelectedListener {
        // <!-spinner names subject civil branch-!>
        String[] spinnervalue = new String[]{};
        String[] ag1 = new String[]{"COMMUNICATION SKILLS – I", "APPLIED MATHEMATICS - I", "APPLIED PHYSICS – I", "APPLIED CHEMISTRY-I", "ENGINEERING DRAWING – I"};
        String[] ag2 = new String[]{"COMMUNICATION SKILLS – II", "APPLIED MATHEMATICS - II", "APPLIED PHYSICS – II", "APPLIED CHEMISTRY-II", "ENGINEERING DRAWING – II"};
        String[] ag3 = new String[]{"FLUID MECHANICS", "SURVEYING - I", "CONSTRUCTION MATERIALS", "WORKSHOP TECHNOLOGY-1", "MACHINE DRAWING"};
        String[] ag4 = new String[]{"MATERIALS AND METALLURGY", "HYDRAULICS AND HYDRAULIC MACHINES", "I.C. ENGINES", "MACHINE DESIGN AND DRAWING", "WORKSHOP TECHNOLOGY-II"};
        String[] ag5 = new String[]{"THEORY OF MACHINES", "REFRIGERATION AND AIR CONDITIONING", "WORKSHOP TECHNOLOGY - III", "ENVIRONMENTAL EDUCATION"};
        String[] ag6 = new String[]{"AUTOMOBILE ENGINEERING", "INSPECTION AND QUALITY CONTROL", "INDUSTRIAL ENGINEERING", "(EDM)ENTREPRENEURSHIP DEVELOPMENT AND MANAGEMENT"};
        private int i;
        // <!-Urls for download civil branch-!>
        String[] link = new String[]{};
        String[] ag1u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904d33c68b.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904de33903.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f904e878339.pdf", "https://myfirstappdotblog.files.wordpress.com/2017/09/n571095f31bcac.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9055e9cefd.pdf"};//ed 2 krni hhh///////gdfhjdf
        String[] ag2u = new String[]{"https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9056d481a1.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905799e44b.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f905826e1be.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n56f9058b030ab.pdf",
                "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108cd44a05c.pdf"};
        String[] ag3u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a50b2b3fc.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a528ced7c.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n571096673c5c2.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a54615eee.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a563989cd.pdf"};
        String[] ag4u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a58f3c5d6.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a57a7370b.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a5b22db87.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a5ef3f07e.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a5d0d57da.pdf"};
        String[] ag5u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a66046170.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a61250e0d.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a632e92da.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n57108eb2cbae9.pdf"};
        String[] ag6u = new String[]
                {"https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a6eb65c64.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a6c967aa0.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710a69db2b20.pdf",
                        "https://myfirstappdotblog.files.wordpress.com/2017/09/n5710901a136d2.pdf"};


        public void spinner3() {
            spinner2 = (Spinner) findViewById(R.id.spinner4);
//changing spinner value dipend on semester
            //vaibhav pandey
            if (sp1 == "Agriculture Engineering" && sp2 == "1ST") {
                spinnervalue = ag1;
                spinner2.setEnabled(true);
            }
            if (sp1 == "Agriculture Engineering" && sp2 == "2ND") {
                spinnervalue = ag2;
                spinner2.setEnabled(true);
            }
            if (sp1 == "Agriculture Engineering" && sp2 == "3RD") {
                spinner2.setEnabled(false);
                //spinnervalue = cv3;
            }
            if (sp1 == "Agriculture Engineering" && sp2 == "4TH") {
                spinner2.setEnabled(false);
                //  spinnervalue = cv4;
            }
            if (sp1 == "Agriculture Engineering" && sp2 == "5TH") {
                spinner2.setEnabled(false);
                // spinnervalue = cv5;
            }
            if (sp1 == "Agriculture Engineering" && sp2 == "6TH") {
                spinner2.setEnabled(false);
                // spinnervalue = cv6;
            }
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(question_paper.this, simple_gallery_item, spinnervalue);
            spinner2.setOnItemSelectedListener(this);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            spinner2.setAdapter(dataAdapter2);
        }

        public void download() {
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri = Uri.parse(String.valueOf(link[i]));
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference = downloadManager.enqueue(request);
        }

        public void button() {
            button1 = (Button) findViewById(R.id.button14);
            button1.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (sp2 == "1ST") {
                                link = ag1u;
                                download();

                            } else if (sp2 == "2ND") {
                                link = ag2u;
                                download();

                            } else if (sp2 == "3RD") {
                                Toast.makeText(question_paper.this, "Sorry Not Available", Toast.LENGTH_SHORT).show();
                                spinner2.setEnabled(false);
                                link = ag3u;
                               //  download();
                            } else if (sp2 == "4TH") {
                                Toast.makeText(question_paper.this, "Sorry Not Available", Toast.LENGTH_SHORT).show();
                                link = ag4u;
                                //download();
                            } else if (sp2 == "5TH") {
                                Toast.makeText(question_paper.this, "Sorry Not Available", Toast.LENGTH_SHORT).show();
                                link = ag5u;
                                //download();
                            } else if (sp2 == "6TH") {
                                Toast.makeText(question_paper.this, "Sorry Not Available", Toast.LENGTH_SHORT).show();
                                link = ag6u;
                               // download();
                            } else {
                            }
                        }
                    }
            );
        }


        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            this.i = i;
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}
