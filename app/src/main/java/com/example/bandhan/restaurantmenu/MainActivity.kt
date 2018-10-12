package com.example.bandhan.restaurantmenu

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = RecyclerAdapter(this, Services.types){menu ->
            val intent  = Intent(this,FoodActivity::class.java)
            intent.putExtra("name",menu.name)
            startActivity(intent)
            finish()
        }
        food_list_item.adapter = adapter
        val layoutManager = GridLayoutManager(this,2)
        food_list_item.layoutManager = layoutManager
        food_list_item.setHasFixedSize(true)
    }
    
    inner class RecyclerAdapter(val context: Context, val items : List<Menu> , val itemClick:(Menu)->Unit) : RecyclerView.Adapter<RecyclerAdapter.Holder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

            val view = LayoutInflater.from(context).inflate(R.layout.food_layout,parent,false)
            return Holder(view,itemClick)
        }

        override fun getItemCount(): Int {
            return items.count()
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            holder?.bindItem(items[position],context)
        }


        inner class Holder(itemView : View?,val itemClick:(Menu)->Unit) : RecyclerView.ViewHolder(itemView!!) {
            val foodimages  = itemView?.findViewById<ImageView>(R.id.foodImage)
            val foodname : TextView  =itemView!!.findViewById(R.id.foodName)
            fun bindItem(menu : Menu, context: Context){
                val resId = context.resources.getIdentifier(menu.image,"drawable",context.packageName)
                foodimages!!.setImageResource(resId)
                foodname.text = menu.name
                itemView.setOnClickListener { itemClick(menu)}
            }
        }
    }
}
