fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    // Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "Error"


    }
    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
// Player status
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")





var hello = printHello(name)

}
//function without return


//Unit function

//Unit is actually a type that has exactly one value
// (the value is Unit itself; also, this is why it is named Unit ).
// It corresponds to void in Java,
// but it's not the same.
// Kotlin compiler treats functions with no declared return value as Unit -returning functions
// , and return Unit can also be omitted.

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else

        println("Hi there!")




}

