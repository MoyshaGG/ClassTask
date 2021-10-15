package tasks

open abstract class Shape( var colour:String)
{
    abstract fun draw()
    open fun equals() {

    }
}
class Circle(colour: String, var x:Int,var y:Int)
    : Shape(colour)
{

    override fun equals()
    {

    }
    override fun draw()
    {
        println("Малюнок кола")
    }


}
class Rectangle(colour: String, var x:Int,var y:Int)
    : Shape(colour)
{
    override fun equals()
    {

    }
    override fun draw()
    {
        println("малюнок трикутника")
    }
}
fun main()
{
    var crcle:Circle = Circle("Black",15, 20)
    var rectangle:Rectangle = Rectangle("Red",14,12)

    val shapes: Array<Shape> = arrayOf(crcle,rectangle)

    for(shape in shapes)
    {
        shape.draw()
    }

}
