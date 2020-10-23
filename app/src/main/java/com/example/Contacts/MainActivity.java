package com.example.Contacts;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.Contacts.ContactsDatabase.RegionInfoEntry;
import com.example.Contacts.ContactsDatabase.ZoneInfoEntry;
import com.example.Contacts.ContactsDatabase.DistrictInfoEntry;

import java.util.List;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener{

    // private AppBarConfiguration mAppBarConfiguration;

    Spinner RegionSP, ZoneSP, DistrictSP,ActorSP;
    TextView FullName,Location, Position, PhoneNo;
    ImageButton Btn_Call,BtnSms;
    Button Btn_CheckList,BulkEmail,BtnInfo;

    private ContactsOpenHelper mDbOpenHelper;
 private SimpleCursorAdapter mAdaptorRegion;
 private SimpleCursorAdapter mAdaptorZone;
    private SimpleCursorAdapter mAdaptorDistrict;
    private SimpleCursorAdapter mAdaptorActor;

    @Override
 protected void onDestroy() {
  mDbOpenHelper.close();
  super.onDestroy();
 }


 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDbOpenHelper = new ContactsOpenHelper(this);

       dataForDb();





        FloatingActionButton fab = findViewById(R.id.fab);
        FloatingActionButton fab2 = findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_CALL);
                String number = PhoneNo.getText().toString();

                if(number.trim().isEmpty()){
                    Toast.makeText(MainActivity.this, "NO Phone Number is available for this actor", Toast.LENGTH_SHORT).show();
                    requestPermission();
                }else{
                    intentCall.setData(Uri.parse("tel:"+number));


                    if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//
                        Toast.makeText(MainActivity.this, "Please Grant Permission", Toast.LENGTH_SHORT).show();
                    }else{
                        startActivity(intentCall);
                    }

                }
            }
        });



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = "Hello " + FullName.getText().toString() + ", ";
                String phoneNo = PhoneNo.getText().toString();
                //String name = FullName.getText().toString();
                if(!TextUtils.isEmpty(message) && !TextUtils.isEmpty(phoneNo)){
                    Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + phoneNo));
                    smsIntent.putExtra("sms_body",message);
                    startActivity(smsIntent);
                }
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        // ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer,toolbar,"open","Close");

        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.






        RegionSP = findViewById(R.id.regionSP);
        ZoneSP = findViewById(R.id.zoneSP);
        DistrictSP = findViewById(R.id.districtSP);
        ActorSP = findViewById(R.id.actorSP);
        //Result = findViewById(R.id.result);

        FullName = findViewById(R.id.fullName);
        Location = findViewById(R.id.location);
        Position = findViewById(R.id.position);
        PhoneNo = findViewById(R.id.phoneNo);
        // Email = findViewById(R.id.email);

        Btn_Call = findViewById(R.id.btn_call);
        BtnSms = findViewById(R.id.btn_sms);
        Btn_CheckList = findViewById(R.id.checkList);
        BulkEmail = findViewById(R.id.bulkEmail);
        BtnInfo = findViewById(R.id.btn_info);


  mAdaptorRegion = new SimpleCursorAdapter(this, android.R.layout.simple_spinner_item,null,
          new String[]{RegionInfoEntry.COLUMN_REGION_NAME},new int[]{android.R.id.text1}, 0);

  mAdaptorRegion.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
  RegionSP.setAdapter(mAdaptorRegion);



  loadRegionData();

ZoneSP.setAdapter(null);
DistrictSP.setAdapter(null);
ActorSP.setAdapter(null);


        Btn_Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentCall = new Intent(Intent.ACTION_CALL);
                String number = PhoneNo.getText().toString();

                if(number.trim().isEmpty()){
                    Toast.makeText(MainActivity.this, "NO Phone Number is available for this actor", Toast.LENGTH_SHORT).show();
                    requestPermission();
                }else{
                    intentCall.setData(Uri.parse("tel:"+number));


                    if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//
                        Toast.makeText(MainActivity.this, "Please Grant Permission", Toast.LENGTH_SHORT).show();
                    }else{
                        startActivity(intentCall);
                    }

                }

            }
        });



     RegionSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


           Cursor cursor = mAdaptorRegion.getCursor();
           int regIndex = cursor.getColumnIndex(RegionInfoEntry.COLUMN_REGION_NAME);
           String regionName = cursor.getString(regIndex);

            if (regionName.equals("Select Region") || regionName.equals("")){
                ZoneSP.setAdapter(null);
                DistrictSP.setAdapter(null);
                ActorSP.setAdapter(null);
                FullName.setText("");
                PhoneNo.setText("");
                Position.setText("");
            }else {
                mAdaptorZone = new SimpleCursorAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, null,
                        new String[]{ZoneInfoEntry.COLUMN_ZONE_NAME}, new int[]{android.R.id.text1}, 0);

                mAdaptorZone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                ZoneSP.setAdapter(mAdaptorZone);
                loadZoneData(regionName);

            }
         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });

     ZoneSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


             Cursor cursor = mAdaptorZone.getCursor();
             int zoneIndex = cursor.getColumnIndex(ZoneInfoEntry.COLUMN_ZONE_NAME);
             String zoneName = cursor.getString(zoneIndex);
             if (zoneName.equals("Select Zone") || zoneName.equals("")){
                 DistrictSP.setAdapter(null);
                 ActorSP.setAdapter(null);
                 FullName.setText("");
                 PhoneNo.setText("");
                 Position.setText("");
             }else {

                 mAdaptorDistrict = new SimpleCursorAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, null,
                         new String[]{DistrictInfoEntry.COLUMN_DISTRICT_NAME}, new int[]{android.R.id.text1}, 0);

                 mAdaptorDistrict.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 DistrictSP.setAdapter(mAdaptorDistrict);
                 loadDistrictData(zoneName);
             }

         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });

     DistrictSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


             Cursor cursor = mAdaptorDistrict.getCursor();
             int districtIndex = cursor.getColumnIndex(DistrictInfoEntry.COLUMN_DISTRICT_NAME);
             String distnictName = cursor.getString(districtIndex);
             if (distnictName.equals("Select District") || distnictName.equals("")){
                 ActorSP.setAdapter(null);
                 FullName.setText("");
                 PhoneNo.setText("");
                 Position.setText("");
             }else {

                // String[] =actorInfo = ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_FIRST_NAME + " " + ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_LAST_NAME +
                //         " (" + ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_POSITION + ")";

                 //Cursor c = db.query(true,ContactsDatabase.ActorInfoEntry.TABLE_NAME,queryCols,adapterCols,null,null,null,null,null,null);


                 String[] from = new String[] { ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_INFO,
                         ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_PHONE};
                 int[] to = new int[] { android.R.id.text1 };

                 mAdaptorActor = new SimpleCursorAdapter(MainActivity.this, android.R.layout.simple_spinner_item, null,
                         from, to, 0);

                 mAdaptorActor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 ActorSP.setAdapter(mAdaptorActor);
                 loadActorData(distnictName);

             }
         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });

     ActorSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


             Cursor cursor = mAdaptorActor.getCursor();
             int actorIndex = cursor.getColumnIndex(ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_INFO);
             String actorInfo = cursor.getString(actorIndex);
             String actorPhone = cursor.getString(actorIndex+1);

             //String actorposition = cursor.getString(actorIndex + 3);
             if (actorInfo.equals("Select Actor") || actorInfo.equals("")){
                 FullName.setText("");
                 PhoneNo.setText("");
                 Position.setText("");
             }else {



                 //FullName.setText(actorInfo);
                 PhoneNo.setText(actorPhone);

                 String[] splitActorInfo = actorInfo.trim().split("\\s+");

                String posit = splitActorInfo[splitActorInfo.length-1];

                Position.setText(posit);
                
                int i = 0;
                int j=splitActorInfo.length-2;
                StringBuilder fullName= new StringBuilder();

                while(i < splitActorInfo.length-1)   {

                      fullName.append(splitActorInfo[i]).append(" ");
                      i++;
                }
                    FullName.setText(fullName);
             }
         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });


    }

 private void loadRegionData() {
  SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();
  String[] regionColumns = {RegionInfoEntry.COLUMN_REGION_NAME,
                            RegionInfoEntry._ID};

  Cursor cursor = db.query(RegionInfoEntry.TABLE_NAME,
          regionColumns,
          null,
          null,
          null,
          null,
          null);
  mAdaptorRegion.changeCursor(cursor);

 }

 private void loadZoneData(String regionName) {
  SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();
  String[] zoneColumns = {ZoneInfoEntry.COLUMN_ZONE_NAME,
          ZoneInfoEntry.COLUMN_REGION_NAME,
          ZoneInfoEntry._ID};


 String whereClause = ZoneInfoEntry.COLUMN_REGION_NAME+"=?";

  Cursor cursor = db.query(ZoneInfoEntry.TABLE_NAME,zoneColumns,
          whereClause, new String[]{regionName},null,null,null);
  mAdaptorZone.changeCursor(cursor);
 }

    private void loadDistrictData(String zoneName) {
        SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();
        String[] districtColumns = {DistrictInfoEntry.COLUMN_DISTRICT_NAME,
                DistrictInfoEntry.COLUMN_ZONE_NAME,
                DistrictInfoEntry._ID};


        String whereClause = DistrictInfoEntry.COLUMN_ZONE_NAME+"=?";

        Cursor cursor = db.query(DistrictInfoEntry.TABLE_NAME,districtColumns,
                whereClause, new String[]{zoneName},null,null,null);
        mAdaptorDistrict.changeCursor(cursor);
    }

    private void loadActorData(String districtName) {
        SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();
        String[] actorColumns = {ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_INFO,
                ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_PHONE,
                ContactsDatabase.ActorInfoEntry.COLUMN_DISTRICT_NAME,
                ContactsDatabase.ActorInfoEntry._ID};


        String whereClause = DistrictInfoEntry.COLUMN_DISTRICT_NAME+"=?";

        Cursor cursor = db.query(ContactsDatabase.ActorInfoEntry.TABLE_NAME,actorColumns,
                whereClause, new String[]{districtName},null,null, null);


        mAdaptorActor.changeCursor(cursor);
    }


 private void dataForDb() {

        SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();

       // Toast.makeText(MainActivity.this, "data enter", Toast.LENGTH_SHORT).show();



    }


    private void requestPermission(){

        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
    }
    private void requestPermissionSMS(){

        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.SEND_SMS,Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);
    }

    public void getSelectedActor (View v){

        Actor actor = (Actor) ActorSP.getSelectedItem();
        displayActorData(actor);

    }
    private void displayActorData(Actor actor) {
        String name = actor.getInfo();
        String phone = actor.getPhoneNumber();
        //String email = actor.getMail();

        //String actorData = "Full Name:              " + name + "\nLocation:                " + location + "\nPosition:                  " + pos + "\nPhone Number:     " + phone + "\nEmail:                     " + email;
        if (name == "Select Actor") {
            FullName.setText("");
        } else {
            FullName.setText(name);
        }
        PhoneNo.setText(phone);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.nav_check_list){
           // Intent intent = new Intent(MainActivity.this, CheckList.class);
            //startActivity(intent);

        }else if (id == R.id.nav_group_sms){
            Intent intent = new Intent(MainActivity.this, GroupSMS.class);
            startActivity(intent);
        }else if (id == R.id.nav_about){
            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

}