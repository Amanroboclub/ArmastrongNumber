package com.rajaman.armastrongnumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var number=editText.text.toString().toInt()
            var intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("number",number)
            startActivity(intent)
        }
    }
}
