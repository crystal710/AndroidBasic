package com.cookandroid.project_6_1

import android.graphics.Color
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    lateinit var chrono : Chronometer
    lateinit var btnStart : Button
    lateinit var btnEnd : Button
    lateinit var rdoCal : RadioButton
    lateinit var rdoTime : RadioButton
    lateinit var tPicker : TimePicker
    lateinit var calView : CalendarView
    lateinit var tvYear : TextView
    lateinit var tvMonth : TextView
    lateinit var tvDay : TextView
    lateinit var tvHour : TextView
    lateinit var tvMinute : TextView

    var selectYear : Int = 0
    var selectMonth : Int = 0
    var selectDay : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "시간 예약"

        btnStart = findViewById(R.id.BtnStart)
        btnEnd = findViewById(R.id.BtnEnd)

        chrono = findViewById(R.id.Chronometer1)

        rdoCal = findViewById(R.id.RdoCal)
        rdoTime = findViewById(R.id.RdoTime)

        tPicker = findViewById(R.id.TimePicker1)
        calView = findViewById(R.id.CalendarView1)

        tvYear = findViewById(R.id.TvYear)
        tvMonth = findViewById(R.id.TvMonth)
        tvDay = findViewById(R.id.TvDay)
        tvHour = findViewById(R.id.TvHour)
        tvMinute = findViewById(R.id.TvMinute)

        tPicker.visibility = View.INVISIBLE
        calView.visibility = View.INVISIBLE

        rdoCal.setOnClickListener {
            tPicker.visibility = View.INVISIBLE
            calView.visibility = View.VISIBLE
        }
        rdoTime.setOnClickListener {
            tPicker.visibility = View.VISIBLE
            calView.visibility = View.INVISIBLE
        }

        btnStart.setOnClickListener {
            chrono.base = SystemClock.elapsedRealtime()
            chrono.start()
            chrono.setTextColor(Color.RED)
        }

        btnEnd.setOnClickListener {
            chrono.stop()
            chrono.setTextColor(Color.BLUE)

            tvYear.text = Integer.toString(selectYear)
            tvMonth.text = Integer.toString(selectMonth)
            tvDay.text = Integer.toString(selectDay)

            tvHour.text = Integer.toString(tPicker.currentHour)
            tvMinute.text = Integer.toString(tPicker.currentMinute)
        }

        calView.setOnDateChangeListener{view, year, month, dayOfMonth ->
            selectYear = year
            selectMonth = month+1
            selectDay = dayOfMonth
        }
    }

}


