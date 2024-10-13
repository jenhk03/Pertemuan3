import kotlin.math.roundToInt

fun main()
{
    var number: Int = 100
    var decimal: Double = 12.99
    println(number)
    println(decimal)
    number = 200
    println(number)
    number = decimal.roundToInt()
    println(number)

//    Type Inference
    val x: Double = 19.5
    val y: Int = 10
    val z: Double = x * y.toDouble()
    println("$x * $y = $z")
    val g = 10
    println(g)
    val charA = 'A'
    val stringDog = "Dog"
    println(charA)
    println(stringDog)

//    Concat
    var message = "Hello," + " my name is "
    val name = "Jen"
    message += name
    val exclamation = '!'
    message += exclamation
    println(message)
    val oneThird = 1.0/3.0
    val oneThirdInString = "Sepertiga adalah $oneThird dalam bentuk desimal"
    println(oneThirdInString)

//    Multiline string
    val bigString = """
        |You can have a string
        |that contains multiple
    """.trimMargin()
    println(bigString)

//    Pairs & Triples
    val coordinates = 2 to 3
    val coordinatesInDouble = 2.1 to 3.5
    val coordinatesMixed = 2.1 to 3
    println(coordinates)
    println(coordinatesInDouble)
    println(coordinatesMixed)
    val x1 = coordinates.first
    val x2 = coordinatesInDouble.first
    val x3 = coordinatesMixed.first
    val y1 = coordinates.second
    val y2 = coordinatesInDouble.second
    val y3 = coordinatesMixed.second
    println(x1)
    println(x2)
    println(x3)
    println(y1)
    println(y2)
    println(y3)
    val coordinates3D = Triple(2, 3, 1)
    println(coordinates3D)
    val (x4, y4, _) = coordinates3D
    println(x4)
    println(y4)

//    Number types
    val a: Short = 120
    val b: Byte = 120
    val c: Int = -100
    val result = a + b + c
    println(result)

//    Any, Unit, & Nothing
    var anyNumber: Any = 42
    anyNumber = "Hello"
    anyNumber = 4.333
    val anyString: Any = "42"
    fun add(): Unit
    {
        val result = 2 + 2
        println(result)
    }
    fun doNothingForever(): Nothing
    {
        while (true)
        {
        }
    }
}