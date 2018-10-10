package com.kotlin.operadores.calculaldora.caluladora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //directo desde el boton
       /* btnSumar.setOnClickListener {
            var primero = txtOpe1.text.toString()
            var segundo = txtOpe2.text.toString()
            txtresultado.setText(primero.toInt() + segundo.toInt())
        }*/
    }

    fun sumar(view : View){
        var primero = txtOpe1.text.toString()
        var segundo = txtOpe2.text.toString()
        var resultado = primero.toInt() + segundo.toInt()
        txtresultado.setText(resultado.toString())
    }

    fun restar(view : View){
        var primero = txtOpe1.text.toString()
        var segundo = txtOpe2.text.toString()
        var resultado = primero.toInt() - segundo.toInt()
        txtresultado.setText(resultado.toString())
    }

    fun multiplicar(view : View){
        var primero = txtOpe1.text.toString()
        var segundo = txtOpe2.text.toString()
        var resultado = primero.toInt() * segundo.toInt()
        txtresultado.setText(resultado.toString())
    }

    fun dividir(view : View){
        var primero = txtOpe1.text.toString()
        var segundo = txtOpe2.text.toString()
        var resultado = primero.toInt() / segundo.toInt()
        txtresultado.setText(resultado.toString())
    }
}
