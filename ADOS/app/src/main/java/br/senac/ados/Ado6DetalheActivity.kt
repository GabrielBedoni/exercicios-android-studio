package br.senac.ados

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import br.senac.ados.databinding.*

class Ado6DetalheActivity : AppCompatActivity() {

    lateinit var b : ActivityAdo6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAdo6Binding.inflate(layoutInflater)
        setContentView(b.root)
        b.button3.setOnClickListener {
            var url = b.editTextTextPersonName2.text.toString()
            var intent = Intent(Intent.ACTION_VIEW)
            intent = intent.setData(Uri.parse(url))
            startActivity(intent)
        }
    }

}