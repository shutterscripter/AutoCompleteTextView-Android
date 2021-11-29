package com.jayesh.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var actCities: AutoCompleteTextView
    lateinit var lvSearchList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvSearchList = findViewById(R.id.lvSearchList)
        actCities = findViewById(R.id.actCities)

        val cities = arrayOf(
            "Ahmednagar", "Akola", "Amravati", "Aurangabad", "Bhandara", "Beed",
            "Buldhana", "Chandrapur", "Dhule", "Gadchiroli", "Gondia", "Hingoli", "Jalgaon",
            "Jalna", "Kolhapur", "Latur", "Mumbai City", "Mumbai suburban", "Nandurbar",
            "Nanded", "Nagpur", "Nashik", "Osmanabad", "Parbhani", "Pune",
            "Raigad", "Ratnagiri", "Sindhudurg", "Sangli", "Solapur", "Satara", "Thane",
            "Wardha", "Washim", "Yavatmal"
        )

        val citiesAdapter: ArrayAdapter<String> = //TODO = setting up adapter
            ArrayAdapter(this, android.R.layout.simple_list_item_1, cities)

        actCities.setAdapter(citiesAdapter)

    }
}