package dg.tabuada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class PerguntarActivity extends AppCompatActivity {
    public int mintRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntar);

        Random objran = new Random();
        int intran1 = objran.nextInt(9) +1;
        int intran2 = objran.nextInt(9) +1;

        mintRes = intran1 * intran2;
        TextView tv = (TextView)findViewById(R.id.textView3);

        String strTab = intran1 + " X " + intran2 + " = ";

        //String strran = String.valueOf(intran);


        tv.setText(strTab);

    }
    public void Finalizar(View view){
        finish();
    }
    public void Verificar(View v){
        EditText ed = (EditText)findViewById(R.id.edtResInf);
        String strResInf = ed.getText().toString();
        String strRes;
        if (strResInf.compareTo(String.valueOf(mintRes)) == 0)
            strRes = "Parabéns, você acertou !";
        else
            strRes = "A resposta correta seria " + String.valueOf(mintRes);

        TextView tvr = (TextView)findViewById(R.id.tvResposta);
        tvr.setText(strRes);

    }
    public void Novo(View v){
        Random objran = new Random();
        int intran1 = objran.nextInt(9) +1;
        int intran2 = objran.nextInt(9) +1;

        mintRes = intran1 * intran2;
        TextView tv = (TextView)findViewById(R.id.textView3);

        String strTab = intran1 + " X " + intran2 + " = ";

        //String strran = String.valueOf(intran);


        tv.setText(strTab);

        TextView tvr = (TextView)findViewById(R.id.tvResposta);
        tvr.setText("Resposta");

        EditText edr = (EditText)findViewById(R.id.edtResInf);
        edr.setText("");
    }
}
