package com.oops.assessment

class BankAccount(val accountHolder : String, var balance : Double) {

    fun deposit(amount:Double){

        if(amount>0){
            balance += amount
            println("Deposited $amount")
        }
        else
            println("Deposite Invalid amount")
    }

    fun withdraw(amount:Double){
        if(amount<=0){
            println("Invalid withdrawal amount")
        }
        else if(amount <= balance){
            balance -= amount
            println("Withdrawn: $amount")
        }
        else{
            println("Insufficent Balance")
        }

    }

    fun showbalance(){
        println("Account Holder: $accountHolder")
        println("Current Balance: $balance")
    }


}

fun main(){
    val account = BankAccount("Kuna", 10000.0)

    account.showbalance()
    account.deposit(1000.0)
    account.withdraw(8000.0)
    account.showbalance()
}
