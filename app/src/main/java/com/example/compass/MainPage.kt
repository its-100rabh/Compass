package com.example.compass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        val proceedButton = findViewById<Button>(R.id.proceed)

        proceedButton.setOnClickListener {
            val intent = Intent(this, MainActivty::class.java)
            startActivity(intent)
            finish()
        }
    }
}
