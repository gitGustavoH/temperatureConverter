package com.gustavohenrique.temperatureconverter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.res.TypedArrayUtils.getText
import com.gustavohenrique.temperatureconverter.R.id.Celsius
import com.gustavohenrique.temperatureconverter.R.id.textoResultado
import java.math.BigDecimal
import java.math.BigInteger
import java.math.BigInteger.*

class MainActivity : AppCompatActivity() {

    lateinit var textoResultado: TextView
    var resultado = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textoResultado = findViewById<TextView>(R.id.textoResultado)
    }

    fun formatDecimal(number: Double, decimalPlaces: Int): String {
        return "%.${decimalPlaces}f".format(number)
    }


    fun calCelsiusToF(view: View) {
            var celsiusTextView: TextView = findViewById(Celsius)
            var celsiusString = celsiusTextView.text.toString()

        if (celsiusString.isNotEmpty()) {
            var celsius = celsiusString.toFloat()
             resultado = (celsius * 1.8) + 32

        val resultadoFormatado = formatDecimal(resultado, 2)

        textoResultado.text = resultadoFormatado
        } else {
            textoResultado.text = "The box is empty"
        }

    }

    fun calFtoCelsius(view: View) {
        var fTextView: TextView = findViewById(R.id.r)
        var fString: String = fTextView.text.toString()

        if (fString.isNotEmpty()) {
            var f = fString.toFloat()
            resultado = (f - 32) / 1.8


        val resultadoFormatado = formatDecimal(resultado, 2)

        textoResultado.text = resultadoFormatado
        } else {
            textoResultado.text = "The box is empty"
        }


    }
}





