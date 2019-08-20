package com.example.dougcalc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	Double mdblTot = 0.0;
	String mstrNum = "", mstrOpe = "", mstrZerar = "N";
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    	final TextView tvNum = (TextView) this.findViewById(R.id.tvNum);
        Button bt1 = (Button) this.findViewById(R.id.bt1);
        Button bt2 = (Button) this.findViewById(R.id.bt2);
        Button bt3 = (Button) this.findViewById(R.id.bt3);
        Button bt4 = (Button) this.findViewById(R.id.bt4);
        Button bt5 = (Button) this.findViewById(R.id.bt5);
        Button bt6 = (Button) this.findViewById(R.id.bt6);
        Button bt7 = (Button) this.findViewById(R.id.bt7);
        Button bt8 = (Button) this.findViewById(R.id.bt8);
        Button bt9 = (Button) this.findViewById(R.id.bt9);
        Button bt0 = (Button) this.findViewById(R.id.bt0);
        Button btSom = (Button) this.findViewById(R.id.btSom);
        Button btSub = (Button) this.findViewById(R.id.btSub);
        Button btMul = (Button) this.findViewById(R.id.btMul);
        Button btDiv = (Button) this.findViewById(R.id.btDiv);
        Button btPonto = (Button) this.findViewById(R.id.btPonto);
        Button btC = (Button) this.findViewById(R.id.btC);
        Button btIgual = (Button) this.findViewById(R.id.btIgual);
        Button btBs = (Button) this.findViewById(R.id.btBs);
        
        
        bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				mstrNum += "1";
					
				tvNum.setText(mstrNum);
			}
		});
        
        bt2.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				
    			mstrNum += "2";
    			tvNum.setText(mstrNum);
    		}
    	});
        
        bt3.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				
    			mstrNum += "3";
    			tvNum.setText(mstrNum);
    		}
    	});
        
        bt4.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				
    			mstrNum += "4";
    			tvNum.setText(mstrNum);
    		}
    	});
        
        bt5.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				
    			mstrNum += "5";
    			tvNum.setText(mstrNum);
    		}
    	});
        
        bt6.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				
    			mstrNum += "6";
    			tvNum.setText(mstrNum);
    		}
    	});
        
        bt7.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				
    			mstrNum += "7";
    			tvNum.setText(mstrNum);
    		}
    	});
        
        bt8.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				
    			mstrNum += "8";
    			tvNum.setText(mstrNum);
    		}
    	});
        
        bt9.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				
    			mstrNum += "9";
    			tvNum.setText(mstrNum);
    		}
    	});
        
        bt0.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrZerar == "S"){
					mstrNum = "";
	    			mdblTot = 0.0;
	    			mstrZerar = "N";
				}					
				
    			mstrNum += "0";
    			tvNum.setText(mstrNum);
    		}
    	});
        
        btPonto.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrNum.indexOf(".")==-1)
    				mstrNum += ".";
    			else{
    				mstrNum = ".";
    				mdblTot = 0.0;
    				mstrZerar = "N";
    			}
    			tvNum.setText(mstrNum);
    		}
    	});
        
        btC.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			mstrNum = "";
    			tvNum.setText("0");
    		}
    	});
        
        
        btBs.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrNum.length()==1){
    				mstrNum ="0";
    				tvNum.setText(mstrNum);
    			}
    			else{
	    			if (mstrNum.length()>0){
	    				mstrNum = mstrNum.substring(0, mstrNum.length()-1);
	    				tvNum.setText(mstrNum);
    			}}
    			//tvNum.setText(Integer.toString(mstrNum.length()));
    		}
    	});        
        
        
        btSom.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrNum != ""){
	    			mdblTot =  Double.parseDouble(mstrNum);
	    			mstrNum = "";
	    			mstrOpe = "+";
	    			mstrZerar = "N";
	    			tvNum.setText("0");
    			}
    		}
    	});
        
        btSub.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrNum != ""){
	    			mdblTot =  Double.parseDouble(mstrNum);
	    			mstrNum = "";
	    			mstrOpe = "-";
	    			mstrZerar = "N";
	    			tvNum.setText("0");
    			}
    		}
    	});
        
        btMul.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrNum != ""){
	    			mdblTot =  Double.parseDouble(mstrNum);
	    			mstrNum = "";
	    			mstrOpe = "*";
	    			mstrZerar = "N";
	    			tvNum.setText("0");
    			}
    		}
    	});
        
        btDiv.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrNum != ""){
	    			mdblTot =  Double.parseDouble(mstrNum);
	    			mstrNum = "";
	    			mstrOpe = "/";
	    			mstrZerar = "N";
	    			tvNum.setText("0");
    			}
    		}
    	});
        
        btIgual.setOnClickListener(new View.OnClickListener() {
    		@Override
    		public void onClick(View v) {
    			if (mstrOpe == "+")
    				mdblTot += Double.parseDouble(mstrNum);
    			if (mstrOpe == "-")
    				mdblTot -= Double.parseDouble(mstrNum);
    			if (mstrOpe == "*")
    				//mdblTot *= Double.parseDouble(mstrNum);
    			    mdblTot = mdblTot * Double.parseDouble(mstrNum);
    			if (mstrOpe == "/")
    				mdblTot /= Double.parseDouble(mstrNum);
    			
    			if (mdblTot.intValue() == mdblTot)
    				mstrNum = Integer.toString( mdblTot.intValue());
    			else
    				mstrNum = Double.toString(mdblTot);
    			
    			if (mstrNum.length() > 10) {
    			  	mstrNum = mstrNum.substring(0, 10);
    			}
    			
    			tvNum.setText(mstrNum);
    			
    			mstrZerar = "S";
    			mdblTot = 0.0;
    			
    		}
    	});
    	
    
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
