package com.example.st10447181.springweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`DetailViewActivity.xml`)

        val exitButton2=findViewById<Button>(R.id.ExitButton2)
        val backButton=findViewById<Button>(R.id.backButton)

        exitButton2.setOnClickListener{finish()}
        backButton.setOnClickListener{val intent=intent(this,MainActivity2::class.java)goBack(intent)
        //providing detailed information of each day //
            {
                "Weather":{["day":"Monday", "min temperature":"12", "max temperature":"25", "forecast":"sunny"},
                {"day":"Tuesday","min temperature":"15","max temperature":"29","forecast":"sunny"},
                {"day":"Wednesday", "min temperature":"21","max temperature":"30":"forecast":"sunny"},
                {"day":"Thursday","min temperature":"16","max temperature":"24":"forecast":"sunny"},
                {"day":"Friday", "min temperature":"12","max temperature":"20", "forecast":"windy"},
                {"day":"Saterday", "min temperature":"10", "max temperature":"16", "forecast":"cold"]}
            }
        }
}