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

class opp_exam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_opp_exam)
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
            val options = arrayOf("A programming paradigm that uses objects to model real-world entities.","A programming language that is used to create web applications.","A data structure used in programming.")
            dialogbox.setTitle("What is Object-Oriented Programming (OOP)?")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="A programming paradigm that uses objects to model real-world entities."){
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
            val options = arrayOf("Abstraction, Encapsulation, Inheritance, Polymorphism","Variables, Data Types, Operators, Control Flow")
            dialogbox.setTitle("What are the four pillars of OOP?")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="Abstraction, Encapsulation, Inheritance, Polymorphism"){
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
            val options = arrayOf("The ability of an object to inherit properties and methods from another object.","The process of combining data and functions that operate on that data into a single unit.","None of this")
            dialogbox.setTitle("What is encapsulation in OOP?")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="The process of combining data and functions that operate on that data into a single unit."){
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
            val options = arrayOf("Encapsulation","Polymorphism","Inheritance","Abstraction")
            dialogbox.setTitle("What is the process of creating a new class from an existing one called?")
            dialogbox.setMultiChoiceItems(options,null,
                DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                if(options[which]=="Inheritance" ){
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
            val options = arrayOf("Inheritance","Polymorphism","Encapsulation","Abstraction")
            dialogbox.setTitle("Which of the following is not a pillar of OOP?")
            dialogbox.setMultiChoiceItems(options,null,
                DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                if(options[which]=="Abstraction" ){
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
            val options = arrayOf("The ability of an object to inherit properties and methods from another object.","The ability of an object to take on different forms.","The process of creating a simplified view of a complex system.")
            dialogbox.setTitle("What is polymorphism in OOP?")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="The ability of an object to take on different forms."){
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