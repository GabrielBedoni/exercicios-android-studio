package br.senac.ados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import br.senac.ados.databinding.ActivityAdo1Binding
import br.senac.ados.databinding.ActivityAdo3Binding
import br.senac.ados.databinding.ActivityAdo4Binding
import br.senac.ados.databinding.ActivityDetalhe5Binding

class Ado5DetalheActivity : AppCompatActivity() {

    lateinit var b : ActivityDetalhe5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityDetalhe5Binding.inflate(layoutInflater)
        setContentView(b.root)
        var msg = intent.getStringExtra("texto")
        b.textView.setText(msg)
    }

}