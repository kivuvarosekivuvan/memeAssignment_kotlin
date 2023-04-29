package com.example.memeassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeTwoActivity : AppCompatActivity() {
    lateinit var tvPreviousone:TextView
    lateinit var tvNexttwo:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_two)
        tvPreviousone = findViewById(R.id.tvPreviousone)
        tvPreviousone.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        tvNexttwo = findViewById(R.id.tvNexttwo)
        tvNexttwo.setOnClickListener {
            val intent = Intent(this, MemeThreeActivity::class.java)
            startActivity(intent)
        }
    }
}