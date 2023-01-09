package com.example.navigation_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.navigation_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val TAG = "FirstFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // commit pul push
        Log.d(TAG, "onCreate: A")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: A")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: A")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: A")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: A")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: A")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: A")
    }
}