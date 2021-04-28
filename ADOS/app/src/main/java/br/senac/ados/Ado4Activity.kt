package br.senac.ados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import br.senac.ados.databinding.ActivityAdo1Binding
import br.senac.ados.databinding.ActivityAdo3Binding
import br.senac.ados.databinding.ActivityAdo4Binding

class Ado4Activity : AppCompatActivity() {

    lateinit var b : ActivityAdo4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAdo4Binding.inflate(layoutInflater)
        setContentView(b.root)


        b.spinner.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
            arrayOf("Filme", "Jogo"))

        b.spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent:AdapterView<*>, view: View, position: Int, id: Long){
                if(position == 0) {
                        criarArray(arrayOf("Madagascar", "Planeta dos macacos"))
                } else {
                    criarArray2(arrayOf("COD","Candy Crush"))
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>){

            }
        }

    }

    fun criarArray(array: Array<String>) {
        b.spinner2.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
            array)
    }

    fun criarArray2(array: Array<String>) {
        b.spinner2.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
            array)
    }
}