package com.example.homework3_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.main_container, BlankFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.music_container,BlankFragment2()).commit()

    }
}