package com.vasya.rrbdproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            Toast.makeText(this,"Btn2 pressed",Toast.LENGTH_SHORT).show()
        }
    }

    fun Button1Click(view: View) {
               startActivity(Intent(this,Main2Activity::class.java))
    }
}
