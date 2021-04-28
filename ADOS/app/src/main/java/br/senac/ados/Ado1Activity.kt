package br.senac.ados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.ados.databinding.ActivityAdo1Binding
import br.senac.ados.databinding.ActivityAdo2Binding

class Ado1Activity : AppCompatActivity() {

    lateinit var b : ActivityAdo2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAdo2Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.button.setOnClickListener {
            var msg = "Email: "+ b.email + ", nome" + b.nome + ",numero " + b.numero
            if(b.checkBox3.isSelected) {
                msg = msg + "usar whats"
            } else {
                msg = msg + "usar email"
            }
            alerta(msg, this)
        }
    }
}