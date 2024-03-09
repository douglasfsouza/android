package dg.tabuada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarTabuada(View view){
        Intent intent = new Intent(this,GerarTabuadaActivity.class);
        startActivity(intent);

    }
    public void Finalizar(View view){
        //finish();
        System.exit(0);
    }
    public void testarConhecimentos(View view){
        Intent intent = new Intent(this,PerguntarActivity.class);
        startActivity(intent);
    }
}
