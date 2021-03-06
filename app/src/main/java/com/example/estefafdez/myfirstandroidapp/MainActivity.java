package com.example.estefafdez.myfirstandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Declaramos las variables.
    TextView text;
    EditText editText;
    Button button1;
    Button button2;
    Button button3;
    Button buttonActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.texto);
        editText = (EditText) findViewById(R.id.editText);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        buttonActivity = (Button) findViewById(R.id.buttonActivity);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        buttonActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                String data = editText.getText().toString();
                text.setText(data);
                break;
            case R.id.button2:
                text.setText("This is the button 2!!!");
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), R.string.toastText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonActivity:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                break;
        }
    }
}
