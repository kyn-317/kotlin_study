package com.kyn.coffeemachine

fun main(){
    var name = "Kevin"
    makeCoffee(0, name );
}

fun makeCoffee(sugarCount : Int, name: String){

    if(sugarCount ==1){
        println("${name} drink Coffee with $sugarCount spoon of sugar")
    }else if (sugarCount > 0){
        println("${name} drink Coffee with $sugarCount spoons of sugar")
    }else {
        println("${name} drink Coffee without sugar")
    }


}