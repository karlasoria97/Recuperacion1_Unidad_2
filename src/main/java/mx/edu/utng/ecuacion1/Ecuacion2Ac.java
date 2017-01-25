package mx.edu.utng.ecuacion1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Karla on 23/01/2017.
 */

public class Ecuacion2Ac extends AppCompatActivity {
    private EditText edtX;
    private EditText edtY;
    private Button btnRes;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion2);
        edtX = (EditText)findViewById(R.id.x);
        edtY = (EditText)findViewById(R.id.y);
        btnRes = (Button)findViewById(R.id.btn_ecua2);
        btnRes.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Ecuacion2 ecuacion2 = Ecuacion2.getEcuacion2();
                ecuacion2.setX(Integer.parseInt(edtX.getText().toString()));
                ecuacion2.setY(Integer.parseInt(edtY.getText().toString()));
                Toast.makeText(Ecuacion2Ac.this,"Resultado:"
                                +"\nValor de x: "+ ecuacion2.getX()
                                +"\nValor de y: "+ ecuacion2.getY()
                                +"\nResultado: "+ ecuacion2.getResul()
                        ,

                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}

