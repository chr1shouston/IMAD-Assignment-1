package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    private lateinit var btnMakeSpark: Button
    private lateinit var tvSparkResult: TextView
    private lateinit var edtTimeOfDay: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMakeSpark = findViewById(R.id.btnMakeSpark)
        tvSparkResult = findViewById(R.id.tvSparkResult)
        edtTimeOfDay = findViewById(R.id.edtTimeOfDay)


            btnMakeSpark.setOnClickListener {
                when (edtTimeOfDay.text.toString()) {
                    "Morning" -> tvSparkResult.text = "morning spark"
                else -> tvSparkResult.text = "please enter something else"}
            }


            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
