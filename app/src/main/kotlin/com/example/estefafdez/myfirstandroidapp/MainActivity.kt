package com.example.estefafdez.myfirstandroidapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var text: TextView
    private lateinit var editText: EditText
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var buttonActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.texto)
        editText = findViewById(R.id.editText)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        buttonActivity = findViewById(R.id.buttonActivity)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        buttonActivity.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button1 -> text.text = editText.text.toString()
            R.id.button2 -> text.text = "This is the button 2!!!"
            R.id.button3 -> Toast.makeText(applicationContext, R.string.toastText, Toast.LENGTH_SHORT).show()
            R.id.buttonActivity -> startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
