package com.cookandroid.project4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {


    lateinit var rGroup1 : RadioGroup
    lateinit var imgPet : ImageView
    lateinit var btnOK : Button
    lateinit var chkAgree : CheckBox
    lateinit var text1 : TextView
    lateinit var switch1 : Switch
    lateinit var rdoCat : RadioButton
    lateinit var rdoRabbit : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rdoCat = findViewById(R.id.RdoCat)
        rdoRabbit = findViewById(R.id.RdoRabbit)
        text1 = findViewById(R.id.Text1)
        rGroup1 = findViewById(R.id.Rgroup1)
        imgPet = findViewById(R.id.ImgPet)
        btnOK = findViewById(R.id.btnOK)

        btnOK.setOnClickListener {
            Toast.makeText(applicationContext, "버튼클릭" , Toast.LENGTH_SHORT).show()

            Toast.makeText(applicationContext, "선택한 Radio 아이디 = " + rGroup1.checkedRadioButtonId , Toast.LENGTH_SHORT).show()

            Toast.makeText(applicationContext, "강아지 Radio 아이디 = " + R.id.RdoDog , Toast.LENGTH_SHORT).show()

            Toast.makeText(applicationContext, "고양이 Radio 아이디 = " + R.id.RdoCat , Toast.LENGTH_SHORT).show()

            Toast.makeText(applicationContext, "토끼 Radio 아이디 = " + R.id.RdoRabbit , Toast.LENGTH_SHORT).show()

            when(rGroup1.checkedRadioButtonId){
                R.id.RdoDog -> ImgPet.setImageResource(R.drawable.dog)
                R.id.RdoCat -> ImgPet.setImageResource(R.drawable.cat)
//                R.id.RdoRabbit -> ImgPet.setImageResource(R.drawable.rabbit)
                else ->Toast.makeText(applicationContext,"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show()

            }
        }
        chkAgree= findViewById(R.id.ChkAgree)
        chkAgree.setOnCheckedChangeListener{ compoundButton, b->
            Toast.makeText(applicationContext,"체크버튼 눌렀네", Toast.LENGTH_SHORT).show()
            Toast.makeText(applicationContext, "chkAgree.isChecked = " + chkAgree.isChecked, Toast.LENGTH_SHORT).show()

            if(chkAgree.isChecked == true){
                text1.visibility = View.VISIBLE
                rGroup1.visibility = View.VISIBLE
            } else{
                text1.visibility = View.INVISIBLE
                rGroup1.visibility = View.INVISIBLE
            }
        }

        switch1 = findViewById(R.id.Switch1)

        switch1.setOnCheckedChangeListener { compounButton, b->
            Toast.makeText(
                applicationContext,"Sitch 클릭!!" , Toast.LENGTH_SHORT
            ).show()
            Toast.makeText(
                applicationContext,"switch1.isChecked = " + switch1.isChecked , Toast.LENGTH_SHORT
            ).show()

            if(switch1.isChecked == true){
                text1.visibility = View.VISIBLE
                rGroup1.visibility = View.VISIBLE
                rGroup1.clearCheck()
                rGroup1.check(R.id.RdoCat)
            } else {
                text1.visibility = View.INVISIBLE
                rGroup1.visibility = View.INVISIBLE
            }
        }

        rdoRabbit.setOnClickListener {
            Toast.makeText(applicationContext,"토끼 눌렀다", Toast.LENGTH_SHORT).show()
            imgPet.setImageResource(R.drawable.rabbit)
        }

    }
}
