package tasks.task7.professions

import tasks.Person

class Driver(var driverExp:Int,
             fullName: String,
             age: Int): Person(fullName, age)
{
    override fun toString(): String {
        return super.toString() +
                "Досвід водія=$driverExp)"
    }
}










