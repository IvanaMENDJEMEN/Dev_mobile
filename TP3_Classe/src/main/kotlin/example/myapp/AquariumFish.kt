package example.myapp
//PARTIE 6,7

interface FishColor {
    val color : String
}

interface FishAction {
    fun eat()
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Shark(fishColor: FishColor = GoldColor):FishAction by PrintingFishAction("hunt and eat fish") ,FishColor by fishColor

class Plecostomus(fishColor: FishColor = GoldColor):  FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor


