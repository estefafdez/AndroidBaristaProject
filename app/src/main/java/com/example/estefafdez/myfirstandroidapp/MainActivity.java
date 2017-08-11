package com.example.estefafdez.myfirstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Declaramos las variables.
    TextView texto;
    EditText editText;
    Button boton1;
    Button boton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.texto);
        editText = (EditText) findViewById(R.id.editText);
        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                String dato = editText.getText().toString();
                texto.setText(dato);
                break;
            case R.id.button2:
                texto.setText("Botón2!!!");
                break;

        }

    }
}
