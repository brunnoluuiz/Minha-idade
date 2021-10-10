package com.example.minhaidade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.btAno)
        button.setOnClickListener {
            val intent = Intent (this , AgeByYearActivity ::class.java)
            startActivity(intent)

            val button= findViewById<Button>(R.id.btData)
            button.setOnClickListener{
                val intent = Intent (this , AgeByDateActivity ::class.java)
                startActivity(intent)
            }

    }
}

}