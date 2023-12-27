package com.josejordan.minesweeper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar

@Suppress("DEPRECATION")
class LoadingScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Testapp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_screen)

            Handler().postDelayed({
            val intent: Intent = Intent(this@LoadingScreenActivity, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}