package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() } //

        rollDice() // Faire ce lancer lorsque l'application va s'ouvrir
    }
    // la fonction rollDice permet de lancer le dé et de renvoyer le nombre obtenu
    private fun rollDice() {
        // Créer un nouvel objet Dice et une variable qui va contenir le résultat du lancer
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val diceImage: ImageView = findViewById(R.id.imageView)
        // Déterminer quel est l'image qui s'affichera après avoir lancer (appuyer sur roll) en fonction du nombre quon aura obtenu
        val drawableRessource = when (diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Modifier l'image affichée dans une ImageView
        diceImage.setImageResource(drawableRessource)
        diceImage.contentDescription = diceRoll.toString()

    }
}
    // la classe Dice permet de créer un dé avec le nombre de faces voulues
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}