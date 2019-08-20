package com.example.dougasc;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AscMainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asc_main);
        final EditText etCar = (EditText) this.findViewById(R.id.etCar);
        final TextView tvCod = (TextView) this.findViewById(R.id.tvCod);
        Button btAsc = (Button) this.findViewById(R.id.btAsc);
        
        btAsc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				/*int i = 65;
				Character c = new Character((char) i);				
				String car2 = Character.toString(c);				
				tvCod.setText(car2);
				*/
				Character cTab;
				String sTab;
				for (int c=1;c<256;++c){
					cTab = new Character((char) c);
					sTab = Character.toString(cTab);
					if (sTab.compareTo( etCar.getEditableText().toString())==1)
						tvCod.setText(Integer.toString(c-1));											
				}
				
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.asc_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
