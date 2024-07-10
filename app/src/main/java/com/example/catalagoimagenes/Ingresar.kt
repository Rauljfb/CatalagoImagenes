package com.example.catalagoimagenes
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView

class Ingresar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar)
        val buscar=findViewById<SearchView>(R.id.Buscador)
        val cars= findViewById<ImageView>(R.id.cars)
        val enredados=  findViewById<ImageView>(R.id.enredados)
        val madagascar= findViewById<ImageView>(R.id.madagascar)
        val peter= findViewById<ImageView>(R.id.peter)

        cars.setOnClickListener {
            val abrir= Intent(this, Cars::class.java)
            startActivity(abrir)
        }
        enredados.setOnClickListener {
            val abrir= Intent(this, com.example.catalagoimagenes.enredados::class.java)
            startActivity(abrir)
        }
    }
}