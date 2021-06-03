package com.cookandroid.project4_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var switch1 : Switch
    lateinit var rGroup1 : RadioGroup
    lateinit var rdoOreo : RadioButton
    lateinit var rdoPie : RadioButton
    lateinit var rdoQ10 : RadioButton
    lateinit var finish : Button
    lateinit var new : Button
    lateinit var imgAndroid : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "좋아하는 안드로이드"

        text1 = findViewById(R.id.Text1)
        switch1 = findViewById(R.id.Switch1)

        text2 = findViewById(R.id.Text2)
        rGroup1 = findViewById(R.id.Rgroup1)
        rdoOreo = findViewById(R.id.RdoOreo)
        rdoPie = findViewById(R.id.RdoPie)
        rdoQ10 = findViewById(R.id.RdoQ10)

        finish = findViewById(R.id.Finish)
        new = findViewById(R.id.New)
        imgAndroid = findViewById(R.id.ImgAndroid)

        switch1.setOnCheckedChangeListener { compoundButton, b ->

            if(switch1.isChecked == true) {
                text2.visibility = View.VISIBLE
                rGroup1.visibility = View.VISIBLE
                finish.visibility = View.VISIBLE
                new.visibility = View.VISIBLE
                imgAndroid.visibility = View.VISIBLE
                rGroup1.check(R.id.RdoPie)
                imgAndroid.setImageResource(R.drawable.pie)
            }else {
                text2.visibility = View.INVISIBLE
                rGroup1.visibility = View.INVISIBLE
                finish.visibility = View.INVISIBLE
                new.visibility = View.INVISIBLE
                imgAndroid.visibility = View.INVISIBLE

            }
            rdoOreo.setOnClickListener {
                Toast.makeText(applicationContext,"오레오 눌렀다", Toast.LENGTH_SHORT).show()
                imgAndroid.setImageResource(R.drawable.oreo)
            }
            rdoPie.setOnClickListener {
                Toast.makeText(applicationContext,"파이 눌렀다", Toast.LENGTH_SHORT).show()
                imgAndroid.setImageResource(R.drawable.pie)
            }
            rdoQ10.setOnClickListener {
                Toast.makeText(applicationContext,"Q 눌렀다", Toast.LENGTH_SHORT).show()
                imgAndroid.setImageResource(R.drawable.q10)
            }
        }

        finish.setOnClickListener { finish() }

        new.setOnClickListener {
            rGroup1.clearCheck()
            rGroup1.check(R.id.RdoPie)
            imgAndroid.setImageResource(R.drawable.pie)
        }
    }
}