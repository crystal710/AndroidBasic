package com.cookandroid.project_5_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

//    lateinit var edit1 : EditText
//    lateinit var btnNum1 : Button
//    lateinit var btnNum2 : Button

//    var numButtons = ArrayList<Button>(10)

    lateinit internal var edit1 : EditText
    lateinit internal var edit2 : EditText
    lateinit internal var btnAdd : Button
    lateinit internal var btnSub : Button
    lateinit internal var btnMul : Button
    lateinit internal var btnDiv : Button
    lateinit internal var textResult : TextView
    lateinit internal var num1 : String
    lateinit internal var num2 : String
    internal var result : Int? = null
    internal var numButtons = ArrayList<Button>(10)
    internal var numBtnIDs = arrayOf(R.id.BtnNum0,R.id.BtnNum1,R.id.BtnNum2,R.id.BtnNum3,R.id.BtnNum4,R.id.BtnNum5,R.id.BtnNum6,R.id.BtnNum7,R.id.BtnNum8,R.id.BtnNum9)
    internal var i : Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "테이블 레이아웃 계산기"

        edit1 = findViewById(R.id.Edit1)
        edit2 = findViewById(R.id.Edit2)
        btnAdd = findViewById(R.id.BtnAdd)
        btnSub = findViewById(R.id.BtnSub)
        btnMul = findViewById(R.id.BtnMul)
        btnDiv = findViewById(R.id.BtnDiv)

        textResult = findViewById(R.id.TextResult)

        btnAdd.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            result = Integer.parseInt(num1 ) + Integer.parseInt(num2)
            textResult.text = "계산결과 : " + result.toString()
        }
        btnSub.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            result = Integer.parseInt(num1 ) - Integer.parseInt(num2)
            textResult.text = "계산결과 : " + result.toString()

        }
        btnMul.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            result = Integer.parseInt(num1 ) * Integer.parseInt(num2)
            textResult.text = "계산결과 : " + result.toString()

        }

        btnDiv.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            try {
                result = Integer.parseInt(num1) / Integer.parseInt(num2)

                Toast.makeText(
                    applicationContext, "result = " + result, Toast.LENGTH_SHORT).show()

                textResult.text = "계산 결과 : " + result.toString()

            }  catch (e:java.lang.ArithmeticException){
                Toast.makeText(applicationContext,"에러났어", Toast.LENGTH_SHORT).show()
                textResult.text = "0으로 못나눠"
            } catch (e:Exception){
                Toast.makeText(applicationContext,"에러남",Toast.LENGTH_SHORT).show()
            }

        }



        for (i in 0..9 step 1){
            numButtons.add(findViewById(numBtnIDs[i]))
        }

        for (i in 0..numBtnIDs.size-1 step 1){
            numButtons[i].setOnClickListener {
                if (edit1.isFocused == true){
                    num1 = edit1.text.toString() + numButtons[i].getText().toString()
                    edit1.setText(num1)
                } else if (edit2.isFocused == true){
                    num2 = edit2.text.toString() + numButtons[i].getText().toString()
                    edit2.setText(num2)
                } else {
                    Toast.makeText(applicationContext,"먼저 에디트 텍스트를 선택하세요", Toast.LENGTH_SHORT).show()
                }
            }
        }
//        numButtons.add(findViewById(R.id.BtnNum0))
//        numButtons.add(findViewById(R.id.BtnNum1))
//        numButtons.add(findViewById(R.id.BtnNum2))
//        numButtons.add(findViewById(R.id.BtnNum3))
//        numButtons.add(findViewById(R.id.BtnNum4))
//        numButtons.add(findViewById(R.id.BtnNum5))
//        numButtons.add(findViewById(R.id.BtnNum6))
//        numButtons.add(findViewById(R.id.BtnNum7))
//        numButtons.add(findViewById(R.id.BtnNum8))
//        numButtons.add(findViewById(R.id.BtnNum9))

//        edit1 = findViewById(R.id.Edit1)
//        for(i in 0 .. 9 step 1 ){
//            numButtons[i].setOnClickListener {
//                Toast.makeText(applicationContext,"숫자버튼 아무거나 눌러도 여기가 실행!!!",Toast.LENGTH_SHORT).show()
//                Toast.makeText(applicationContext,"i = " + i , Toast.LENGTH_SHORT).show()
//                Toast.makeText(applicationContext,"numButtons[i].text = " + numButtons[i].text,Toast.LENGTH_SHORT).show()
//
//                if(edit1.isFocused == true){
//                    edit1.setText(edit1.text.toString() + numButtons[i].text.toString())
//                }else {
//                    Toast.makeText(applicationContext,"선택!!",Toast.LENGTH_SHORT).show()
//                }
//            }
//        }
//        btnNum1 = findViewById(R.id.BtnNum1)
//        btnNum2 = findViewById(R.id.BtnNum2)

//        btnNum1.setOnClickListener {
//            Toast.makeText(applicationContext,"숫자 1 버튼 클릭",Toast.LENGTH_SHORT).show()
//
//            Toast.makeText(applicationContext,"btnNum1.text = " + btnNum1.text, Toast.LENGTH_SHORT).show()
//
//            Toast.makeText(applicationContext,"edit1.isFocused = "+ edit1.isFocused,Toast.LENGTH_SHORT).show()
//
//            Toast.makeText(applicationContext,"edit1.text = "+ edit1.text ,Toast.LENGTH_SHORT).show()
//
//            if(edit1.isFocused == true) {
//                edit1.setText(edit1.text.toString() + btnNum1.text.toString())
//            }else {
//                Toast.makeText(applicationContext,"먼저 에디트 텍스트 선택!!!", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnNum2.setOnClickListener {
//            if(edit1.isFocused == true) {
//                edit1.setText(edit1.text.toString() + btnNum2.text.toString())
//            }else {
//                Toast.makeText(applicationContext,"먼저 에디트 텍스트 선택!!!", Toast.LENGTH_SHORT).show()
//            }
//
//        }
    }
}
