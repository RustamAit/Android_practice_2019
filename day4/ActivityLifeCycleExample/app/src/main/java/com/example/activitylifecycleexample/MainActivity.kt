package com.example.activitylifecycleexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputTextUserName.text
        startNewActivityBtn.setOnClickListener {
            if(inputTextUserName.text!!.isNotEmpty()){
                var intent = Intent(this,TestActivity::class.java)
                    .putExtra("userName", inputTextUserName.text.toString())
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Сначала введите имя",Toast.LENGTH_LONG).show()
            }

        }
    }
}
