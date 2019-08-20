package com.example.dg.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG_EXTRA = "com.example.dg.sendmessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SendMsg(View view){
        EditText ed = (EditText) findViewById(R.id.edtMsg);
        String msg = ed.getText().toString();

        Intent intent = new Intent(this,DisplayMsg.class);
        intent.putExtra(MSG_EXTRA,msg);
        startActivity(intent);

    }
}
