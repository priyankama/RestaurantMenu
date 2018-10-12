package com.example.bandhan.restaurantmenu

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_food.*

class FoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        val foodName = intent.getStringExtra("name")
        detailsName.text=foodName
        val foodDetails = Services.desc
      for(i in foodDetails.indices){
           if(foodName.equals(foodDetails[i].name)){
               val resId = this.resources.getIdentifier(foodDetails[i].image,"drawable",this.packageName)
               detailsImage.setImageResource(resId)
               detailsDesc.text = foodDetails[i].desc


           }
       }
    }
}
