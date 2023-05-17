package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var plus=findViewById<Button>(R.id.button3)as Button
        var minus=findViewById<Button>(R.id.button4)as Button
        var text1=findViewById<TextView>(R.id.textView)as TextView
        var count:Int=0
        plus.setOnClickListener {
            text1.text=count++.toString()

        }
        minus.setOnClickListener {
            text1.text=count--.toString()
        }
    }
}