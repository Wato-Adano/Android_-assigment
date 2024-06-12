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

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding. btnNext = findViewById<ImageView>(R.id.btnNext)
       binding. btnNext.setOnClickListener {
            val intent = Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)
        }
      Picasso
          .get()
          .load("https://images.unsplash.com/photo-1628597556959-20b19d81fec5?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGltYWdlJTIwZm9yJTIwYmlyZHN8ZW58MHx8MHx8fDA%3D")
          .centerCrop()
          .resize(500,500)
          .into(binding.imageView)
    }
}