package com.cookandroid.self_4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.ArithmeticException
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var edit1: EditText
    lateinit var edit2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMul: Button
    lateinit var btnDiv: Button
    lateinit var btnRem: Button
    lateinit var textResult: TextView
    lateinit var num1: String
    lateinit var num2: String
    var result: Double? = null // 실수값으로 계산`

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기(수정)"

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)

        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)
        btnRem = findViewById<Button>(R.id.BtnRem)

        textResult = findViewById<TextView>(R.id.TextResult)

        btnAdd.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            // num1이나 num2가 비어 있다면

            try{
                result = num1.toDouble() + num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
            }catch (e: NumberFormatException){
                Toast.makeText(applicationContext, "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                    .show()
            }catch (e: Exception){
                Toast.makeText(applicationContext, "에러가 발생 했습니다", Toast.LENGTH_SHORT)
                    .show()
            }

        }

        btnSub.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            try{
                result = num1.toDouble() - num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
            }catch (e: NumberFormatException){
                Toast.makeText(applicationContext, "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                    .show()
            }catch (e: Exception){
                Toast.makeText(applicationContext, "에러가 발생 했습니다", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        btnMul.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            try{
                result = num1.toDouble() * num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
            }catch (e: NumberFormatException){
                Toast.makeText(applicationContext, "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                    .show()
            }catch (e: Exception){
                Toast.makeText(applicationContext, "에러가 발생 했습니다", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        btnDiv.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            try {
                var intResult = num1.toInt() / num2.toInt()
                textResult.text = "계산 결과 : " + intResult.toString()
            }catch(e:ArithmeticException){
                Toast.makeText(applicationContext, "0으로 나눌수 없습니다", Toast.LENGTH_SHORT)
                    .show()
            }catch (e: NumberFormatException){
                Toast.makeText(applicationContext, "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                    .show()
            }catch (e: Exception){
                Toast.makeText(applicationContext, "에러가 발생 했습니다", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        btnRem.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            try{
                result = num1.toDouble() % num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
            }catch (e: NumberFormatException){
                Toast.makeText(applicationContext, "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                    .show()
            }catch (e: Exception){
                Toast.makeText(applicationContext, "에러가 발생 했습니다", Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }

}
