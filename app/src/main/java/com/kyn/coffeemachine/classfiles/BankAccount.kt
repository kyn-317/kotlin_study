package com.kyn.coffeemachine.classfiles

class BankAccount(var accountHolder: String, var balance: Double = 0.0) {

    private val transactionHistory = mutableListOf<String>();

    fun deposit(amount :Double){
        balance += amount
        transactionHistory.add("${transactionHistory.size+1} Deposit: $amount")
    }

    fun withdraw(amount:Double){
        if(balance >= amount){
            balance -= amount
            transactionHistory.add("${transactionHistory.size+1} Withdraw: $amount")
        }else{
            transactionHistory.add("${transactionHistory.size+1} Withdraw: Failed")
        }
    }
    fun displayTransactionHistory(){
        println(transactionHistory)
    }

    fun acctBalance ():Int{
        return balance.toInt()
    }
}
