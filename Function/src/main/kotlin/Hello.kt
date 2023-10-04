import java.util.Random
    /*
    println("Hello,${args[0]}")

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = " La température est ${if (temperature > 50)" trop chaude" else "OK"}"
    println(message)
   */
    fun randomDay() : String{
        val week = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        return week [Random().nextInt(week.size)]
    }
    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println ("Today is $day and the fish eat $food")
    }
    fun fishFood (day : String) : String {
        return when (day) {
        "Monday" -> "flakes"
            //"Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
            //"Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
        }
    }
    fun main(args: Array<String>) {
        feedTheFish()
    }
