package com.example.st10447181.springweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val startButton=findViewById<Button>(R.id.StartButton)
        val exitButton=findViewById<Button>(R.id.ExitButton)

        startButton.setOnClickListener{val intent=intent(this, MainActivity2::class.java)startActivity(intent)
        exitButton.setOnClickListener{finish()}
    }
}