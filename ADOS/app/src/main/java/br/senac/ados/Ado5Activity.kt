package br.senac.ados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import br.senac.ados.databinding.ActivityAdo1Binding
import br.senac.ados.databinding.ActivityAdo3Binding
import br.senac.ados.databinding.ActivityAdo4Binding
import br.senac.ados.databinding.ActivityAdo5Binding

class Ado5Activity : AppCompatActivity() {

    lateinit var b : ActivityAdo5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAdo5Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.button2.setOnClickListener {
            var intent = Intent(this, Ado5DetalheActivity::class.java)
            intent = intent.putExtra("texto", b.editTextTextPersonName.text.toString())
            startActivity(intent)
        }
    }
}