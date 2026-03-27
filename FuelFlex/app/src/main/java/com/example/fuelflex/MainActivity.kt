package com.example.fuelflex

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var loadingOverlay: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize loading overlay
        loadingOverlay = findViewById(R.id.loadingOverlay)

        // Initialize buttons
        val btnWorkouts: Button = findViewById(R.id.btnWorkouts)
        val btnNutrition: Button = findViewById(R.id.btnNutrition)

        // Workouts Button Click Listener
        btnWorkouts.setOnClickListener {
            Log.d("MainActivity", "Workouts button clicked")
            showLoadingSpinner()
            Handler(Looper.getMainLooper()).postDelayed({
                val workoutIntent = Intent(this, WorkoutActivity::class.java)
                startActivity(workoutIntent)
                hideLoadingSpinner()
            }, 1500) // 1.5-second delay for loading effect
        }

        // Nutrition Button Click Listener
        btnNutrition.setOnClickListener {
            Log.d("MainActivity", "Nutrition button clicked")
            showLoadingSpinner()
            Handler(Looper.getMainLooper()).postDelayed({
                val nutritionIntent = Intent(this, NutritionActivity::class.java)
                startActivity(nutritionIntent)
                hideLoadingSpinner()
            }, 1500) // 1.5-second delay for loading effect
        }
    }

    // Show the loading spinner
    private fun showLoadingSpinner() {
        loadingOverlay.visibility = View.VISIBLE
    }

    // Hide the loading spinner
    private fun hideLoadingSpinner() {
        loadingOverlay.visibility = View.GONE
    }
}
