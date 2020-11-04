package com.asiesinc.appredes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.asiesinc.appredes.MESSAGE";
    Button send_button;
    EditText send_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        send_button = findViewById(R.id.send_button_id);
        send_text = findViewById(R.id.send_text_id);
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = send_text.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("name_key", str);
                startActivity(intent);
            }
        });
    }
}
