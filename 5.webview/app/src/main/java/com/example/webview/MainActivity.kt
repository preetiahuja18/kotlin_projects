package com.example.webview

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewScreen=findViewById<WebView>(R.id.webView)

        webViewSetUp(webViewScreen)
    // function name= webviewsetup
    }

    //create new function named as webviewsetup

     private fun webViewSetUp(a: WebView){ //fun keyword is used to create function in kotlin, a is the name and webview is type
     //bracket m parameter pass kre haii
         a.webViewClient= WebViewClient() // syntax of webview
        a.apply{
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.koshal.me")

        }

     }
}