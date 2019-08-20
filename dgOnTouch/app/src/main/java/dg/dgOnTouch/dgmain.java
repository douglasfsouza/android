package dg.dgOnTouch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class dgmain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dgmain);
        //setContentView(new dg.dgOnTouch.TouchEventView(this, null));

//toque na tela, retorna mais dados como posicao x, y, etc
        View v =findViewById(R.id.view1);
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float f = event.getX();

                if( event.getAction()== MotionEvent.ACTION_DOWN){
                    Toast.makeText(dgmain.this,"Pressionou",Toast.LENGTH_LONG).show();

                }

                if (event.getAction()==MotionEvent.ACTION_UP) {
                    Toast.makeText(dgmain.this,"Soltou",Toast.LENGTH_LONG).show();

                }
                //Toast.makeText(dgmain.this,String.valueOf(f),Toast.LENGTH_LONG).show();

                return true;
            }
            //public  boolean onUnTouch(View v,MotionEvent ev) {
            //    Toast.makeText(dgmain.this,"Soltou",Toast.LENGTH_LONG).show();
            //    return false;
            //}
        });

//Click na tela
        /*v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float f = v.getX();
                Toast.makeText(dgmain.this,String.valueOf(f),Toast.LENGTH_LONG).show();

            }
        });*/


        Button bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float f;
            // Toast.makeText(dgmain.this,"Hey",Toast.LENGTH_LONG).show();
             f=v.getX();
             Toast.makeText(dgmain.this,String.valueOf(f),Toast.LENGTH_LONG).show();

         }
     });
    }



}
