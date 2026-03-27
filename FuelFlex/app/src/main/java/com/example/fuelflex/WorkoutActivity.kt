package com.example.fuelflex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class WorkoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workouts)

        // Enable the Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Handle the Up button action
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()  // Navigate back to MainActivity
        return true
    }
}
