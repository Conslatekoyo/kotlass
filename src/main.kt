
/*Assessment 2
1.Create a classCurrentAccount with the following attributes:account
number, account name, balance. It has the following functions:
a.deposit(amount: Double) - Increments the balance bythe
amount deposited
b.withdraw(amount: Double) - Decrements the balanceby the
amount withdrawn
c.details() - Prints out the account number and balanceand
name in this format: “Account number x with balance y is
operated by z”(5points)
2.Create another classSavingsAccount. It has the samefunctions and
attributes as the current account except for one attribute,
withdrawals: Int. Withdrawals is a counter variablethat is used to
keep track of how many withdrawals have been made from the account
in a year. The only other difference is that the savings account
withdraw() method first checks if the number of withdrawalsis less
than 4 for it to allow one to withdraw money from the account. It also
increments the withdrawals attribute after a successful withdrawal
(5points)
3.A product is represented by a data class with these attributes: name,
weight, price, category. Category can either be groceries, hygiene or
other. Write a function that takes in a product and uses a when
statement to assign each product to a list based on its category
(3 points)
4.Write a function that given a string returns a string composed of only
the characters in even indices. For example given “banana” it will return
“bnn”(2 points)*/
fun main(){
    println(evenindices("banana"))
    currentacount(3454,"Juliana",113890)


}

fun evenindices(name:String):String{
    var x = ""
    for (char in name) {
            if (name.indexOf(char) % 2 == 0){
                x+=char
            }
        }
        return x
}
class currentacount(var accountnumber:Int,var accountname:String, var balance:Int){
   fun deposit(name:Double){

   }
    fun withdraw(name:Double){

    }
    fun details(){

    }
}
data class Product(var name:String,var weight:Int,var price:Int,var category:String)


class Currentaccount (var accountnumber:Int, var accountname:String, var balance:Int) {
}








