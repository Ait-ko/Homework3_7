package com.example.homework3_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvTextResult.text = intent.getStringExtra("name").toString()
        binding.rvTextResult2.text = intent.getStringExtra("singer").toString()
    }
}