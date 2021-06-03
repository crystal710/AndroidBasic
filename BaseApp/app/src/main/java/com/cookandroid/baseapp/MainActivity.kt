package com.cookandroid.baseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button1)
        println("btn 속성에 아이디 button1 인 화면 버튼 저장")
        println("btn 속성에 저장된 값 = " + btn)

        btn.setOnClickListener {
            println("버튼 눌렀냐?")
            var message = Toast.makeText(this, "버튼 눌렀어요!!!",Toast.LENGTH_LONG)
            message.show()

            Toast.makeText(applicationContext, "난 두번째 메시지!!!",Toast.LENGTH_SHORT).show()
        }
    }
}
