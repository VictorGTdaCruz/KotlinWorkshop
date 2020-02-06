package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        compareButton.setOnClickListener {
            val car1 = Car(firstCarName.text.toString(), firstCarVelocity.text.toString().toInt())

            val car2 = Car(secondCarName.text.toString(), secondCarVelocity.text.toString().toInt())

            result.text = faster(car1, car2).speed.toString()
        }
    }

    fun faster(first : Car, second: Car): Car = if (first.speed > second.speed) first else second
}