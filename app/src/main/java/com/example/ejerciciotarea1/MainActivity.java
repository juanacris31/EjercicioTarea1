package com.example.ejerciciotarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bfecha;
    EditText efecha;
    private int dia, mes, ano;
    private EditText eNombre, eTel, eCorreo, eDescrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bfecha=(Button) findViewById(R.id.bfecha);
        efecha=(EditText) findViewById(R.id.efecha);
        bfecha.setOnClickListener(this);

        eNombre=(EditText) findViewById(R.id.eNombre);
        eTel=(EditText) findViewById(R.id.eTel);
        eCorreo=(EditText) findViewById(R.id.eCorreo);
        eDescrip=(EditText) findViewById(R.id.eDescrip);

    }
    public void Siguiente(View view){
        Intent i = new Intent(this,MainActivity2.class);
        i.putExtra("nombre",eNombre.getText().toString());
        i.putExtra("telefono",eTel.getText().toString());
        i.putExtra("correo",eCorreo.getText().toString());
        i.putExtra("descripcion",eDescrip.getText().toString());
    startActivity(i);


    }

    @Override
    public void onClick(View v) {
        if (v==bfecha){
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes= c.get(Calendar.MONTH);
            ano= c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    efecha.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);
                }
            },dia,mes,ano);
            datePickerDialog.show();
        }

    }
}