package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton :Button = findViewById(R.id.roll_button)//créer une valeur en l'associant à l'id créer dans le fichier activity_main (android:id="@+id/roll_button")
        rollButton.text="Let's Roll"//Prendre le boutton en écrivant du text
        rollButton.setOnClickListener{rollDice()}
        diceImage=findViewById(R.id.dice_image)
    }




    private fun rollDice() {

        val randomInt = java.util.Random().nextInt(6) +1

        val drawableResource =when (randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else -> R.drawable.dice_6
        }


        diceImage.setImageResource(drawableResource)

    }
}