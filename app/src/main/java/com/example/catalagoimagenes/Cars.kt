package com.example.catalagoimagenes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Cars : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)
        val regresar=findViewById<Button>(R.id.regresar)
        /*val correo1=findViewById<TextView>(R.id.Correo)
        val clave1=findViewById<TextView>(R.id.Clave)*/
        regresar.setOnClickListener {
            val atras= Intent(this, MainActivity::class.java)
            startActivity(atras)
            /*correo1.setText("")
            clave1.setText("")*/
        }
    }
}