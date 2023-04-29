package com.example.memeassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvNextone :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNextone = findViewById(R.id.tvNextone)
        tvNextone.setOnClickListener {
            val intent = Intent(this, MemeTwoActivity::class.java)
            startActivity(intent)
        }
    }
}