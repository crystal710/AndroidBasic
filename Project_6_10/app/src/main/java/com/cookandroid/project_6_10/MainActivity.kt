package com.cookandroid.project_6_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var items = arrayOf("CSI-뉴욕","CSI-라스베가스","CSI-마이애미","Friends","Fringe","Lost")

        var auto = findViewById<AutoCompleteTextView>(R.id.AutoCompleteTextView1)

//        var adapter = ArrayAdapter(applicationContext, R.layout.my_complete, R.id.Text1,items)
        var adapter = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_dropdown_item_1line,
            android.R.id.text1,
            items)

        auto.setAdapter(adapter)

        var multi = findViewById<MultiAutoCompleteTextView>(R.id.MultiAutoCompleteTextView1)

        var token = MultiAutoCompleteTextView.CommaTokenizer()

        multi.setTokenizer(token)
        multi.setAdapter(adapter)
    }
}
