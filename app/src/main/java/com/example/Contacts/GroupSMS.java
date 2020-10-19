package com.example.Contacts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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


import static com.example.Contacts.R.id.spinnerGroup;

public class GroupSMS extends AppCompatActivity {


    Spinner SpinnerGroup;
    Button Btn_Back,Send_BulkSMS;
    TextView SMS;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_sms);
        SpinnerGroup = findViewById(spinnerGroup);
        //Btn_Back = findViewById(R.id.btn_back1);
        SMS = findViewById(R.id.SMS);
        Send_BulkSMS = findViewById(R.id.bulkEmail_send);


        getSupportActionBar().setTitle("Group SMS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SMS.setEnabled(false);
        Send_BulkSMS.setEnabled(false);



        /*Btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GroupSMS.this, MainActivity.class);
                startActivity(intent);
            }
        });*/




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
                //Intent intent = new Intent(getApplicationContext(), GroupSMS.class);
                //PendingIntent pi = PendingIntent.getActivity(getApplicationContext(),0,intent,0);
                //String Bulk_Phoneno = "0911183380";
                String MyMessage = SMS.getText().toString();

                if(ContextCompat.checkSelfPermission(GroupSMS.this, Manifest.permission.SEND_SMS)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(GroupSMS.this, new String[]{Manifest.permission.SEND_SMS},1);
                }else{

                    if(SpinnerGroup.getSelectedItem() == "VL Staff"){
                        InputStream is = getResources().openRawResource(R.raw.vl_staff);
                        BufferedReader reader = new BufferedReader( new InputStreamReader(is, StandardCharsets.UTF_8));

                        String line = "";
                        String bulkTelephone = "";

                        try{
                            // Step over headers
                            reader.readLine();

                            while ((line = reader.readLine()) != null){
                                //split by ','
                                String[] tokens = line.split(",");

                                //read the data

                                bulkTelephone =  tokens[3] ;

                                SmsManager sms = SmsManager.getDefault();
                                sms.sendTextMessage(bulkTelephone,null,MyMessage,null,null);

                            }

                            Toast.makeText(getApplicationContext(),"Message Sent successfully!",Toast.LENGTH_LONG).show();
                            SMS.setText("");

                        }catch (IOException e){
                            Log.v("MyActivity","Error reading data file on line " + line, e);
                            e.printStackTrace();
                        }

                    }else if (SpinnerGroup.getSelectedItem() == "MFP"){
                        InputStream is = getResources().openRawResource(R.raw.mfp);
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
                    }


                }

            }
        });

    }


}
