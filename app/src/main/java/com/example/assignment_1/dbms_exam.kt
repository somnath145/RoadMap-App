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

class dbms_exam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dbms_exam2)
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
            val options = arrayOf("1. Both can have null values.","2. Only primary key can have null value","3. Only unique key can have null value","4. Both can not have null value")
            dialogbox.setTitle("What is the difference between a primary key and a unique key ?")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="4. Both can not have null value"){
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
            val options = arrayOf("It's a precess to reduce redundancy and improve data integrity","It's a technique to increase data redundancy","It's used to create complex relationships between tables.","It's a method to optimize query performance")
            dialogbox.setTitle("Explain the concept of normalization in DBMS")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="It's a precess to reduce redundancy and improve data integrity"){
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
            val options = arrayOf("Atomicity,Consistency,Integrity,Durability","Atomicity,Consistency,Isolation,Durability","Availability,Consistency,Integrity,Durability","Atomicity,Consistency,Isolation,Depandability")
            dialogbox.setTitle("What is the ACID property in DBMS")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="Atomicity,Consistency,Isolation,Durability"){
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
            val options = arrayOf("INNER JOIN","OUTER JOIN","LEFT JOIN","RIGHT JOIN","FULL OUTER JOIN")
            dialogbox.setTitle("Which of the following are the type of JOIN options in SQL ?")
            dialogbox.setMultiChoiceItems(options,null,
                DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                if(options[which]=="INNER JOIN" || options[which]=="OUTER JOIN" || options[which]=="LEFT JOIN" || options[which]=="RIGHT JOIN" || options[which]=="ULL OUTER JOIN"){
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
            val options = arrayOf("Atomicity","Consistency","Isolation","Durability","Integrity")
            dialogbox.setTitle("Which of the following are valid ACID properties in a database system ?")
            dialogbox.setMultiChoiceItems(options,null,
                DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                if(options[which]=="Atomicity" || options[which]=="Consistency" || options[which]=="Isolation" || options[which]=="Durability"){
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
            val options = arrayOf("A single SQL statement","A group of SQL statement that are treated as a single unit of work","A database object","A data type")
            dialogbox.setTitle("What is transaction in DBMS ?")
            dialogbox.setSingleChoiceItems(options,10,
                DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="A group of SQL statement that are treated as a single unit of work"){
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