package com.example.estefafdez.myfirstandroidapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var baristaText: TextView
    private lateinit var androidText: TextView
    private lateinit var baristaImg: ImageView
    private lateinit var androidImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        baristaText = findViewById(R.id.baristaText)
        androidText = findViewById(R.id.androidText)
        baristaImg = findViewById(R.id.barista_img)
        androidImg = findViewById(R.id.android_img)
    }
}
