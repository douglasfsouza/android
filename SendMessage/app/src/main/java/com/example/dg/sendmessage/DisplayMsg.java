package com.example.dg.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMsg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_msg);
        Intent intent = getIntent();
        TextView tv = (TextView) findViewById(R.id.textView);
        String msg = intent.getStringExtra(MainActivity.MSG_EXTRA);
        tv.setText(msg);
    }
}
