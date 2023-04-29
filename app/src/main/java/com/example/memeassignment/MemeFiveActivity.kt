package com.example.memeassignment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeFiveActivity : AppCompatActivity() {
    lateinit var tvPrevious:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_five)
        tvPrevious = findViewById(R.id.tvPrevious)
        tvPrevious.setOnClickListener {
            val intent = Intent(this, MemeFourActivity::class.java)
            startActivity(intent)
        }

    }
}