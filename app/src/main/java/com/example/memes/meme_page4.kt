package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme_page4 : AppCompatActivity() {
    lateinit var tvNext4: TextView
    lateinit var tvPrevious4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page4)
        tvNext4 = findViewById(R.id.tvNext4)
        tvPrevious4 = findViewById(R.id.tvPrevious4)
        tvNext4.setOnClickListener {
            val intent = Intent(this,meme_page5::class.java)
            startActivity(intent)
        }
        tvPrevious4.setOnClickListener {
            val intent = Intent(this,meme_page3::class.java)
            startActivity(intent)
        }
    }
}