package com.example.assignment_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page_dsa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_dsa)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val learn_more = findViewById<Button>(R.id.next)
        val arr = findViewById<ImageView>(R.id.array)
        val str = findViewById<ImageView>(R.id.string)
        val stack = findViewById<ImageView>(R.id.stack)
        val ll = findViewById<ImageView>(R.id.link_list)
        val queu = findViewById<ImageView>(R.id.queue)
        val tree = findViewById<ImageView>(R.id.tree)
        val grap = findViewById<ImageView>(R.id.graph)
        val sor = findViewById<ImageView>(R.id.sorting)
        val rec = findViewById<ImageView>(R.id.recurtion)

        learn_more.setOnClickListener{
           val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://roadmap.sh/datastructures-and-algorithms")
            startActivity(intent)
        }
        arr.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=NTHVTY6w2Co")
            startActivity(intent)
        }
        str.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=W8hPsBquD6Y")
            startActivity(intent)
        }
        stack.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=7m1DMYAbdiY&t=72s")
            startActivity(intent)
        }
        ll.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=oAja8-Ulz6o&t=1091s")
            startActivity(intent)
        }
        queu.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=va_6RmSrKCg&t=330s")
            startActivity(intent)
        }
        tree.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=I_JuQ5ayPmc&list=PLkIpj7mL1E7uSElwIoJpgBnOQ8RJrYKzX")
            startActivity(intent)
        }
        grap.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=59fUtYYz7ZU&t=84s")
            startActivity(intent)
        }
        rec.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtu.be/5Boqfjissv0?si=R7REUfwpZRtp0Mp2")
            startActivity(intent)
        }
        sor.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=o4bAoo_gFBU&list=PLuZ_bd9XlByzTIP5j1aWXo7smCIxvzd2D")
            startActivity(intent)
        }
    }
}