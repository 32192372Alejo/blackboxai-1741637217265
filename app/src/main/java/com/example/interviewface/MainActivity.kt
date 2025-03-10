package com.example.interviewface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize buttons
        val btnIniciarSesion = findViewById<Button>(R.id.btnIniciarSesion)
        val btnRegistrarse = findViewById<Button>(R.id.btnRegistrarse)

        // Empty click listeners - buttons will just have visual feedback
        btnIniciarSesion.setOnClickListener { }
        btnRegistrarse.setOnClickListener { }
    }
}
