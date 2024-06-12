package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FourthBirdActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_bird_activty)
        val btnNext5 = findViewById<ImageView>(R.id.btnNext5)
        val btnNext7 = findViewById<ImageView>(R.id.btnNext7)

        btnNext5.setOnClickListener{
            finish()
        }
        btnNext7.setOnClickListener{
          val intent = Intent(this,fifthBirdActivity::class.java)
            startActivity(intent)
        }
    }
}