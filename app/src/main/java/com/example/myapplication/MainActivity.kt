package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton :Button = findViewById(R.id.roll_button)//créer une valeur en l'associant à l'id créer dans le fichier activity_main (android:id="@+id/roll_button")
        rollButton.text="Let's Roll"//Prendre le boutton en écrivant du text
    }
}