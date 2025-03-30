package com.kyn.coffeemachine


fun main(){
    val coffe_kyn = CoffeeDetails("Kyn", 1, "small", 0)
    coffe_kyn.sugarCount=2
    makeCoffee(coffe_kyn)
}
data class CoffeeDetails
    ( val name: String,
      var sugarCount: Int,
      val size: String,
      val creamAmount: Int)


fun makeCoffee( details : CoffeeDetails){

    println("${details.name} drink coffee with ${details.sugarCount} spoons of sugar " +
            "and ${details.size} size and ${details.creamAmount} spoons of cream")



}