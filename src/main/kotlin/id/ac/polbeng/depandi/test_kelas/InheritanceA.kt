package id.ac.polbeng.depandi.test_kelas

open class Computer(val name: String,
    val brand: String) {

}
class Laptop (name: String,
              brand: String,
              val baterylife: Double) : Computer (name,brand) {
                  fun info() {
                      println("Name : $name")
                      println("Brand : $brand")
                      println("Batery  Life : $baterylife")
                  }
}
fun main() {
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5 )
    println(myLaptop.info())
}