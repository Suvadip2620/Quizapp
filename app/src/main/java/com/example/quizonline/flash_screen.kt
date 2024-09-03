package com.example.quizonline

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizonline.databinding.ActivityFlashScreenBinding

class flash_screen : AppCompatActivity() {

    //lateinit var binding:flash_screen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       // binding = ActivityFlashScreenBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_flash_screen)

        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this, start::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}