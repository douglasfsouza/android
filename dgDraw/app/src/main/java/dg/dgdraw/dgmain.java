package dg.dgdraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class dgmain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_dgmain);
        setContentView(new dg.dgdraw.TouchEventView(this, null));

        Button bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float f;
             Toast.makeText(dgmain.this,"Hey",Toast.LENGTH_LONG).show();

         }
     });
    }


}
