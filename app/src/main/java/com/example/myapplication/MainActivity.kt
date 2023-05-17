package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var goodmrng=findViewById<Button>(R.id.button)as Button
        var goodnight=findViewById<Button>(R.id.button2)as Button
        var textone=findViewById<TextView>(R.id.textview)as TextView

        goodmrng.setOnClickListener{
            textone.text="GoodMorning"
        }
        goodnight.setOnClickListener {
            textone.text="Good night"
        }
    }
}