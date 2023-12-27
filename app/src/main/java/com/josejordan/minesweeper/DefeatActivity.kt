package com.josejordan.minesweeper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DefeatActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_defeat)
        button = findViewById(R.id.button7)
        button.setOnClickListener {
            val intent: Intent = Intent(this@DefeatActivity,MenuActivity::class.java)
            startActivity(intent)
        }
    }
}