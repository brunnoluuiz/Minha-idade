package com.example.minhaidade

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate


class AgeByDateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age_by_date)

        val etAnoNascimentoOne = findViewById<EditText>(R.id.etAnoNascimentoOne)
        val tvIdadeOne = findViewById<TextView>(R.id.tvIdadeOne)
        val btCalcularOne = findViewById<Button>(R.id.btCalcularOne)

        btCalcularOne.setOnClickListener {
            val ano = LocalDate.now()


        }
    }
}