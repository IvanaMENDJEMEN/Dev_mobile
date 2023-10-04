package example.myapp

fun buildAquarium(){
    /*
    val myAquarium = Aquarium()
    myAquarium.height = 60
    myAquarium.printSize()
    val mySecondAquarium = Aquarium(width = 30)
    mySecondAquarium.printSize()
     */

    // val aquarium6 = Aquarium(numberOfFish = 29)
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
    /*
    aquarium6.volume = 70
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
     */

}
fun main(){
    buildAquarium()
}