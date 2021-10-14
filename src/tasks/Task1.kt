package tasks

fun main() {
    var firstPhone: Phone = Phone(109797, "Xiaomi", 0.250f)
    var secondPhone: Phone = Phone(2209797, "Apple", 0.240f)
    var thirdPhone: Phone = Phone(309797, "GooglePixel", 0.265f)

    println("${firstPhone.number} ${firstPhone.model}  ${firstPhone.weight}")
    println("${secondPhone.number} ${secondPhone.model}  ${secondPhone.weight}")
    println("${thirdPhone.number} ${thirdPhone.model}  ${thirdPhone.weight}")

    firstPhone.receiveCall("Serhii")
    firstPhone.getNumber()

    secondPhone.receiveCall("Volodymyr")
    secondPhone.getNumber()

    thirdPhone.receiveCall("Eugene")
    thirdPhone.getNumber()
//
    var person: Person = Person("Andrii", 23)
    var person1: Person = Person()
// 2 завдання в)


}


    class Phone(var number: Int, var model: String, var weight: Float) {

        constructor(number: Int, model: String) : this(number, model, 0f) {
            this.number = number
            this.model = model
        }

        constructor() : this(3, "", 0f) {
            this.number = 0
            this.model = ""
            this.weight = 0f
        }

        fun receiveCall(name: String) {
            println("Calling: $name")
        }

        fun getNumber() {
            println("Number: $number")
        }

        fun sendMessage(number: Int) {
            println("$number")
        }
    }

   open class Person(var fullName: String, var age: Int) {
        fun move() {
            println("$fullName рухається")
        }

        fun talk() {
            println("$fullName розмовляє")
        }

       override fun toString(): String {
           return "Ім'я='$fullName', вік=$age"
       }

       constructor() : this("John", 24)
    }



