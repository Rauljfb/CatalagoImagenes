package com.example.catalagoimagenes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val correo=findViewById<TextView>(R.id.Correo)
        val clave=findViewById<TextView>(R.id.Clave)
        val registrar=findViewById<Button>(R.id.Registrar)
        val ingresar=findViewById<Button>(R.id.Ingresar)

        registrar.setOnClickListener {

            val intent = Intent (this,Registrar::class.java)
            startActivity(intent)
        }
        ingresar.setOnClickListener {
            if (correo.text.toString()==""|| clave.text.toString()=="")
            {
                Toast.makeText(this, "Llenar los campos vacios", Toast.LENGTH_LONG).show()
            }
            else{
            val intent = Intent (this,Ingresar::class.java)
            startActivity(intent)
            }
        }
    }
}