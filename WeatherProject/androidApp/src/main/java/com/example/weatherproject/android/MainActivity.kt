package com.example.weatherproject.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import com.example.weatherproject.Greeting
import android.widget.TextView
import com.example.weatherproject.Platform

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    lateinit var clickBtn: Button
    var countClicks = 0
    lateinit var countTextView: TextView
    lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countTextView = findViewById(R.id.count_text)
        progressBar = findViewById(R.id.progressBar)
        progressBar.progress = 0
        val tv: TextView = findViewById(R.id.text_view)
        clickBtn = findViewById(R.id.btn_click)
        clickBtn.text = Greeting().getSystemName()
        tv.text = greet()

        clickBtn.setOnClickListener {
            countClicks++;
            countTextView.text = countClicks.toString()
            progressBar.progress += 1
        }
    }
}
