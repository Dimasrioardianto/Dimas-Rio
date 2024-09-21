package id.ac.polbeng.depandi.test_kelas

abstract class Vehicle (val name: String, val color: String, val weight: Double){

    //abstract property
    abstract var maxSpeed: Double

    //abstrcat methods
    abstract fun start()
    abstract fun stop()
    abstract fun sound()

    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

    override fun sound() {
        println("Brum...brum...brumm!")
    }
}

class Motorcycle(name: String, color: String, weight: Double,
                 override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        println("Bike Started")
    }

    override fun stop() {
        println("Bike Stopped")
    }

    override fun sound() {
        println("Preng...preng...preng!")
    }
}

fun main() {
    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorcycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)

    car.displayDetails()
    motorcycle.displayDetails()

    car.start()
    car.sound()
    car.stop()
    car.stop()
    motorcycle.start()
    motorcycle.stop()
}