package com.kyn.coffeemachine

import com.kyn.coffeemachine.classfiles.BankAccount

fun main(){
    val denisesBankAccount = BankAccount("denis panjuta",1343.3)

    println(denisesBankAccount.accountHolder)
    println(denisesBankAccount.balance)
    println(denisesBankAccount.deposit(100.0))
    println(denisesBankAccount.balance)
    println(denisesBankAccount.withdraw(200.0))
    println(denisesBankAccount.withdraw(2000.0))
    println(denisesBankAccount.displayTransactionHistory())
}