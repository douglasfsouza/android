package com.studio.dg.tstlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MostrarMsg(View v){
        Toast.makeText(getApplicationContext(),"Clicou no botao",Toast.LENGTH_LONG).show();
    }
}
