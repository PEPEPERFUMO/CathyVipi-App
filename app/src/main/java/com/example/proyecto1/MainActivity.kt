package com.example.proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showActivity()

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener { checkValue() }
    }


    fun checkValue(){
        val etName = findViewById<EditText>(R.id.etName)
        if(etName.text.isNotEmpty()){
            //Vamos a la siguiente pantalla
            val intent = Intent(this, Activity1::class.java)
            intent.putExtra("INTENT_NAME", etName.text)
            startActivity(intent)
        }else{
            showErrorName()
        }
    }

    fun showErrorName(){
        Toast.makeText(this, "El nombre del usuario no puede estar vacío", Toast.LENGTH_SHORT).show()
    }

    fun showActivity(){
        Toast.makeText(this, "Está en la activity 1", Toast.LENGTH_SHORT).show()
    }




}