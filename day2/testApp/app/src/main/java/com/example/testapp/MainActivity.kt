package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "ACTIVITY"
        var text = ""
        button3.setOnClickListener {
            text = changeTextButton.text.toString()
            changeTextButton.text = button2.text
            button2.text = text
            Toast.makeText(this, "HELLO TOAST", Toast.LENGTH_LONG).show()
        }
    }
}
