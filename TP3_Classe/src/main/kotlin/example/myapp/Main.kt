package example.myapp

fun buildAquarium(){
    //PARTIES 1 à 4
    /*
    val myAquarium = Aquarium()
    myAquarium.height = 60
    myAquarium.printSize()
    val mySecondAquarium = Aquarium(width = 30)
    mySecondAquarium.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()

    aquarium6.volume = 70
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
     */

    //PARTIES 5,6
    val towerTank1 = TowerTank(diameter = 25, height = 45)
    towerTank1.printSize()
}
fun makeFish(){
    val shark1 = Shark()
    val plecostomus1 = Plecostomus()

    println("Shark:${shark1.color}")
    shark1.eat()
    println("Plecostomus: ${plecostomus1.color}")
    plecostomus1.eat()
}
fun main(){
    //buildAquarium()
    makeFish()
}