package com.ckg.ckgtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ckg.ckgtemplate.databinding.ActivityMainBinding

// note blue
// plan red
// todo yellow

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object{
        const val TAG = "MainActivity"
    }
}