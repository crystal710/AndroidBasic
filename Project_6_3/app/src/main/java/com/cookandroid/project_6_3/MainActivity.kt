package com.cookandroid.project_6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
//    lateinit var tPicker : TimePicker
    lateinit var btn1  : Button
    lateinit var dPicker : DatePicker
    var selectYear : Int =0
    var selectMonth : Int = 0
    var selectDay : Int=0

    lateinit var cal1 : CalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        tPicker = findViewById(R.id.Time1)
        btn1 = findViewById(R.id.Btn1)
        cal1 = findViewById(R.id.Cal1)

        cal1.setOnDateChangeListener { calendarView, year, month, day ->

            Toast.makeText(applicationContext,
                "캘린더 날짜 선택!!! year = " + year +":month = " + month + ":day = " + day,
                Toast.LENGTH_LONG).show()

            selectYear = year
            selectMonth = (month+1)
            selectDay = day

        }

        dPicker = findViewById(R.id.Date1)

        dPicker.setOnDateChangedListener { datePicker, year, month, day ->

            Toast.makeText(applicationContext,
                "날짜 선택!!! year = " + year +":month = " + month + ":day = " + day,
                Toast.LENGTH_LONG).show()

            selectYear = year
            selectMonth = (month+1)
            selectDay = day

        }

        btn1.setOnClickListener {
            Toast.makeText(applicationContext,
                "버튼 클릭 !! selectYear = " + selectYear + ":selectMonth = " + selectMonth + ":selectDay = " + selectDay,
                Toast.LENGTH_LONG).show()
//            Toast.makeText(applicationContext,
//                "선택 시간 = " + tPicker.currentHour + ":선택 분 = "+tPicker.currentMinute,
//                Toast.LENGTH_SHORT).show()
        }

        btn1.setOnLongClickListener {
            Toast.makeText(applicationContext,"롱클릭!!!!",Toast.LENGTH_LONG).show()
            false
        }
    }
}
