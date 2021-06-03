package com.cookandroid.project4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var btnMod : Button
    lateinit var textResult : TextView
    lateinit var num1 : String
    lateinit var num2 : String

    var result : Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기"

        edit1 = findViewById(R.id.Edit1)
        edit2 = findViewById(R.id.Edit2)
        btnAdd = findViewById(R.id.BtnAdd)
        textResult = findViewById(R.id.TextResult)
        btnMul = findViewById(R.id.BtnMul)
        btnMod = findViewById(R.id.BtnMod)
        btnSub = findViewById(R.id.BtnSub)
        btnSub = findViewById(R.id.BtnMul)
        btnDiv = findViewById(R.id.BtnDiv)


//        btnAdd.setOnTouchListener {view, motionEvent ->
        btnAdd.setOnClickListener {
            Toast.makeText(
                applicationContext, "더하기 버튼 클릭", Toast.LENGTH_LONG).show()

                num1 = edit1.text.toString()
                Toast.makeText(
                    applicationContext,"num1 = " + num1, Toast.LENGTH_SHORT).show()

                num2 = edit2.text.toString()
                Toast.makeText(
                    applicationContext, "num2 = " + num2, Toast.LENGTH_SHORT).show()
                try {

//                result = Integer.parseInt(num1) + Integer.parseInt(num2)
                result = num1.toDouble() + num2.toDouble()

                Toast.makeText(
                    applicationContext, "result = " + result, Toast.LENGTH_SHORT).show()

                textResult.text = "계산 결과 : " +result.toString()
            }catch (e:Exception) {
                    Toast.makeText(
                        applicationContext, "에러났어 ", Toast.LENGTH_SHORT
                    ).show()
                    textResult.text = "num1 이랑 num2에 꼭 입력해"
                }
        }

        btnSub.setOnClickListener {
            Toast.makeText(
                applicationContext, "빼기 버튼 클릭", Toast.LENGTH_LONG).show()

            num1 = edit1.text.toString()
            Toast.makeText(
                applicationContext,"num1 = " + num1, Toast.LENGTH_SHORT).show()

            num2 = edit2.text.toString()
            Toast.makeText(
                applicationContext, "num2 = " + num2, Toast.LENGTH_SHORT).show()
            try {

//                result = Integer.parseInt(num1) + Integer.parseInt(num2)
                result = num1.toDouble() - num2.toDouble()

                Toast.makeText(
                    applicationContext, "result = " + result, Toast.LENGTH_SHORT).show()

                textResult.text = "계산 결과 : " +result.toString()
            }catch (e:Exception) {
                Toast.makeText(
                    applicationContext, "에러났어 ", Toast.LENGTH_SHORT
                ).show()
                textResult.text = "num1 이랑 num2에 꼭 입력해"
            }
        }

        btnMul.setOnClickListener {
            Toast.makeText(
                applicationContext, "곱하기 버튼 클릭", Toast.LENGTH_LONG).show()

            num1 = edit1.text.toString()
            Toast.makeText(
                applicationContext,"num1 = " + num1, Toast.LENGTH_SHORT).show()

            num2 = edit2.text.toString()
            Toast.makeText(
                applicationContext, "num2 = " + num2, Toast.LENGTH_SHORT).show()
            try {
                result = num1.toDouble() * num2.toDouble()

                Toast.makeText(
                    applicationContext, "result = " + result, Toast.LENGTH_SHORT).show()

                textResult.text = "계산 결과 : " +result.toString()
            }catch (e:Exception) {
                Toast.makeText(
                    applicationContext, "에러났어 ", Toast.LENGTH_SHORT
                ).show()
                textResult.text = "num1 이랑 num2에 꼭 입력해"
            }
        }

        btnDiv.setOnClickListener {
            Toast.makeText(
                applicationContext,"나누기 버튼 클릭", Toast.LENGTH_SHORT).show()

            num1 = edit1.text.toString()
            Toast.makeText(
                applicationContext,"num1 = " + num1, Toast.LENGTH_SHORT).show()

            num2 = edit2.text.toString()
            Toast.makeText(
                applicationContext, "num2 = " + num2, Toast.LENGTH_SHORT).show()

            try {
                result = num1.toDouble() / Integer.parseInt(num2)

                Toast.makeText(
                    applicationContext, "result = " + result, Toast.LENGTH_SHORT).show()

                textResult.text = "계산 결과 : " + result.toString()
            }  catch (e:java.lang.ArithmeticException){
                Toast.makeText(applicationContext,"에러났어", Toast.LENGTH_SHORT).show()
                textResult.text = "0으로 못나눠"
            }
        }

        btnMod.setOnClickListener {
            Toast.makeText(
                applicationContext, "나머지 버튼 클릭", Toast.LENGTH_LONG).show()

            num1 = edit1.text.toString()
            Toast.makeText(
                applicationContext,"num1 = " + num1, Toast.LENGTH_SHORT).show()

            num2 = edit2.text.toString()
            Toast.makeText(
                applicationContext, "num2 = " + num2, Toast.LENGTH_SHORT).show()
            try {

//                result = Integer.parseInt(num1) + Integer.parseInt(num2)
                result = num1.toDouble() % Integer.parseInt(num2)

                Toast.makeText(
                    applicationContext, "result = " + result, Toast.LENGTH_SHORT).show()

                textResult.text = "계산 결과 : " +result.toString()
            }catch (e:ArithmeticException) {
                Toast.makeText(
                    applicationContext, "에러났어 ", Toast.LENGTH_SHORT
                ).show()
                textResult.text = "0으로 못나눠"
            }
        }





    }
}
