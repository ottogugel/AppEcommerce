package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_valortotal)

        val recebervt = intent.getStringExtra("valortotal").toString()

        val valortotal = findViewById<TextView>(R.id.valortotal)
        valortotal.text = recebervt
    }
}