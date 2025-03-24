package com.ifsc.contaclicks;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Integer i = 0;
    EditText edpeso, edaltura;
    TextView tvresultado;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edpeso =findViewById(R.id.editPeso);
        edaltura =findViewById(R.id.editAltura);
        tvresultado=findViewById(R.id.tvresultado);
        buttonCalcular=findViewById(R.id.button);
        // Defi

        buttonCalcular.setOnClickListener(v -> {

            double peso,altura, imc;
            peso=Double.parseDouble(edpeso.getText().toString());
            altura= Double.parseDouble(edaltura.getText().toString());
            imc= peso/(altura*altura);

            tvresultado.setText(Double.toString(imc));



        });


    }




}