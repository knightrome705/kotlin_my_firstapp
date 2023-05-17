package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var s: Button = findViewById(R.id.button5)
        var k: Button = findViewById(R.id.button6)
        var image: ImageView = findViewById(R.id.imageView)
        s.setOnClickListener {
            image.setImageResource(R.drawable.cat)
        }
        k.setOnClickListener {
            image.setImageResource(R.drawable.mouse)

        }
    }
}