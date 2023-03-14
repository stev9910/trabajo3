package com.example.aplicacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Metodos metodos= new Metodos();
    EditText et1, et2;
    TextView tv1, tv2;
    Button btnOperacion;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.txtPrimerNumero);
        et2 = findViewById(R.id.txtSegundoNumero);
        tv1 = findViewById(R.id.etiquetaSuma);
        tv2 = findViewById(R.id.etiquetaMultiplicacion);

        btnOperacion = findViewById(R.id.botonOperacion);
        btnOperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1, n2, ress, resm;
                n1 = Float.parseFloat(et1.getText().toString());
                n2 = Float.parseFloat(et2.getText().toString());
                ress = n1 + n2;
                resm = n1 * n2;
                tv1.setText("El resultado es: " + ress);
                tv2.setText("El resultado es: " + resm);



            }
        });
    }

    private class Metodos {
    }
}
