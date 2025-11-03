package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Botón de REGISTRO: Navega a la nueva Activity funcional
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, RegistrarCuentaActivity::class.java) // 2.1.4 Interconexión
            startActivity(intent)
        }

        // 2. Botón INICIAR SESIÓN (Lógica simulada)
        binding.btnLogin.setOnClickListener {
            showFeedbackAlertDialog("Inicio de Sesión", "Validación simulada.")
        }

        // 3. Botón RECUPERAR CLAVE (Navegación)
        binding.btnForgotPassword.setOnClickListener {
            val intent = Intent(this, RecuperarClaveActivity::class.java) // 2.1.4 Interconexión
            startActivity(intent)
        }
    }

    private fun showFeedbackAlertDialog(title: String, message: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Aceptar") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
}