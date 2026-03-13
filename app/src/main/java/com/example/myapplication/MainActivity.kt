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

    // Declaring variables
    private lateinit var btnMakeSpark: Button
    private lateinit var tvSparkResult: TextView
    private lateinit var edtTimeOfDay: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Typecasting
        btnMakeSpark = findViewById(R.id.btnMakeSpark)
        tvSparkResult = findViewById(R.id.tvSparkResult)
        edtTimeOfDay = findViewById(R.id.edtTimeOfDay)


        // Defining sparks for different times of day
        val morningSpark = "Send a 'Good morning' text to a family member!"
        val midMorningSpark = "Reach out to a colleague with a quick 'Thank you!'"
        val afternoonSpark = "Share a funny Meme or interesting link with a friend!"
        val afternoonSnackTimeSpark = "Send a quick 'Thinking of you' message!"
        val dinnerSpark = "Call a friend or relative for a 5-minute catch-up!"
        val nightSpark = "Leave a thoughtful comment on a friend's post"

        // setOnClickListener (executes the following code upon button being pressed)
        btnMakeSpark.setOnClickListener {

                    // if statements for each possible outcome
                if (edtTimeOfDay.text.toString().lowercase() == "morning"){
                    // Display the appropriate result to the TextView
                    tvSparkResult.text = morningSpark
                }

                else if (edtTimeOfDay.text.toString().lowercase() == "mid morning" ||
                    edtTimeOfDay.text.toString().lowercase() == "mid-morning"){

                    tvSparkResult.text = midMorningSpark

                }

                else if (edtTimeOfDay.text.toString().lowercase() == "afternoon"){
                    tvSparkResult.text = afternoonSpark
                }

                else if (edtTimeOfDay.text.toString().lowercase() == "afternoon"){
                    tvSparkResult.text = afternoonSnackTimeSpark
                }

                else if (edtTimeOfDay.text.toString().lowercase() == "dinner"){
                    tvSparkResult.text = dinnerSpark
                }

                else if (edtTimeOfDay.text.toString().lowercase() == "after dinner" ||
                    edtTimeOfDay.text.toString().lowercase() == "night"){
                    tvSparkResult.text = nightSpark
                }
                // else statement handles any other / invalid input
                else {
                    tvSparkResult.text = "Please enter a valid time of day"
                }



            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}