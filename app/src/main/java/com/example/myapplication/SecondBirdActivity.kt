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
import java.nio.channels.Pipe

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        val btnNext1 = findViewById<ImageView>(R.id.btnNext1)
//        val btnNext2 = findViewById<ImageView>(R.id.btnNext2)

        binding.btnNext.setOnClickListener{
            finish()
        }
        binding.btnNext.setOnClickListener{
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
Picasso
    .get()
    .load("https://images.unsplash.com/photo-1517384868864-276f83bfd275?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGltYWdlJTIwZm9yJTIwYmlyZHxlbnwwfHwwfHx8MA%3D%3D")
    .into(binding.imageView3)
    }
}