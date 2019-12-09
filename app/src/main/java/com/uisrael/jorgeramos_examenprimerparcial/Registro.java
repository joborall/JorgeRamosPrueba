package com.uisrael.jorgeramos_examenprimerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    Button boton = null;
    TextView mensaje = null;
    TextView userLogged = null;
    Bundle datos;
    EditText nombre;
    EditText monto;
    EditText cuota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        boton = findViewById(R.id.btnGuardar);
        nombre = findViewById(R.id.edtNombre);
        monto = findViewById(R.id.edtMonto);
        cuota = findViewById(R.id.edtPago);



        /*** Mostramos el datos recibido*/
        datos = getIntent().getExtras();
        String usuarioLogeado = datos.getString("userLoggedIn");
        userLogged.setText("Bienvenido " + usuarioLogeado);


    }
}
