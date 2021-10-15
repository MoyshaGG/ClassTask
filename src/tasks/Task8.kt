package tasks

import javax.xml.stream.Location
fun main()
{
    val husky:Dog = Dog("Husky","meet","siberia")
    val sphinx:Cat = Cat("Normal Meow","fish","flat")
    val plotva:Horse = Horse("1л.с.","apples","paddock")

    val vetDoctor:Veterinar = Veterinar()
    val animals: Array<Animal> = arrayOf(husky,sphinx,plotva)
    val animal = animals

    for(animal in animals)
    {
        vetDoctor.treatAnimal(animal)
    }
}
open class Animal(var food:String, var location:String)
{
    open fun makeNoise()
     {
         println("Такое-то животное спит")
     }
}
class Dog(var breed:String, food:String,
 location: String):Animal(food, location)
{
    override fun makeNoise()
    {
        println("Собака спить")
    }
}
class Cat(var meow:String, food: String,
location: String):Animal(food,location)
{
    override fun makeNoise()
    {
        println("Кіт спить")
    }
}
class Horse(var HorsePower:String, food: String,
          location: String): Animal(food,location)
{
    override fun makeNoise()
    {
        println("Кінь спить")
    }
}
class Veterinar()
{
    fun treatAnimal(animal:Animal)
    {
        println("Їжа:${animal.food}, Локація:${animal.location}")

    }


}

