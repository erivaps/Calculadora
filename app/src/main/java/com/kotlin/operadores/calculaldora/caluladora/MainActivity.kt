package com.kotlin.operadores.calculaldora.caluladora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("emr1")
        var linearLayout = findViewById(R.id.linearLayout) as ConstraintLayout
        var btnAdd =  Button(this)
        println("emr1")
        btnAdd.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
        println("emr2")

        btnAdd.setText("Haz Click")
        btnAdd.setOnClickListener {
            btnAdd.setText("Hizo clic")
        }
        println("emr3")
        linearLayout.addView(btnAdd)


        //directo desde el boton
       /* btnSumar.setOnClickListener {
            var primero = txtOpe1.text.toString()
            var segundo = txtOpe2.text.toString()
            txtresultado.setText(primero.toInt() + segundo.toInt())
        }*/
    }

    fun sumar(view : View){
        var button1=view as Button
        println(button1.text)
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
