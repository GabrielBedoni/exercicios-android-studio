package br.senac.ados

import android.app.AlertDialog
import android.content.Context

fun alerta(msg: String, contexto: Context){
    AlertDialog.Builder(contexto)
        .setTitle("Alerta")
        .setMessage(msg)
        .show()
}