package com.uisrael.jorgeramos_examenprimerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {
    RadioButton res1,res2;
    CheckBox c1,c2,c3;
    Button finalizar;
    EditText pregunta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        finalizar = findViewById(R.id.btnFinalizarEncuesta);
        res1 = findViewById(R.id.radioButton);
        res2 = findViewById(R.id.radioButton2);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        pregunta1 = findViewById(R.id.edtPregunta1);
    }

    public void continuar(View v){
        Intent encus = new Intent(Encuesta.this, Resumen.class);
        if(c1.isChecked()==true)
        {
            encus.putExtra("pregunta1",c1.getText().toString());
        }
        if (c2.isChecked()==true)
        {
            encus.putExtra("pregunta11",c2.getText().toString());
        }
        if (c3.isChecked()==true)
        {
            encus.putExtra("pregunta12",c3.getText().toString());
        }
        if (res1.isChecked()==true)
        {
            encus.putExtra("pregunta2",res1.getText().toString());
        }
        if (res2.isChecked()==true)
        {
            encus.putExtra("pregunta21",res2.getText().toString());
        }

        Toast.makeText(getApplicationContext(),"ENCUESTA GENERADA", Toast.LENGTH_SHORT).show();
        startActivity(encus);

    }
}
