package com.example.layout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
   // lateinit var binding: ActivityMainBinding
    var Calculate_Button : Button = findViewById(R.id.button)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Calculate_Button.setOnClickListener{
            CalculateTip()
        }
       // Utilisation des liasons de vues ( il faut avoir la connexion)
       /*binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{calculateTip()}
        */
        setContentView(R.layout.activity_main)
    }

    private fun CalculateTip(){
        val montantEdit : EditText = findViewById(R.id.editTextText2)
        val montant : Double = montantEdit.text.toString().toDouble()
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)

        val pourcentage = when(radioGroup.checkedRadioButtonId){
            R.id.radioButton5 -> 0.2
            R.id.radioButton6 -> 1.8
            else -> 0.15
        }
        val pourboire = montant * pourcentage
        val textResult: TextView = findViewById(R.id.textView3)
        textResult.text = pourboire.toString()
    }
}