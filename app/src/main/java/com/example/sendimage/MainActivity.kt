package com.example.sendimage

import android.app.Activity
import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val REQUEST_CODE = 1
    val images = arrayOf(R.drawable.pp1,R.drawable.cat,R.drawable.pg)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun choseImg(view:View){
        val intent = Intent(this,Main2Activity::class.java)
        startActivityForResult(intent, REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        super.onActivityResult(requestCode, resultCode, data)

        if ( requestCode == REQUEST_CODE && resultCode == 2){
            val index = data?.getIntExtra("index",0)
            imageView.setImageResource(images[index!!])
            selectImg.text = ""
        }
    }
    //display image

}
