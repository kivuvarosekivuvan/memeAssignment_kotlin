package com.example.memeassignment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeThreeActivity : AppCompatActivity() {
    lateinit var tvPrevioustwo:TextView
    lateinit var tvNext:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_three)
        tvPrevioustwo = findViewById(R.id.tvPrevioustwo)
        tvPrevioustwo.setOnClickListener {
            val intent = Intent(this, MemeTwoActivity::class.java)
            startActivity(intent)
        }
        tvNext = findViewById(R.id.tvNext)
        tvNext.setOnClickListener {
            val intent = Intent(this, MemeFourActivity::class.java)
            startActivity(intent)
        }
    }
}