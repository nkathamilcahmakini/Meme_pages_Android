package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme_page3 : AppCompatActivity() {
    lateinit var tvNext3: TextView
    lateinit var tvPrevious3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page3)
        tvNext3 = findViewById(R.id.tvNext3)
        tvPrevious3 = findViewById(R.id.tvPrevious3)
        tvNext3.setOnClickListener {
            val intent = Intent(this,meme_page4::class.java)
            startActivity(intent)
        }
        tvPrevious3.setOnClickListener {
            val intent = Intent(this,meme_page2::class.java)
            startActivity(intent)
        }
    }
}