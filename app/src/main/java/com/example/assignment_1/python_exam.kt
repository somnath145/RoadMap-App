package com.example.assignment_1

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class python_exam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_python_exam)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val question1 = findViewById<Button>(R.id.q1)
        val question2 = findViewById<Button>(R.id.q2)
        val question3 = findViewById<Button>(R.id.q3)
        val question4 = findViewById<Button>(R.id.q4)
        val question5 = findViewById<Button>(R.id.q5)
        val question6= findViewById<Button>(R.id.q6)

        question1.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("int","flot","str","bool")
            dialogbox.setTitle("What is the data type of x : " +
                    "x = \"Hello, World!\"")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="str"){
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK", DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question2.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("**","^","//","%")
            dialogbox.setTitle("Which operator is used for exponentiation in Python?")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="**"){
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK", DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question3.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("Returns the length of a string or list","Converts a value to an integer","Checks if a value is true or false","Prints a value to the console")
            dialogbox.setTitle("What is the purpose of the len() function in Python?")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="Returns the length of a string or list"){
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK", DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question4.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("/* This is a comment */","// This is a comment","# This is a comment","; This is a comment")
            dialogbox.setTitle("How do you comment a single line of code in Python?")
            dialogbox.setMultiChoiceItems(options,null,
                DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                if(options[which]=="# This is a comment"){
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK", DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question5.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("func","function","def","define")
            dialogbox.setTitle("Which keyword is used to define a function in Python?")
            dialogbox.setMultiChoiceItems(options,null,
                DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                if(options[which]=="def"){
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK", DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question6.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("List","Tuple","Dictionary","Set")
            dialogbox.setTitle("Which data structure in Python is used to store key-value pairs?")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="Dictionary"){
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK", DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
    }
}