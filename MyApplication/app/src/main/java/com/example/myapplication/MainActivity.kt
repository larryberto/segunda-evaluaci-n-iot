package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

// Esta Activity solo gestiona el tiempo de espera y navega a Login.
class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 2500 // 2500 ms = 2.5 segundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Crea un temporizador
        Handler(Looper.getMainLooper()).postDelayed({

            // Navegación a la pantalla de Login
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            // Llama a finish() SOLO después de iniciar la nueva Activity
            finish()

        }, SPLASH_TIME_OUT)
    }
}