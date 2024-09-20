package id.ac.polbeng.depandi.test_kelas

class LaptopB : Computer {
    val bateryLife : Double

    constructor(name : String, brand: String, bateryLife: Double) : super(name, brand) {
        this.bateryLife = bateryLife
    }

    constructor(name: String, brand: String): this(name, brand, 0.0) {

    }

    fun info() {
        println("Name : $name")
        println("Brand : $brand")
        println("BateryLife : $bateryLife")
    }
}
fun main() {
    val myLaptop = LaptopB("Asus Think Pad", "Asus", )
    println(myLaptop.info())
}