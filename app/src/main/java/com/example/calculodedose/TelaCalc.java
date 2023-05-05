package com.example.calculodedose;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaCalc extends AppCompatActivity {
    EditText c1,c2,c3,c4,c5;
    EditText t1,t2,t3,t4,t5;
    ImageView barra1 ,barra2,barra3,barra4,barra5;
    TextView txt1 ,txtM1,txtM2,txtM3,txtM4,risc;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_calc);
        //findByid
     txt1 = findViewById(R.id.txt2);
     c1 = findViewById(R.id.c1);
     c2 = findViewById(R.id.c2);
     c3 = findViewById(R.id.c3);
     c4 = findViewById(R.id.c4);
     c5 = findViewById(R.id.c5);
     t1 = findViewById(R.id.t1);
     t2 = findViewById(R.id.t2);
     t3 = findViewById(R.id.t3);
     t4 = findViewById(R.id.t4);
     t5 = findViewById(R.id.t5);
     barra1 = findViewById(R.id.barra1);
     barra2 = findViewById(R.id.barra2);
     barra3 = findViewById(R.id.barra3);
     barra4 = findViewById(R.id.barra4);
     barra5 = findViewById(R.id.barra5);
     txtM1 = (TextView)findViewById(R.id.txtMais1);
     txtM2 =(TextView) findViewById(R.id.txtMais2);
     txtM3 =(TextView) findViewById(R.id.txtMais3);
     txtM4 = (TextView) findViewById(R.id.txtMais4);
     btn1 = findViewById(R.id.button1);
     risc = findViewById(R.id.riS);

     ///


        //int
     int r1 = getIntent().getIntExtra("valor",1);
     int r2 = getIntent().getIntExtra("valor",2);
     int r3 = getIntent().getIntExtra("valor",3);
     int r4 = getIntent().getIntExtra("valor",4);
     int r5 = getIntent().getIntExtra("valor",5);


    if(r1 == 1){
        c1.setVisibility(View.VISIBLE);
        t1.setVisibility(View.VISIBLE);
        barra1.setVisibility(View.VISIBLE);
    } else if(r2 == 2){
        c1.setVisibility(View.VISIBLE);
        t1.setVisibility(View.VISIBLE);
        barra1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
        barra2.setVisibility(View.VISIBLE);
        txtM1.setVisibility(View.VISIBLE);}
    else if (r3 == 3) {
        c1.setVisibility(View.VISIBLE);
        t1.setVisibility(View.VISIBLE);
        barra1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
        barra2.setVisibility(View.VISIBLE);
        txtM1.setVisibility(View.VISIBLE);
        c3.setVisibility(View.VISIBLE);
        t3.setVisibility(View.VISIBLE);
        barra3.setVisibility(View.VISIBLE);
        txtM2.setVisibility(View.VISIBLE);}
    else if (r4 == 4) {
        c1.setVisibility(View.VISIBLE);
        t1.setVisibility(View.VISIBLE);
        barra1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
        barra2.setVisibility(View.VISIBLE);
        txtM1.setVisibility(View.VISIBLE);
        c3.setVisibility(View.VISIBLE);
        t3.setVisibility(View.VISIBLE);
        barra3.setVisibility(View.VISIBLE);
        txtM2.setVisibility(View.VISIBLE);
        c4.setVisibility(View.VISIBLE);
        t4.setVisibility(View.VISIBLE);
        barra4.setVisibility(View.VISIBLE);
        txtM3.setVisibility(View.VISIBLE);}
    else if (r5 == 5 ){
        c1.setVisibility(View.VISIBLE);
        t1.setVisibility(View.VISIBLE);
        barra1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
        barra2.setVisibility(View.VISIBLE);
        txtM1.setVisibility(View.VISIBLE);
        c3.setVisibility(View.VISIBLE);
        t3.setVisibility(View.VISIBLE);
        barra3.setVisibility(View.VISIBLE);
        txtM2.setVisibility(View.VISIBLE);
        c4.setVisibility(View.VISIBLE);
        t4.setVisibility(View.VISIBLE);
        barra4.setVisibility(View.VISIBLE);
        txtM3.setVisibility(View.VISIBLE);
        c5.setVisibility(View.VISIBLE);
        t5.setVisibility(View.VISIBLE);
        barra5.setVisibility(View.VISIBLE);
        txtM4.setVisibility(View.VISIBLE);}
    ///formulas
     btn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String v1,v2,v3,v4,v5,b1,b2,b3,b4,b5;
             Double vis;
             v1 = c1.getText().toString();
             v2 = c2.getText().toString();
             v3 = c3.getText().toString();
             v4 = c4.getText().toString();
             v5 = c5.getText().toString();
             b1 = t1.getText().toString();
             b2 = t2.getText().toString();
             b3 = t3.getText().toString();
             b4 = t4.getText().toString();
             b5 = t5.getText().toString();

             if (r1 == 1){
                 try {
                     vis = (Double.parseDouble(v1)/Double.parseDouble(b1));
                     String valor = String.format("%.1f",vis);
                     txt1.setText(valor);
                 } catch (NumberFormatException e){
                     vis =Double.parseDouble("0");
                 }
             }
             else if (r2 == 2){
                 try {
                     vis = (Double.parseDouble(v1)/Double.parseDouble(b1)) + (Double.parseDouble(v2)/Double.parseDouble(b2));
                     String valor = String.format("%.1f",vis);
                     txt1.setText(valor);
                 } catch (NumberFormatException e){
                     vis =Double.parseDouble("0");}}
             else if (r3 == 3) {
                 try {
                     vis = (Double.parseDouble(v1)/Double.parseDouble(b1)) + (Double.parseDouble(v2)/Double.parseDouble(b2))+(Double.parseDouble(v3)/Double.parseDouble(b3));
                     String valor = String.format("%.1f",vis);
                     txt1.setText(valor);;
                 }catch (NumberFormatException e){
                     vis =Double.parseDouble("0");}
             }
             else if(r4 == 4){
                 try {
                     vis = (Double.parseDouble(v1)/Double.parseDouble(b1)) + (Double.parseDouble(v2)/Double.parseDouble(b2))+(Double.parseDouble(v3)/Double.parseDouble(b3))+(Double.parseDouble(v4)/Double.parseDouble(b4));
                     String valor = String.format("%.1f",vis);
                     txt1.setText(valor);;
                 }catch (NumberFormatException e){
                     vis =Double.parseDouble("0");}
             } else if (r5 == 5) {
                 try {
                     vis = (Double.parseDouble(v1)/Double.parseDouble(b1)) + (Double.parseDouble(v2)/Double.parseDouble(b2))+(Double.parseDouble(v3)/Double.parseDouble(b3))+(Double.parseDouble(v4)/Double.parseDouble(b4))+(Double.parseDouble(v5)/Double.parseDouble(b5));
                     String valor = String.format("%.1f",vis);
                     txt1.setText(valor);;
                 }catch (NumberFormatException e){
                     vis =Double.parseDouble("0");}

             }

         }
     });





    }


    }
