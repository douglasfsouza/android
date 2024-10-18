package com.example.dgTimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private CountDownTimer objTimer;
    private boolean blnRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button objBtnWrite = findViewById(R.id.btnWrite);
        objBtnWrite.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.edWrite);
                ed.setText("Escrevi aqui");
            }
        });
        Button btnAgain = findViewById(R.id.btnAgain);
        btnAgain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText ed = findViewById(R.id.edWrite);
                ed.setText("Escrevi novamente");
            }
        });
        RadioButton rbUp = findViewById(R.id.rbUp);
        rbUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               // EditText ed = findViewById(R.id.edWrite);
                //ed.setTop( ed.getTop() - 100);
               // ed.setY(ed.getY()-100);
                //String s = String.valueOf(ed.getY());
                //ed.setText(s);
                blnRunning=true;
                startTimer();
            }
        });
        RadioButton rbDown = findViewById(R.id.rbDown);
        rbDown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //EditText ed = findViewById(R.id.edWrite);
                //ed.setTop( ed.getTop() + 100);
                blnRunning=true;
                startTimer();

            }
        });
        RadioButton rp = findViewById(R.id.rbStop);
        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer();
            }
        });
    }
    public void startTimer(){
        objTimer = new CountDownTimer(5000,1) {
            @Override
            public void onTick(long millisUntilFinished) {
                //nso precisa controle por variavel
                //if(blnRunning==true){
                    RadioButton rbu = findViewById(R.id.rbUp);
                    RadioButton rbd = findViewById(R.id.rbDown);

                    EditText ed = findViewById(R.id.edWrite);
                    if (ed.getY()>=4 && ed.getY() <=1400){
                        if (rbu.isChecked())
                            ed.setY(ed.getY()-1);
                        else
                            ed.setY(ed.getY()+1);

                        String s = String.valueOf(ed.getY());
                        ed.setText(s);

                    }
                    else
                    {
                        blnRunning=false;
                        if(ed.getY()<4 )
                            ed.setY(4);
                        else
                            ed.setY(1400);
                    }

                //}

            }

            @Override
            public void onFinish() {
                EditText ed = findViewById(R.id.edWrite);
                ed.setText("Fim do timer");
            }
        }.start();
        blnRunning = true;
    }
    public void stopTimer(){
        blnRunning=false;
        objTimer.cancel();
    }
}
