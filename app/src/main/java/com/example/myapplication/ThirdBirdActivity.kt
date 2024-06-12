package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val btnNext3 = findViewById<ImageView>(R.id.btnNext3)
//        val btnNext4 = findViewById<ImageView>(R.id.btnNext4)
       binding.btnNext3.setOnClickListener{
            finish()
        }
        binding.btnNext4.setOnClickListener{
            val intent = Intent(this,FourthBirdActivty::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1579273168855-c63546c129dd?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8aW1hZ2UlMjBmb3IlMjBiaXJkfGVufDB8fDB8fHww").into(binding.)
    }
}