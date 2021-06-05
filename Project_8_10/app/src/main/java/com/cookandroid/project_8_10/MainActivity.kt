package com.cookandroid.project_8_10

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ActivityCompat.requestPermissions(
            this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),
            Context.MODE_PRIVATE)

        var btnRead : Button
        var edtSD  : EditText
        btnRead = findViewById(R.id.BtnRead)
        edtSD = findViewById(R.id.EdtSD)

        btnRead.setOnClickListener {
            try {
                var inFs = FileInputStream("/storage/emulated/0/my_test.txt")
                var txt = ByteArray(inFs.available())

                inFs.read(txt)
                edtSD.setText(txt.toString(Charsets.UTF_8))
                inFs.close()
            } catch (e:IOException){
                edtSD.setText("파일이 없구먼")
            }
        }

        var btnWrite : Button
        btnWrite = findViewById(R.id.BtnWrite)
        btnWrite.setOnClickListener {
            var outString = edtSD.text.toString()
            println("btnWrite.click:outString = "+ outString)
            var outFs = FileOutputStream("/storage/emulated/0/my_test.txt")
            outFs.write(outString.toByteArray())
            outFs.close()

            edtSD.setText("my_test.txt에 저장 완료!!!!!!!!!")
        }
    }
}
