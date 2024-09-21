package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class take_exam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_take_exam)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val back = findViewById<Button>(R.id.back)
        val text1 = findViewById<TextView>(R.id.tv1)
        val text2 = findViewById<TextView>(R.id.tv2)
        val text3 = findViewById<TextView>(R.id.tv3)
        val text4 = findViewById<TextView>(R.id.tv4)

        back.setOnClickListener {
            finish()
        }
        text1.setOnClickListener{
            val intent = Intent(this,dsa_exam::class.java)
            startActivity(intent)
        }
        text2.setOnClickListener{
            val intent = Intent(this,dbms_exam::class.java)
            startActivity(intent)
        }
        text3.setOnClickListener{
            val intent = Intent(this,opp_exam::class.java)
            startActivity(intent)
        }
        text4.setOnClickListener{
            val intent = Intent(this,python_exam::class.java)
            startActivity(intent)
        }
    }
}