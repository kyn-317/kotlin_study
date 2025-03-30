package com.kyn.coffeemachine.classfiles;

 class Book (val title:String = "unknown"
             , val author:String = "Anonymous"
             , val yearPublished : Int = 2025){

    init {
        println("Book created")
    }

}
