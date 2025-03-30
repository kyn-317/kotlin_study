package com.kyn.coffeemachine

import com.kyn.coffeemachine.classfiles.Book
import com.kyn.coffeemachine.classfiles.Dog

fun main(){

    var daisy = Dog("dodo", "poodle" , 10);

    println("${daisy.breed} ${daisy.name} feel boring" )

    var customBook = Book()

    println("${customBook.title} " +
            "was written by ${customBook.author} " +
            "in ${customBook.yearPublished}")

    var customBook2 = Book("nono", "Kyn",2000)

    println("${customBook2.title} " +
            "was written by ${customBook2.author} " +
            "in ${customBook2.yearPublished}")
}