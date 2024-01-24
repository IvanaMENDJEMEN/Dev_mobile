package com.example.dogapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dogapplication.holder.DogViewholder
import com.example.dogapplication.model.Dog

class Adapter(private val context: Context, private val dataset: MutableList<Dog>):
    RecyclerView.Adapter<DogViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewholder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(com.example.dogapplication.R.layout.card,parent, false)

        return DogViewholder(adapterLayout)
    }

    override fun getItemCount(): Int {

        return dataset.size
    }

    override fun onBindViewHolder(holder: DogViewholder, position: Int) {
        holder.dogImage.setImageResource(dataset[position].drawResDog)
        holder.dogName.text  = dataset[position].dogName
        holder.dogDescription.text = dataset[position].dogAge

    }
}