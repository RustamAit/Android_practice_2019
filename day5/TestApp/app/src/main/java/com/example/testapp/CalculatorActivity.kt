package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.R
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        equalsButton.setOnClickListener {
            if(firstValueInputText.text.toString().isNotEmpty()
                && secondValueTextView.text.toString().isNotEmpty()){
                resultTextView.text = calculate(firstValueInputText.text.toString().toInt(),secondValueTextView.text.toString().toInt()).toString()

            }
        }
    }

    fun calculate(firstValue: Int, secondValue: Int): Int{
        return firstValue + secondValue
    }
}
