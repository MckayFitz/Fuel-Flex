package com.example.fuelflex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NutritionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)

        // Enable the Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Handle the Up button action
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()  // Navigate back to MainActivity
        return true
    }
}
