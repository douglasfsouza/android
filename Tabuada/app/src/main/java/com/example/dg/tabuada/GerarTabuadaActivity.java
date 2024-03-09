package dg.tabuada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GerarTabuadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerar_tabuada);
    }

    public void gerarTabuada(View view){
        Integer intTab;
        String strTab;
        EditText edtab = (EditText)findViewById(R.id.edtTab);
        strTab = edtab.getText().toString();
        intTab = Integer.parseInt(strTab);

        TextView tv1 = (TextView)findViewById(R.id.tv1);
        tv1.setText(strTab + " X 1 = " + strTab);

        TextView tv2 = (TextView)findViewById(R.id.tv2);
        tv2.setText(strTab + " X 2 = " + intTab * 2);

        TextView tv3 = (TextView)findViewById(R.id.tv3);
        tv3.setText(strTab + " X 3 = " + intTab * 3);

        TextView tv4 = (TextView)findViewById(R.id.tv4);
        tv4.setText(strTab + " X 4 = " + intTab * 4);

        TextView tv5 = (TextView)findViewById(R.id.tv5);
        tv5.setText(strTab + " X 5 = " + intTab * 5);

        TextView tv6 = (TextView)findViewById(R.id.tv6);
        tv6.setText(strTab + " X 6 = " + intTab * 6);

        TextView tv7 = (TextView)findViewById(R.id.tv7);
        tv7.setText(strTab + " X 7 = " + intTab * 7);

        TextView tv8 = (TextView)findViewById(R.id.tv8);
        tv8.setText(strTab + " X 8 = " + intTab * 8);

        TextView tv9 = (TextView)findViewById(R.id.tv9);
        tv9.setText(strTab + " X 9 = " + intTab * 9);

        TextView tv10 = (TextView)findViewById(R.id.tv10);
        tv10.setText(strTab + " X 10 = " + intTab * 10);

    }
}
