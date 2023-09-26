package com.example.session2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class listing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listing)
        supportActionBar!!.title = "Your Listing"
    }
}