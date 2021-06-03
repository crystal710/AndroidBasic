package com.cookandroid.fourbutton

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnCall911 :Button
    lateinit var btnGoNate : Button
    lateinit var btnGoGallery :Button
    lateinit var btnFinish : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCall911 = findViewById(R.id.button2)
        btnCall911.setOnClickListener {
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"))
            startActivity(mIntent)
        }

        btnGoNate=findViewById(R.id.button1)
        btnGoNate.setOnClickListener {
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"))
            startActivity(mIntent)
        }

        btnGoGallery=findViewById(R.id.button3)
        btnGoGallery.setOnClickListener {
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal1/images/media"))
            startActivity(mIntent)
        }

        btnFinish=findViewById(R.id.button4)
        btnFinish.setOnClickListener { finish() }

    }
}
