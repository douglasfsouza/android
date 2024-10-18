package com.studio.dg.dgcontrolremote;

import android.net.wifi.WifiManager;
import android.net.wifi.aware.WifiAwareSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Set;
import java.util.ArrayList;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.content.Intent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

import javax.crypto.AEADBadTagException;


public class DeviceList extends AppCompatActivity {

    private WifiAwareSession wi;
    wi
    private BluetoothAdapter myBluetooth = null;
    private Set pairedDevices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_list);
        Button btnPaired;
        ListView deviceList;

        btnPaired = (Button) findViewById(R.id.btnPaired);
        deviceList = (ListView) findViewById(R.id.ListView);





    }
    public void pairedDevicesList(View view){

        myBluetooth = BluetoothAdapter.getDefaultAdapter();
        if (myBluetooth == null){
            Toast.makeText(getApplicationContext(), "Bluetooth Device Not Available", Toast.LENGTH_LONG).show();
            finish();
        }
        else{
            if (myBluetooth.isEnabled()){
                Toast.makeText(getApplicationContext(),"Ativo",Toast.LENGTH_LONG).show();
            }
            else{
                Intent intBlue = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(intBlue,1);

            }
        }


        pairedDevices = myBluetooth.getBondedDevices();
        ArrayList list = new ArrayList();
        BluetoothDevice bt;

        if (pairedDevices.size()>0){
            Toast.makeText(getApplicationContext(),"Found found",Toast.LENGTH_LONG).show();

//            list.add(myBluetooth.getName();
           // for (BluetoothDevice bt2 : pairedDevices){

            //}
        }
        else{
            Toast.makeText(getApplicationContext(),"No paired bluetooth devices found",Toast.LENGTH_LONG).show();

        }
        //final ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,1ist)



    }
}
