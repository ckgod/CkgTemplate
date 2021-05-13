package com.ckg.ckgtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.ckg.ckgtemplate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        findNavController(R.id.nav_host_fragment_container_in_main_activity).currentDestination

    }

    companion object{
        const val TAG = "MainActivity"
    }
}