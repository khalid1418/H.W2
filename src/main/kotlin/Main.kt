fun main() { //Question 1

    println("please enter first number here")
    var x = readLine()!!.toInt()
    println("please enter seconde number here")
    var y = readLine()!!.toInt()
    println("Enter an operator (+,-,*,/,%)")
    var op = readLine()!!
    if (op == "+"){
    println("result is =${x+y}")
}else if (op == "-"){
        println("result is =${x-y}")
}else if(op == "*"){
        println("result is =${x*y}")
}else if(op == "/"){
        println("result is =${x/y}")
}else if (op == "%"){
        println("result is =${x%y}")

    }
    //Question 2
println("enter your salary")
    var salary = readLine()!!
println("enter your rate")
    var rate = readLine()!!.toInt()
    if (rate == 1){
        var raise = salary.toInt() * 6/100
        println("your new salary is =${salary + raise}")
    }else if(rate == 2){
        var raise = salary.toInt() * 4/100
        println("your new salary is =${salary + raise}")
    }else if (rate == 3){
        var raise = salary.toInt() *2/100
    println("your new salary is =${salary + raise}")}

}