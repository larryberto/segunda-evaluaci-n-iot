package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
// Clase de binding generada a partir de 'registrar_cuenta.xml'
// NOTA: Si tu archivo de binding se llama 'ActivityRegistrarCuentaBinding', ajústalo aquí.
import com.example.myapplication.databinding.RegistrarCuentaBinding

class RegistrarCuentaActivity : AppCompatActivity() {

    private lateinit var binding: RegistrarCuentaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = RegistrarCuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ✅ AHORA 'btnConfirmRegister' SÍ EXISTE y se vincula al listener
        binding.btnConfirmRegister.setOnClickListener {

            // Lógica simulada de registro y uso de AlertDialog (2.1.2)
            showFeedbackAlertDialog("Registro Exitoso", "Cuenta creada. Redirigiendo a la pantalla de Login.")

            // Opcional: finish() para volver a la LoginActivity
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