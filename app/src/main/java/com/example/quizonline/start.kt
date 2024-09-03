package com.example.quizonline

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizonline.databinding.ActivityMainBinding
import com.example.quizonline.databinding.ActivityStartBinding
import com.example.quizonline.databinding.ScoreDialogBinding

class start : AppCompatActivity() {
    lateinit var binding: ActivityStartBinding
            override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
             enableEdgeToEdge()
                binding = ActivityStartBinding.inflate(layoutInflater)
                setContentView(binding.root)

                binding.buttonst.setOnClickListener{
                    intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                    finish()

        }

    }
}