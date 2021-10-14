package tasks.task7.vehicles

import tasks.task7.details.Engine
import tasks.task7.professions.Driver

open class Car (
    var brand:String,
    var autoClass:String,
    var weight:Float,
    var driver:Driver,
    var engine:Engine
)
{
    fun start()
    {
        println("Поїхали")
    }
    fun stop()
    {
        println("Зупинка")
    }
    fun turnRight()
    {
        println("Поворот направо")
    }
    fun turnLeft()
    {
        println("Поворот наліво")
    }
    override fun toString(): String {
        return "Марка машини='$brand', " +
                "Класс авто='$autoClass', " +
                "Вага=$weight, " +
                "Водій=$driver, " +
                "Двигун=$engine) "
    }
}
class Lorry(var carrying:Int, brand: String, autoClass: String,
    weight: Float, driver: Driver, engine: Engine) :
    Car(brand, autoClass, weight, driver, engine)
{
    override fun toString(): String
    {
        return super.toString()+"Вантажність = $carrying " +
                ""
    }

}
class SportCar(var speed:Double, brand: String, autoClass: String, weight: Float, driver: Driver, engine: Engine):
    Car(brand, autoClass, weight, driver, engine)
{
    override fun toString(): String
    {
       return super.toString()+"Швидкість = $speed " +
               ""
    }

    }