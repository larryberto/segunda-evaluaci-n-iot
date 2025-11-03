package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
// Clase de binding generada a partir de 'recuperar_clave.xml'
import com.example.myapplication.databinding.RecuperarClaveBinding

class RecuperarClaveActivity : AppCompatActivity() {

    private lateinit var binding: RecuperarClaveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicialización de View Binding
        binding = RecuperarClaveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Listener para el botón de envío
        binding.btnSendEmail.setOnClickListener {
            val email = binding.etRecoverEmail.text.toString()

            // Simulación de validación
            if (email.contains("@") && email.contains(".")) {
                showFeedbackAlertDialog("Recuperación Enviada", "Se ha enviado un correo electrónico con instrucciones a ${email}.")
            } else {
                showFeedbackAlertDialog("Error de Formato", "Por favor, ingresa un correo electrónico válido.")
            }
        }
    }

    /**
     * Muestra un AlertDialog con un mensaje de retroalimentación (2.1.2).
     */
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