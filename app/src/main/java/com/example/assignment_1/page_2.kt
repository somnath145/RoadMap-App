package com.example.assignment_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val dsa = findViewById<CardView>(R.id.dsa)
        val dbms = findViewById<CardView>(R.id.dbms)
        val opp = findViewById<CardView>(R.id.opp)
        val python = findViewById<CardView>(R.id.python)
        val ai = findViewById<CardView>(R.id.ai)
        val ml = findViewById<CardView>(R.id.ml)
        val exam = findViewById<Button>(R.id.exam)

        dsa.setOnClickListener{
            val intent = Intent(this,page_dsa :: class.java)
            startActivity(intent)
        }
        dbms.setOnClickListener{
            val intent = Intent(this,dbms_page :: class.java)
            startActivity(intent)
        }
        opp.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=bSrm9RXwBaI&t=1178s")
            startActivity(intent)
        }
        python.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=UrsmFxEIp5k")
            startActivity(intent)
        }
        ai.setOnClickListener{
            val intent = Intent(this,ai_page :: class.java)
            startActivity(intent)
        }
        ml.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://aigents.co/learn/roadmaps/machine-learning-roadmap")
            startActivity(intent)
        }
        exam.setOnClickListener {
            val intent = Intent(this,take_exam::class.java)
            startActivity(intent)
        }

    }
}