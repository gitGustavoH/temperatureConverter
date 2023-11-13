package com.gustavohenrique.temperatureconverter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.res.TypedArrayUtils.getText
import com.gustavohenrique.temperatureconverter.R.id.Celsius
import java.math.BigDecimal
import java.math.BigInteger
import java.math.BigInteger.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val celsius: TextView = findViewById(R.id.Celsius)
        val f: TextView = findViewById(R.id.r)
        var resultado = 0

        fun calCelsiusToF() {
            resultado = BigDecimal.valueOf(celsius * 1.8) + 32
        }

        //



    }
}

