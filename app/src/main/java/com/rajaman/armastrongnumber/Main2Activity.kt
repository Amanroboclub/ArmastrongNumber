package com.rajaman.armastrongnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var bundle=intent.extras
        var number = bundle!!.getInt("number")
        var sum = 0
        var temp = number
        while(temp>0){
            var digit = temp%10
            sum +=digit*digit*digit
            temp /=10
        }
        if(number == sum) textView.text = "${number} The Number is Armstrong".toString()
        else textView.text = "$number is not Armstrong".toString()
    }
}
