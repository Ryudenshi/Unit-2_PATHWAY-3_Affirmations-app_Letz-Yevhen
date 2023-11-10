package com.example.unit2_pathway3_affirmationsapp_letzyevhen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.unit2_pathway3_affirmationsapp_letzyevhen.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.textview)

        // Create a Datasource and load affirmations
        val affirmationsList = Datasource().loadAffirmations()

        // Display the size of the affirmations list in the TextView
        textView.text = affirmationsList.size.toString()
    }
}