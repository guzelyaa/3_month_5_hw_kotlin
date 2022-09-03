package com.example.a3month5hwkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvNumber: TextView
    private lateinit var btn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumber = findViewById(R.id.tv_number)
        btn = findViewById(R.id.btn_plus)
        btn.setOnClickListener {
            when (btn.text) {
                "+" -> when (tvNumber.text) {
                    "1" -> tvNumber.text = "2"
                    "2" -> tvNumber.text = "3"
                    "3" -> tvNumber.text = "4"
                    "4" -> tvNumber.text = "5"
                    "5" -> tvNumber.text = "6"
                    "6" -> tvNumber.text = "7"
                    "7" -> tvNumber.text = "8"
                    "8" -> tvNumber.text = "9"
                    "9" -> tvNumber.text = "10"
                    "10" -> btn.text = "-"
                }
                "-" -> when (tvNumber.text) {
                    "10" -> tvNumber.text = "9"
                    "9" -> tvNumber.text = "8"
                    "8" -> tvNumber.text = "7"
                    "7" -> tvNumber.text = "6"
                    "6" -> tvNumber.text = "5"
                    "5" -> tvNumber.text = "4"
                    "4" -> tvNumber.text = "3"
                    "3" -> tvNumber.text = "2"
                    "2" -> tvNumber.text = "1"
                    "1" -> btn.text = "+"
                }
            }
        }
    }
}
