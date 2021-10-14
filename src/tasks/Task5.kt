package tasks

fun main()
{
    var a = 20
    var b = 15

    count(20,15)
}

fun count(a:Int,b:Int)
{
    if(a<b) {
        count(a, b - 1)
        println(b)
    }
    else if(a>b) {
        println(a)
        count(a - 1, b)
    }

}
