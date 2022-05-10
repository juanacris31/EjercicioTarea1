package com.example.ejerciciotarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView efecha2,eNombre2, eTel2, eCorreo2, eDescrip2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        efecha2 = (EditText) findViewById(R.id.efecha2);
        String a = getIntent().getStringExtra("fecha");

        eNombre2 = (EditText) findViewById(R.id.eNombre2);
        String b = getIntent().getStringExtra("nombre");
        eTel2 = (EditText) findViewById(R.id.eTel2);
        String c = getIntent().getStringExtra("telefono");
        eCorreo2 = (EditText) findViewById(R.id.eCorreo2);
        String d = getIntent().getStringExtra("correo");
        eDescrip2 = (EditText) findViewById(R.id.eDescrip2);
        String e = getIntent().getStringExtra("descripcion");
        efecha2.setText(a);
        eNombre2.setText(b);
        eTel2.setText(c);
        eCorreo2.setText(d);
        eDescrip2.setText(e);
    }
public void Regresar(View view){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

    }
}