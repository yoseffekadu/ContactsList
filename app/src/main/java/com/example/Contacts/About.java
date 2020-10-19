package com.example.Contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    Button Btn_Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        Btn_Home = findViewById(R.id.btn_backhome);

        Btn_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About.this, ContactsActivity.class);
                startActivity(intent);
            }
        });
    }
}
