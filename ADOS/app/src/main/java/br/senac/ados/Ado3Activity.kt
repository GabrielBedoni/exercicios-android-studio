package br.senac.ados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import br.senac.ados.databinding.ActivityAdo1Binding
import br.senac.ados.databinding.ActivityAdo3Binding

class Ado3Activity : AppCompatActivity() {

    lateinit var b : ActivityAdo3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAdo3Binding.inflate(layoutInflater)
        setContentView(b.root)


        b.spinner.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
            arrayOf("Simpson","Madagascar"))

        b.spinner2.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
            arrayOf("War","COD"))

        b.spinner3.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
            arrayOf("POP","FUNK"))

    }
}