package com.example.bandhan.restaurantmenu

object Services {
    val types  = listOf(
            Menu("Chowmein","chinese1"),
            Menu("Chocolate mousse","dessert1"),
            Menu("Drink","drinks4"),
            Menu("Dosa","southinidan1"),
            Menu("Chole Bature","northindian2"),
            Menu("Thali","northindian3")
    )
    val desc = listOf(
            FoodDetails("Chowmein","chinese1","Chow mein are Chinese stir-fried noodles, the name being the romanization of the Taishanese ... The words chow mein mean 'stir-fried noodles', chow meaning 'stir-fried' and mein meaning 'noodles'."),
            FoodDetails("Chocolate mousse","dessert1","Chocolate mousse - dessert mousse made with chocolate. mousse - a rich, frothy, creamy dessert made with whipped egg whites and heavy cream"),
            FoodDetails("Drink","drinks4","It is a functional beverage providing wings whenever you need them. ... This is a great functional drink which can be really handy just before training or competition. It gives you wings."),
            FoodDetails("Dosa","southinidan1","A pancake made from rice flour and ground pulses, typically served with a spiced vegetable filling."),
            FoodDetails("Chole Bature","northindian2","This Punjabi dish is a combination of chana masala (spicy white chickpeas) and bhatura, a fried bread made from maida flour (soft wheat)."),
            FoodDetails("Thali","northindian3","A meal consisting of several small meat or vegetable dishes accompanied by rice, bread, etc, and sometimes by a starter or a sweet.")
    )
}