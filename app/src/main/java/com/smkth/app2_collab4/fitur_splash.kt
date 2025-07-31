package com.smkth.app2_collab4

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class fitur_splash : AppCompatActivity() {

    private lateinit var textView: TextView
    private val textToType = "Kelompok 4 Gacor!"
    private var index = 0
    private val typingDelay: Long = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitur_splash)

        textView = findViewById(R.id.typewriterText)


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}