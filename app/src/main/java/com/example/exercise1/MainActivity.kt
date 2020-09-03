package com.example.exercise1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrow.setOnClickListener {
            openFirstActivity()
        }
    }

    private fun openFirstActivity(){
        val intent = Intent(this, FirstActivity::class.java).apply {
            putExtra("Extra", "This is from main activity")
        }
        startActivity(intent)
    }


}