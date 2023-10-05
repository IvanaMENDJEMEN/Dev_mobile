package example.myapp
import kotlin.math.PI

open class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    open var length: Int = length
    open var width: Int = width
    open var height: Int = height
    open val  shape = "rectangle"

    open var volume: Int
    get() = width * height * length / 1000
    set(value) {
        height = (value * 1000) / (width * length)
    }

    open var water: Double = 0.0
        get() = volume * 0.9

    init {
        println("aquarium initializing")
    }
    /*
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }
     */
    constructor(numberOfFish: Int): this(){
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()

    }
    fun printSize(){
        println(shape)
        println("Width:$width cm" + "Length : $length cm" + "Height : $height cm")
        //println("Volume: $volume liters")
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}
class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }
    override var water = volume *  0.8
    override val shape = "cylinder"
}