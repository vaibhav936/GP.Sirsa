package com.gpsirsa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    TextView Result,Message;
  String title;
    String SELECT_SQL = "SELECT * FROM Noti";
    Cursor c;
    private SQLiteDatabase db;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // DataBaseHelper mydb;

        super.onCreate(savedInstanceState);
        LocalBroadcastManager.getInstance(this).registerReceiver(mHandler,new IntentFilter("com.gpsirsa_FCM"));
        setContentView(R.layout.home);
       // openDatabase();
       // isOnline();
        isNetworkConnectionAvailable();
       // mydb = new DataBaseHelper(this);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        Result =(TextView)findViewById(R.id.textView32);
        Message =(TextView)findViewById(R.id.textView33);
        //data base coding
        /*boolean is=mydb.insertData(Result.getText().toString(),Message.getText().toString());
        if(is==true)
            Toast.makeText(Home.this," ",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(Home.this," ",Toast.LENGTH_LONG).show();

        c = db.rawQuery(SELECT_SQL, null);
        c.moveToFirst();
        showRecords();*/
      //  c = db.rawQuery(SELECT_SQL, null);
      //  c.moveToFirst();
        ///update code

     /*  boolean isUpdate = mydb.updateProfile(Result.getText().toString(),Message.getText().toString());
        if(isUpdate == true) {
            Toast.makeText(getBaseContext(), "Update Success", Toast.LENGTH_LONG).show();
            c = db.rawQuery(SELECT_SQL, null);
            c.moveToFirst();
            showRecords();
            //finish();
        }
        else
        {
            Toast.makeText(getBaseContext(), "Data Not Updated", Toast.LENGTH_LONG).show();
        }
*/


///updte code finished

        //animation coding start here :)  vaibhav pandey
       // TextView textViewMarqToLeft = (TextView) findViewById(R.id.textView12);

       // String textLeft = "Left marquue";
      //  Title.setText(textLeft);

        // TextView textViewMarqToLeft = (TextView) findViewById(R.id.textView12);
        

        if(getIntent().getExtras()!=null)
        {
            for(String key : getIntent().getExtras().keySet())
            {
                if(key.equals("title"))
                    Result.setText(getIntent().getExtras().getString(key));
                else if(key.equals("message"))
                    Message.setText(getIntent().getExtras().getString(key));
            }
        }
     /*   sharedPreferences = getSharedPreferences("save", Context.MODE_PRIVATE);
       Result.setText(sharedPreferences.getString("sandesh",title));

       SharedPreferences.Editor editor = sharedPreferences.edit();
      editor.putString("sandesh",title);
       editor.apply();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("sandesh",title);
        editor.apply();

*/
       // sharedPreferences = getSharedPreferences("title",Context.MODE_PRIVATE);
     //  Result.setText(sharedPreferences.getString("title","hiii"));
      //  String data=String.valueOf(Result.getText());
       // Result.setText(data);


      /*  SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("title",String.valueOf(Result.getText()));
        editor.apply();*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.menu_main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about1:
                Intent intent = new Intent(this,about_app.class);
                startActivity(intent);
                return true;
            case R.id.email:
                Intent i = new Intent(this,feedback.class);
                startActivity(i);
                return true;
        }


        return true;
    }


    private void showRecords() {
        String id = c.getString(0);
        String name = c.getString(1);
        Toast.makeText(Home.this,id,Toast.LENGTH_LONG).show();
        Toast.makeText(Home.this,name,Toast.LENGTH_LONG).show();
    }
    public void notification(View view) {
        Intent intent =new Intent(Home.this,notification.class);
        startActivity(intent);

    }

    public void downloads(View view) {
        Intent intent =new Intent(Home.this,downloads.class);
        startActivity(intent);
    }
    public void contact(View view) {
        Intent intent =new Intent(Home.this,Contact.class);
        startActivity(intent);
    }
    public void info(View view) {
        Intent intent =new Intent(Home.this,info.class);
        startActivity(intent);
    }
    public void app_info(View view) {
        Intent intent =new Intent(Home.this,about_app.class);
        startActivity(intent);
    }


   private BroadcastReceiver mHandler = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            String title =intent.getStringExtra("title");
            String message =intent.getStringExtra("message");




              Result.setText(title);
            Message.setText(message);
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
    LocalBroadcastManager.getInstance(this).unregisterReceiver(mHandler);
    }
   /* protected void openDatabase() {
        db = openOrCreateDatabase("Gps.db", Context.MODE_PRIVATE, null);
    }*/
  /* public boolean isOnline() {
       ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
       NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

       if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
           Toast.makeText(Home.this, "No Internet connection!", Toast.LENGTH_LONG).show();
           return false;
       }
       return true;
   }
*/

    public void checkNetworkConnection(){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle("No internet Connection");
       // builder.setIcon(R.drawable.icongp);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setCancelable(false);
        builder.setMessage("Please turn on internet connection to see content");
        builder.setNegativeButton("GO TO SETTINGS", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivityForResult(new Intent(Settings.ACTION_WIRELESS_SETTINGS), 0);
              //  dialog.dismiss();
              finish();

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public boolean isNetworkConnectionAvailable(){
        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnected();
        if(isConnected) {
           // Toast.makeText(Home.this, "is connectied", Toast.LENGTH_LONG).show();
            Log.d("Network", "Connected");
            return true;
        }
        else{
            checkNetworkConnection();
           // .setEnabled(false);
           // Toast.makeText(Home.this, "else chla h", Toast.LENGTH_LONG).show();
            Log.d("Network","Not Connected");
            return false;
        }
    }

}
