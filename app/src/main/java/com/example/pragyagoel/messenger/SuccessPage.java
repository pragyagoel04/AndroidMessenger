package com.example.pragyagoel.messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successpage);
        String username= getIntent().getStringExtra("Username");

        TextView tv=(TextView)findViewById(R.id.textViewUsername);
        tv.setText(username);
    }
}
