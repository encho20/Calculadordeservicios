package com.example.andres.calculadordeservicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class agua extends AppCompatActivity {
    EditText PrimerPiso;
    EditText SegundoPiso;
    EditText TercerPiso;

    CheckBox PrimerPisoMes;
    CheckBox SegundoPisoMes;
    CheckBox TercerPisoMes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agua);



    }
}
