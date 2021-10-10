package com.example.minhaidade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class AgeByYearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age_by_year)

        val etAnoNascimento = findViewById<EditText>(R.id.etAnoNascimento)
        val tvIdade = findViewById<TextView>(R.id.tvIdade)
        val btCalcular = findViewById<Button>(R.id.btCalcular)

        btCalcular.setOnClickListener {
            val ano = Calendar.getInstance().get(Calendar.YEAR)
            val anoNascimento = etAnoNascimento.text.toString()

            if (anoNascimento.isNullOrEmpty()) {
                etAnoNascimento.error = "Digite o ano do seu nascimento"
            } else {
                tvIdade.text = "Sua Idade é : " + (ano - anoNascimento.toInt()) + " anos "
            }


        }
    }
}