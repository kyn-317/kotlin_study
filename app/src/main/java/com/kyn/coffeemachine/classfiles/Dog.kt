package com.kyn.coffeemachine.classfiles

class Dog (val name: String , val breed: String, val age :Int = 5){

    init {
        bark(name)
    }
    fun bark(name:String){
        println( "${breed} ${name} ${age} Woof Woof ")
    }

}