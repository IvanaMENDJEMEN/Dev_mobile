package com.example.dogapplication.model

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Dog(@DrawableRes val drawResDog : Int ,val dogName:String, val dogAge : String,
          val dogHobby: String) {
}