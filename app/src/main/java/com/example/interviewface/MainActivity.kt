package com.example.interviewface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize buttons
        val btnIniciarSesion = findViewById<Button>(R.id.btnIniciarSesion)
        val btnRegistrarse = findViewById<Button>(R.id.btnRegistrarse)

        // Set click listeners
        btnIniciarSesion.setOnClickListener {
            // TODO: Implement login functionality
            Toast.makeText(this, getString(R.string.toast_login), Toast.LENGTH_SHORT).show()
        }

        btnRegistrarse.setOnClickListener {
            // TODO: Implement registration functionality
            Toast.makeText(this, getString(R.string.toast_register), Toast.LENGTH_SHORT).show()
        }
    }
}
