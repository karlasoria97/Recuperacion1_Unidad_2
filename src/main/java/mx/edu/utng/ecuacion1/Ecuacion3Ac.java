package mx.edu.utng.ecuacion1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Karla on 25/01/2017.
 */

public class Ecuacion3Ac extends AppCompatActivity {

    private EditText edtT;
    private Button btnRes;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion3);
        edtT = (EditText)findViewById(R.id.t);
        btnRes = (Button)findViewById(R.id.btn_ecua3);
        btnRes.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Ecuacion3 ecuacion3 = Ecuacion3.getEcuacion3();
                double t= Double.parseDouble(edtT.getText().toString());
                double result=0;

                ecuacion3.setT(Double.parseDouble(edtT.getText().toString()));
                Toast.makeText(Ecuacion3Ac.this,"Resultado:"
                                +"\nValor de t: "+ ecuacion3.getT()
                                +"\nResultado: "+ ecuacion3.getResul()
                        ,

                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
