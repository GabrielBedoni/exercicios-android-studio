package br.senac.ados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.ados.databinding.ActivityAdo1Binding

class Ado2Activity : AppCompatActivity() {

    lateinit var b : ActivityAdo1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAdo1Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.button.setOnClickListener {
            var msg = "Email: "+ b.email + ", nome" + b.nome + ",numero " + b.numero
            alerta(msg, this)
        }
    }
}