package com.example.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aceptarBtn = findViewById<Button>(R.id.button)
        val nombreEt = findViewById<EditText>(R.id.editTextTextPersonName)
        val validacionCb = findViewById<CheckBox>(R.id.checkBox)

        aceptarBtn.setOnClickListener(View.OnClickListener{
            if (nombreEt.text.isNullOrEmpty()){
                Toast.makeText(this, "Introduce tu nombre", Toast.LENGTH_LONG).show()
            }
            else{
                if(validacionCb.isChecked){
                    Toast.makeText(this, "Hola " + nombreEt.text + ", sabemos que te gusta Kotlin" , Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this, "Hola " + nombreEt.text, Toast.LENGTH_LONG).show()
                }
            }
        })
    }
}