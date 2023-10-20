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
        println("Change water : ${shouldChanWater(day)}")
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

    fun swim(speed: String = "fast"){
        println("swimming $speed")
    }

    fun shouldChanWater (day: String, temperature: Int = 22, dirty: Int = 20 ) : Boolean {
        return when {
            isTooHot(temperature) -> true
            isDirty(dirty)  -> true
            isSunday(day)  -> true
            else -> false
        }
    }

    fun isTooHot(temperature: Int) = temperature > 30

    fun isDirty(dirty: Int) = dirty > 30

    fun isSunday(day: String) = day == "Sunday"

        fun main(args: Array<String>) {
        feedTheFish()
        /*
        swim()
        swim("slow")
        swim(speed = "turle-like")
         */
    }


    val decorations = listOf ("rock", "pagoda","plastic plant","alligator","flowerpot")

    fun main(){
        // Filtre impatient
        val eager = decorations.filter { it[0] == 'p' }
            println("eager : $eager")

        //Filtre paresseux
        val filtered = decorations.asSequence().filter { it[0] == 'p' }
            println("filtered : $filtered")
        val newList = filtered.toList()
            println("new list : $newList")

        //Montre le processus de filtre par séquence c'est à dire la fonction map permet de voir comment le filtre se passe poyr chaque élément avant d'ajouter les résultats dans une nouvelle liste newlist
        val lazyMap =  decorations.asSequence().map {
            println("access: $it")
            it
        }
        println("lazy : $lazyMap")
        println("-----")
        println("first: ${lazyMap.first()}")
        println("-----")
        println("all: ${lazyMap.toList()}")

        // Dans ce cas, on impose une condition de filtre chose qu'on a pas fait plus haut
        val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
            println("access: $it")
            it
        }
        println("-----")
        println("filtered: ${lazyMap2.toList()}")

        // On transforme plusieurs listes ( mysports, myplayers, mycities) en formant une seule liste (mylist) qui contient tous les éléments ces listes avec la fonction flatten()
        val mysports = listOf("basketball", "fishing", "running")
        val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
        val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
        val mylist = listOf(mysports, myplayers, mycities)     // list of lists
        println("-----")
        println("Flat: ${mylist.flatten()}")
    }
