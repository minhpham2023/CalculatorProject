package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        subtract_Button.setOnClickListener{
            subtract()

        }

       

    }
    // crete a function to do subtraction between 2 numbers
    fun subtract() {

        val firstTextValue = firstNumber.text
        val secondTextValue = secondNumber.text

        val numberOneStringValue: String = firstTextValue.toString()
        try {
            val numberOne: Int = numberOneStringValue.toInt()
            val numberTwo: Int = secondTextValue.toString().toInt()
            val minus = numberOne - numberTwo
            result.text = minus.toString()

        }catch (e:java.lang.NumberFormatException){
            println(e.localizedMessage)
            result.text = "Please only use numbers and not some nonsense "

        }
    }
}