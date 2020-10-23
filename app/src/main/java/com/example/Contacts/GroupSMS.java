package com.example.Contacts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


import static com.example.Contacts.R.id.position;
import static com.example.Contacts.R.id.spinnerRegion;
import static com.example.Contacts.R.id.spinnerGroup;
import static com.example.Contacts.R.id.spinnerRegion;
import static com.example.Contacts.R.id.spinnerZone;

public class GroupSMS extends AppCompatActivity {


    Spinner SpinnerGroup,SpinnerRegion,SpinnerZone;
    Button Send_BulkSMS;
    TextView SMS;

    private ContactsOpenHelper mDbOpenHelper;
    private SimpleCursorAdapter mAdaptorPosition;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mDbOpenHelper = new ContactsOpenHelper(this);

        //SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_sms);
        SpinnerGroup = findViewById(spinnerGroup);
        SpinnerRegion = findViewById(spinnerRegion);
        SpinnerZone = findViewById(spinnerZone);
        //Btn_Back = findViewById(R.id.btn_back1);
        SMS = findViewById(R.id.SMS);
        Send_BulkSMS = findViewById(R.id.bulkEmail_send);


        getSupportActionBar().setTitle("Group SMS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SMS.setEnabled(false);
        Send_BulkSMS.setEnabled(false);


/*
//SpinnerGroup.setOnItemSelectedListener(this);
        mAdaptorPosition = new SimpleCursorAdapter(this, android.R.layout.simple_spinner_item,null,
                new String[]{ContactsDatabase.PositionInfoEntry.COLUMN_ACTOR_POSITION},new int[]{android.R.id.text1}, 0);

        mAdaptorPosition.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerGroup.setAdapter(mAdaptorPosition);
        loadPositionData();
*/

        SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();



        // **************************** load Geography ******************************************************************


        List<String> region = new ArrayList<>();
        Cursor curRegion = db.rawQuery("select region_name from region_info",null);
        region.add("All Regions");
        int n = 0;
        while(curRegion.moveToNext())
        {

            String myList = curRegion.getString(0);
            if (n >0) {
                region.add(myList);
            }
            n++;

        }
        curRegion.close();

        ArrayAdapter<String> regionAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, region);

        regionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerRegion.setAdapter(regionAdapter);

        // *************************************************************************************************************

        SpinnerRegion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (SpinnerRegion.getSelectedItem() != "All Regions"){


                    SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();

                    List<String> zone = new ArrayList<>();
                    Cursor curZone = db.rawQuery("select zone_name from zone_info where region_name =? ",new String[]{SpinnerRegion.getSelectedItem().toString()});
                    zone.add("All Zones");
                    int n = 0;
                    while(curZone.moveToNext())
                    {

                        String myList = curZone.getString(0);
                        if (n >0) {
                            zone.add(myList);
                        }
                        n++;

                    }
                    curZone.close();

                    ArrayAdapter<String> zoneAdapter = new ArrayAdapter<>(GroupSMS.this,
                            android.R.layout.simple_spinner_item, zone);

                    zoneAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    SpinnerZone.setAdapter(zoneAdapter);

                }else{
                    SpinnerZone.setAdapter(null);
                    SpinnerGroup.setSelection(0);
                    SMS.setEnabled(false);
                    Send_BulkSMS.setEnabled(false);


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });










        List<String> list1 = new ArrayList<>();
        Cursor res = db.rawQuery("select actor_position from actor_position",null);
        while(res.moveToNext())
        {
            //String dbColumn = "actor_position";
            //int positionIndex = res.getColumnIndex(dbColumn);
            String myList = res.getString(0);
            list1.add(myList);

        }
        res.close();

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, list1);

        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerGroup.setAdapter(dataAdapter1);

/*
        List<String> list = new ArrayList<>();
        list.add("Select Group");
        list.add("MFP");
        list.add("M&E");
        list.add("EC");
        list.add("IEC");
        list.add("Assosa DC");
        list.add("Metekel DC");
        list.add("Shamboo DC");
        list.add("Waliso DC");
        list.add("Nekemte DC");
        list.add("M&E Assistants");
        list.add("VL Staff");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, list);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerGroup.setAdapter(dataAdapter);

*/
        SpinnerGroup.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    SMS.setText("");
                    SMS.setEnabled(false);
                    Send_BulkSMS.setEnabled(false);
                }else if(position != 0){
                  //  SMS.setText("");
                    SMS.setEnabled(true);
                    Send_BulkSMS.setEnabled(true);
                   // String groupText = list[position];
                    SMS.setText("Dear " +  SpinnerGroup.getSelectedItem() + ", ");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        Send_BulkSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


/*
                String teamLeader = "DEC";
                String line1 = "";
                String bulkTelephone1 = "";
                String MyMessage1 = SMS.getText().toString();

                if(ContextCompat.checkSelfPermission(GroupSMS.this, Manifest.permission.SEND_SMS)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(GroupSMS.this, new String[]{Manifest.permission.SEND_SMS},1);
                }else{

                        SmsManager sms = SmsManager.getDefault();

                        //String pos  = 'DEC';
                        Cursor res = db.rawQuery("select * from actor_information where position = ?", new String[]{"DEC"});
                       // rawQuery("SELECT id, name FROM people WHERE name = ? AND id = ?", new String[] {"David", "2"});
                        while(res.moveToNext())
                        {
                            String dbColumn = "actor_position";
                            int positionIndex = res.getColumnIndex(dbColumn);
                            //res.getColumnIndex(res.getColumnName())
                            String num = res.getString(positionIndex);
                            sms.sendTextMessage(num, null, MyMessage1, null, null);
                        }
                        res.close();
                        Toast.makeText(getApplicationContext(),"Message Sent successfully For all MFPs!",Toast.LENGTH_LONG).show();
                        SMS.setText("");
                    }



*/


                String MyMessage = SMS.getText().toString();

               // String[] groupSMS = new String[]{ContactsDatabase.ActorInfoEntry.COLUMN_ACTOR_PHONE};

                if(ContextCompat.checkSelfPermission(GroupSMS.this, Manifest.permission.SEND_SMS)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(GroupSMS.this, new String[]{Manifest.permission.SEND_SMS},1);
                }else{

                    if(SpinnerRegion.getSelectedItem() == "All Regions"){

                        if(SpinnerGroup.getSelectedItem() != "Select Position") {

                        //InputStream is = getResources().openRawResource(R.raw.vl_staff);
                        //BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                       // String line = "";
                       // String bulkTelephone = "";

                        /*

                        /////////////////////////////
                        // Step over headers
                        reader.readLine();

                        while ((line = reader.readLine()) != null){
                            //split by ','
                            String[] tokens = line.split(",");

                            //read the data
/
                            bulkTelephone =  tokens[3] ;

                            SmsManager sms = SmsManager.getDefault();
                            sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                        }*/

                        //String query="SELECT id, name, roll FROM student WHERE name = ? AND roll = ?";
                        //String[] selectionArgs = {"Amit","7"}
                        //db.rawQuery(query, selectionArgs);



                        SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();

                       String posName = SpinnerGroup.getSelectedItem().toString();
                        Cursor res = db.rawQuery("select * from actor_information where actor_position =? ", new String[]{posName});
                        while(res.moveToNext())
                        {
                            //line = line +1;
                            String dbColumn = "actor_phone";
                            int positionIndex = res.getColumnIndex(dbColumn);
                            //res.getColumnIndex(res.getColumnName())
                            String num = res.getString(positionIndex);
                            SmsManager sms = SmsManager.getDefault();
                            sms.sendTextMessage(num, null, MyMessage, null, null);
                        }
                        res.close();
                        Toast.makeText(getApplicationContext(),"Message Sent successfully For all MFPs!",Toast.LENGTH_LONG).show();
                        SMS.setText("");

                       // Toast.makeText(getApplicationContext(),"Message Sent successfully!",Toast.LENGTH_LONG).show();
                       // SMS.setText("");
                        }

                    }
                   /*
                    else if (SpinnerGroup.getSelectedItem() == "MFP"){
                        InputStream is = getResources().openRawResource(R.raw.mfp);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{




                            // Step over headers
                           // reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");


                                bulkTelephone =  tokens[3] ;


                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully For all MFPs!",Toast.LENGTH_LONG).show();
                            SMS.setText("");


                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    }else if (SpinnerGroup.getSelectedItem() == "Assosa DC"){
                        InputStream is = getResources().openRawResource(R.raw.assosa_dc);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{




                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");


                                bulkTelephone =  tokens[3] ;



                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully for Assosa Data Center!",Toast.LENGTH_LONG).show();
                            SMS.setText("");


                    }catch (IOException e){
                        Log.v("MyActivity","Error reading data file on line " + line, e);
                        e.printStackTrace();
                    }

                } else if (SpinnerGroup.getSelectedItem() == "Metekel DC"){
                        InputStream is = getResources().openRawResource(R.raw.gilgel_dc);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{




                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");


                                bulkTelephone =  tokens[3] ;


                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully for Metekel Data Center!",Toast.LENGTH_LONG).show();
                            SMS.setText("");


                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    }else if (SpinnerGroup.getSelectedItem() == "Shamboo DC"){
                        InputStream is = getResources().openRawResource(R.raw.shamboo_dc);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{




                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");


                                bulkTelephone =  tokens[3] ;


                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully for Shamboo Data Center!",Toast.LENGTH_LONG).show();
                            SMS.setText("");

                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    }else if (SpinnerGroup.getSelectedItem() == "Waliso DC"){
                        InputStream is = getResources().openRawResource(R.raw.waliso_dc);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{

                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");

                                bulkTelephone =  tokens[3] ;

                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully for Waliso Data Center!",Toast.LENGTH_LONG).show();
                            SMS.setText("");

                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    }else if (SpinnerGroup.getSelectedItem() == "Nekemte DC"){
                        InputStream is = getResources().openRawResource(R.raw.nekemte_dc);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{




                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");


                                bulkTelephone =  tokens[3] ;


                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully for Nekemte Data Center!",Toast.LENGTH_LONG).show();
                            SMS.setText("");


                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    }else if (SpinnerGroup.getSelectedItem() == "EC"){
                        InputStream is = getResources().openRawResource(R.raw.ec);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{

                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");

                                bulkTelephone =  tokens[3] ;


                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully For all ECs!",Toast.LENGTH_LONG).show();
                            SMS.setText("");

                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    }else if (SpinnerGroup.getSelectedItem() == "IEC"){
                        InputStream is = getResources().openRawResource(R.raw.iec);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{




                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");

                                bulkTelephone =  tokens[3] ;


                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully For all IECs!",Toast.LENGTH_LONG).show();
                            SMS.setText("");


                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    }else if (SpinnerGroup.getSelectedItem() == "M&E"){
                        InputStream is = getResources().openRawResource(R.raw.mae);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{




                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");


                                bulkTelephone =  tokens[3] ;


                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully To all ABT M&E Team!",Toast.LENGTH_LONG).show();
                            SMS.setText("");


                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    }else if (SpinnerGroup.getSelectedItem() == "M&E Assistants"){
                        InputStream is = getResources().openRawResource(R.raw.mae_assistants);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{




                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");

                                bulkTelephone =  tokens[3] ;


                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully For all M&E Assistants!",Toast.LENGTH_LONG).show();
                            SMS.setText("");


                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    } else{

                        Toast.makeText(getApplicationContext(),"FAILED. NO list of individuals entered for this group yet.",Toast.LENGTH_LONG).show();
                    }*/


                }

            }
        });

    }

    private void loadPositionData() {
        SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();

        List<String> list1 = new ArrayList<>();
        Cursor res = db.rawQuery("select actor_position from actor_position",null);
        while(res.moveToNext())
        {
            //String dbColumn = "actor_position";
            //int positionIndex = res.getColumnIndex(dbColumn);
            String myList = res.getString(0);
           list1.add(myList);

        }
        res.close();

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, list1);

        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerGroup.setAdapter(dataAdapter1);

    }


}
