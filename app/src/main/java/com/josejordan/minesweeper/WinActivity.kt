package com.josejordan.minesweeper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class WinActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)
        button = findViewById(R.id.button6)
        button.setOnClickListener {
            val intent: Intent = Intent(this@WinActivity,MenuActivity::class.java)
            startActivity(intent)
        }
    }
}