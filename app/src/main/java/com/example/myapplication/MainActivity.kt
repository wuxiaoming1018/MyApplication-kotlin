package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        text1.text = "the first application"
        text1.setOnClickListener{
            Snackbar.make(findViewById(android.R.id.content),"snackbar test",Snackbar.LENGTH_LONG).show()
        }

        text1.setOnLongClickListener {
            startActivity(Intent(this,BasicActivity::class.java))
            true
        }
    }
}