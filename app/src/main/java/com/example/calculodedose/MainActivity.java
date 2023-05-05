package com.example.calculodedose;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText editText;

    ImageView baRA;
    NumberPicker numberPicker;
    Button outraTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instanciando id
        outraTela = findViewById(R.id.btnOutraTela);
        numberPicker = findViewById(R.id.numberPicker);
        //Numberpicker valores
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        //metodos


        outraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent TelaC = new Intent(getApplicationContext(),TelaCalc.class);
            TelaC.putExtra("valor",numberPicker.getValue());
            startActivity(TelaC);
            }
        });

        }




}
