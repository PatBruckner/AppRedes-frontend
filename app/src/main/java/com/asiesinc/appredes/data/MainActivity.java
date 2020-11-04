package com.asiesinc.appredes.data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.asiesinc.appredes.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView receiver_msg = (TextView) findViewById(R.id.received_value_id);


        Intent intent = getIntent();

        String str = intent.getStringExtra("message_key");

        receiver_msg.setText(str);
    }
}