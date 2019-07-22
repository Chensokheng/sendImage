package com.example.sendimage

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun selectImg(view: View){
        val resultIntent = Intent()
        val btn = view as Button
        when (btn.id){
            R.id.pic1 ->{
                resultIntent.putExtra("index",0)
                setResult(2,resultIntent)
                finish()
            }

            R.id.pic2 ->{
                resultIntent.putExtra("index",1)
                setResult(2,resultIntent)
                finish()
            }

            R.id.pic3 ->{
                resultIntent.putExtra("index",2)
                setResult(2,resultIntent)
                finish()
            }
        }
    }
}
