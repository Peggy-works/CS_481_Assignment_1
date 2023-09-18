package com.example.assignment1_angelsamora_ragirzebari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class GradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grade)

        val backButton = findViewById<Button>(R.id.back_button)
        backButton.setOnClickListener{
            val intentToMainActivity = Intent(this, MainActivity::class.java)
            startActivity(intentToMainActivity)
        }

        val gradeButton = findViewById<Button>(R.id.grade_button)
        gradeButton.setOnClickListener{
            val userInputGrade = findViewById<TextInputEditText>(R.id.textInputGrade).text.toString()
            gradeUserScore(userInputGrade.toInt())
        }
    }

    fun gradeUserScore(grade: Int) {
        val gradeScore = findViewById<TextView>(R.id.grade_score)
        when {
            grade < 70 -> gradeScore.text = "F"
            grade < 73 -> gradeScore.text = "C-"
            grade < 77 -> gradeScore.text = "C"
            grade < 80 -> gradeScore.text = "C+"
            grade < 83 -> gradeScore.text = "B-"
            grade < 87 -> gradeScore.text = "B"
            grade < 90 -> gradeScore.text = "B+"
            grade < 94 -> gradeScore.text = "A-"
            grade <= 100 -> gradeScore.text = "A"
            else -> {
                gradeScore.text = "Invalid Entry"
                gradeScore.setTextColor(Color.RED)
            }
        }
    }
}