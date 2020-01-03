package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun topla(a: Int, b: Int): Int {
        return a + b
    }
//...
    private fun cikar(a: Int, b: Int): Int {
        return a - b
    }

}
