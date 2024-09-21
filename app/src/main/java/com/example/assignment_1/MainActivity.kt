package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var current_image = 0
    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this,next_bar :: class.java)
            startActivity(intent)
        }
        val next = findViewById<ImageButton>(R.id.next)
        val prev = findViewById<ImageButton>(R.id.prev)

        next.setOnClickListener{
            val current_image_string = "image$current_image"
            val current_image_int = this.resources.getIdentifier(current_image_string,"id",packageName)
            image = findViewById(current_image_int)
            image.alpha=0f

            current_image = (3 + current_image+1)%3

            val next_image_string = "image$current_image"
            val next_image_int = this.resources.getIdentifier(next_image_string,"id",packageName)
            image = findViewById(next_image_int)
            image.alpha=1f
        }
        prev.setOnClickListener{
            val current_image_string = "image$current_image"
            val current_image_int = this.resources.getIdentifier(current_image_string,"id",packageName)
            image = findViewById(current_image_int)
            image.alpha=0f

            current_image = (3 + current_image-1)%3

            val next_image_string = "image$current_image"
            val next_image_int = this.resources.getIdentifier(next_image_string,"id",packageName)
            image = findViewById(next_image_int)
            image.alpha=1f
        }

    }
}