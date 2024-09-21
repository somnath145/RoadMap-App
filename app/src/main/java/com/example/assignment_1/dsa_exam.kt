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

class dsa_exam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dsa_exam2)
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
            val options = arrayOf("Linear Data Structure","Non-Linear Data Structure","None of this")
            dialogbox.setTitle("STACK is which type of data Structure ?")
            dialogbox.setSingleChoiceItems(options,10,DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="Linear Data Structure"){
                    Toast.makeText(this,"Correct Answer",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer",Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK",DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question2.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("FIFO","LIFO","None of this")
            dialogbox.setTitle("STACK follows _____")
            dialogbox.setSingleChoiceItems(options,10,DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="LIFO"){
                    Toast.makeText(this,"Correct Answer",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer",Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK",DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question3.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("push","pop","enqueue","dequeue")
            dialogbox.setTitle("Deletion of QUEUE is called __")
            dialogbox.setSingleChoiceItems(options,10,DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="dequeue"){
                    Toast.makeText(this,"Correct Answer",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer",Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK",DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question4.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("STACK","TREE","GRAPH","QUEUE")
            dialogbox.setTitle("None Linear data Structures are __")
            dialogbox.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                if(options[which]=="TREE" || options[which]=="GRAPH"){
                    Toast.makeText(this,"Correct Answer",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer",Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK",DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question5.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("Sigley","Daubley","Circuler","None of this")
            dialogbox.setTitle("Types of linked list __")
            dialogbox.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                if(options[which]=="Sigley" || options[which]=="Daubley" || options[which]=="Circuler"){
                    Toast.makeText(this,"Correct Answer",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer",Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK",DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
        question6.setOnClickListener {
            val dialogbox = AlertDialog.Builder(this)
            val options = arrayOf("1. STACK , 2. QUEUE ","1. QUEUE , 2. STACK ","Both follows STACK","Both follows QUEUE")
            dialogbox.setTitle("1. BFS follows ___ " +
                    "2. DFS follows ___")
            dialogbox.setSingleChoiceItems(options,10,DialogInterface.OnClickListener { dialog, which ->
                if(options[which]=="1. QUEUE , 2. STACK "){
                    Toast.makeText(this,"Correct Answer",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Wrong Answer",Toast.LENGTH_SHORT).show()
                }
            })
            dialogbox.setNegativeButton("BACK",DialogInterface.OnClickListener { dialog, which ->
            })
            dialogbox.show()
        }
    }
}