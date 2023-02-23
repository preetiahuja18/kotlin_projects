package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {// appcompatactiviy parent class haii
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //activity_main yeh ek design file se link haii

    val buttonUpload=findViewById<Button>(R.id.btnUpload)
    val buttonDownload=findViewById<Button>(R.id.btnDownload)
    buttonUpload.setOnClickListener {
        Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
    }
    buttonDownload.setOnClickListener {
        Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_SHORT).show()
    }
    }
}