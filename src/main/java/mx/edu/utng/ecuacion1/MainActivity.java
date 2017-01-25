package mx.edu.utng.ecuacion1;

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

    public void iniciarEcuacion1(View v){
        Intent i = new Intent(this, Ecuacion1Ac.class);
        startActivity(i);
    }

    public void iniciarEcuacion2(View v){
        Intent i = new Intent(this, Ecuacion2Ac.class);
        startActivity(i);
    }

    public void iniciarEcuacion3(View v){
        Intent i = new Intent(this, Ecuacion3Ac.class);
        startActivity(i);
    }



}
