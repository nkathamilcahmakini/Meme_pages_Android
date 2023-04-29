package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme_page2 : AppCompatActivity() {
    lateinit var tvNext2: TextView
    lateinit var tvPrevious2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page2)
        tvNext2 = findViewById(R.id.tvNext2)
        tvPrevious2 = findViewById(R.id.tvPrevious2)
        tvNext2.setOnClickListener {
            val intent = Intent(this,meme_page3::class.java)
            startActivity(intent)
        }
        tvPrevious2.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}