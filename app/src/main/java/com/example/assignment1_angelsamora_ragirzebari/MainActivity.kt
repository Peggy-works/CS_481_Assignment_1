package com.example.assignment1_angelsamora_ragirzebari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gradeActivityButton = findViewById<Button>(R.id.grade_activity)
        gradeActivityButton.setOnClickListener{
            val intentToGradeActivity = Intent(this, GradeActivity::class.java)
            startActivity(intentToGradeActivity)
        }
    }
}