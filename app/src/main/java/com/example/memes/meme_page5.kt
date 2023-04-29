package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme_page5 : AppCompatActivity() {
    lateinit var tvNext5: TextView
    lateinit var tvPrevious5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page5)
        tvNext5 = findViewById(R.id.tvNext5)
        tvPrevious5 = findViewById(R.id.tvPrevious5)
        tvNext5.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        tvPrevious5.setOnClickListener {
            val intent = Intent(this,meme_page4::class.java)
            startActivity(intent)
        }
    }
}