package com.example.dogapplication.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogapplication.R

class DogViewholder(private val view: View) : RecyclerView.ViewHolder(view) {
    val dogImage = view.findViewById<ImageView>(R.id.image)
    val dogName = view.findViewById<TextView>(R.id.cardname)
    val dogDescription = view.findViewById<TextView>(R.id.carddescription)
}