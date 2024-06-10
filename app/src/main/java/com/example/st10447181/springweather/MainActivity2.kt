package com.example.st10447181.springweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    //initializing the temperatures
    val temperature = arrayListOf<String>("Mon","Tue","Wed","Thur","Fri","Sat","Sun")
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DetailedViewButton=findViewById<Button>(R.id.DetailedViewButton)
        val exitButton3=findViewById<Button>(R.id.ExitButton3)


        DetailedViewButton.setOnClickListener{val intent=intent(this, DetailedViewScreen::class.java)nextActivity(intent)
        exitButton3.setOnClickListener{finish()}

        //calculate the average of the weekly temperature
        var mon = "12+25=37"
        var tue = "15+29=44"
        var wed = "21+30=51"
        var thur = "16+24=40"
        var fri = "12+20=32"
        var sat = "10+18=28"
        var sun = "10+16=26"

        while (mon = <>12 "THEN" min temperature,<>25 "then" max temperature)
            else
            (tue = <>15 "THEN" min temperature<>29 "then" max temperature)
                else
            (wed = <>21 "then" min temperature, <>30 "then" max temperature)
                    else
            (thur = <>16 "then" min temperature, <>24 "then" max temperature)
                        else
            (fri = <>12 "then" min temperature, <>20 "then" max temperature)
                            else
            (sat = <>10 "then" min temperature, <>18 "then" max temperature)
                                else
            (sun = <>10 "then" min temperature, <>16 "then" max temperature)












    }
}