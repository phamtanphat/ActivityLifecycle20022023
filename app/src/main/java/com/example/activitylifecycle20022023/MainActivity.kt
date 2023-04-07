package com.example.activitylifecycle20022023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnScreen2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("BBB", "Main1: onCreate")

        btnScreen2 = findViewById(R.id.button_navigate_screen_2)

        btnScreen2.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("BBB", "Main1: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BBB", "Main1: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BBB", "Main1: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BBB", "Main1: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BBB", "Main1: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BBB", "Main1: onRestart")
    }
}
