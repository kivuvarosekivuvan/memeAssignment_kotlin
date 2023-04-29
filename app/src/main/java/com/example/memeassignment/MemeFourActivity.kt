package com.example.memeassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeFourActivity : AppCompatActivity() {
    lateinit var tvPreviousthree:TextView
    lateinit var tvNextfour:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_four)
        tvPreviousthree = findViewById(R.id.tvPreviousthree)
        tvPreviousthree.setOnClickListener {
            val intent = Intent(this, MemeThreeActivity::class.java)
            startActivity(intent)
        }
        tvNextfour = findViewById(R.id.TvNextfour)
        tvNextfour.setOnClickListener {
            val intent = Intent(this, MemeFiveActivity::class.java)
            startActivity(intent)
        }
    }
}