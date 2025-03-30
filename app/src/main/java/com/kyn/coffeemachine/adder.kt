package com.kyn.coffeemachine

fun main(){
// var     value =     add(1,2);
//    println("value ${value}");

    println("input number 1");
    val num1 = readLine()!!.toInt();
    println("input number 2");
    val num2 = readLine()!!.toInt();
    val value = add(num1, num2);
    println("value ${value}");
}

fun  add(num1:Int, num2:Int) : Int{
    return num1 + num2
}