package com.example.interactiveui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val mtlb bar bar hme ise button ki value ko change ni krna hai
        //ab hm 2 variables bnaaenge
        val buttonDark=findViewById<Button>(R.id.btndark)
        val buttonRead=findViewById<Button>(R.id.btnread)
        val linearLayout=findViewById<LinearLayout>(R.id.linearLayout)

        buttonRead.setOnClickListener{
            //change to read theme
           linearLayout.setBackgroundResource(R.color.yellow)
        }
        buttonDark.setOnClickListener{
            linearLayout.setBackgroundResource(R.color.black)
        }
    }
}