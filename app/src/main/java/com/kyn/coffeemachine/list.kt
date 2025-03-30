package com.kyn.coffeemachine


fun main(){
    val shoppingList = listOf("Processor","RAM","VGA","SSD")
    val shoppingList2 = mutableListOf("Processor","RAM","VGA","SSD")
    shoppingList2.add("Monitor")

    println(shoppingList)
    println(shoppingList2)
    shoppingList2.removeAt(2)
    println(shoppingList2)
    shoppingList2.set (2,"HDD")
    println(shoppingList2)

    val hasHDD = shoppingList.contains("HDD")
    val hasHDD2 = shoppingList2.contains("HDD")
    println(hasHDD)
    println(hasHDD2)

    for (item in 0 until  shoppingList2.size){

        if(shoppingList2[item] == "HDD" ){
            shoppingList2.set(2,"SSD")
        }
    }
    println(shoppingList2)

}