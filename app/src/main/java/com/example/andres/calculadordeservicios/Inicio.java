package com.example.andres.calculadordeservicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    Button Agua,Luz,Gas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button Agua=(Button)findViewById(R.id.ButtonAgua);
        Button Luz=(Button)findViewById(R.id.ButtonLuz);
        Button Gas=(Button)findViewById(R.id.ButtonGas);

        Agua.setOnClickListener(this);
        Luz.setOnClickListener(this);
        Gas.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

     switch (v.getId()){
         case R.id.ButtonAgua:
             Intent EnvioActvityAgua;
             EnvioActvityAgua =new Intent(Inicio.this,agua.class);
             startActivity(EnvioActvityAgua);
             break;
         case R.id.ButtonLuz:
                     Intent EnvioActvityLuz;
                      EnvioActvityLuz =new Intent(Inicio.this,luz.class);
                     startActivity(EnvioActvityLuz);
                     break;
                         case R.id.ButtonGas:
                             Intent EnvioActvityGas;
                             EnvioActvityGas =new Intent(Inicio.this,gas.class);
                             startActivity(EnvioActvityGas);
                       break;
     }
    }

     }


