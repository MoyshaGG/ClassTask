package Tasks

fun main()
{
    var aspirant:Student = Aspirant("Serhii","Myslyuk"
    , "AspirantGroup",5.0, 2)
    var student:Student = Student("Maksym","Starmacov",
    "StudentGroup", 4.0)


   var peoples: Array<Student> = arrayOf(aspirant,student)
    for(human in peoples)
    {
        println(human.getScholarship())
    }

}
open class Student(
    val firstName:String,
    val lastName:String,
    val group:String,
    var averageMark:Double)
{
open fun getScholarship():Int
{
    return if(averageMark==5.0)
    {
        100
    }
    else{
        80
    }

}

}
class Aspirant(firstName:String, lastName:String, group:String,
     averageMark:Double, var SienceWork:Int):

    Student (firstName, lastName, group, averageMark)
{
    override fun getScholarship():Int
    {
        return if(averageMark==5.0) {
            200
        } else {
            180
        }
    }
 }

