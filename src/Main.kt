import java.util.*

fun main() {
    // Variables
    var rainbowColor = "red"
    rainbowColor = "blue"
    val blackColor = "black"
    println("Rainbow Color: $rainbowColor, Black Color: $blackColor")

    // Operaciones básicas
    val fishCount = 2.plus(71).plus(233).minus(13)
    val tanksNeeded = fishCount.div(30).plus(1)
    println("Peces restantes: $fishCount, Acuarios necesarios: $tanksNeeded")

    // Nulabilidad
    var greenColor: String? = null
    var blueColor: Int? = null
    println("Colores: Green=$greenColor, Blue=$blueColor")

    // Listas con nulos
    val list1 = listOf(null, null)
    val list2: List<Int?>? = null
    println("Listas: $list1, $list2")

    // Comprobaciones nulas
    val nullTest: Int? = null
    println(nullTest?.inc() ?: 0)

    // String template
    val trout = "trout"
    val haddock = "haddock"
    val snapper = "snapper"
    println("I like to eat $trout and $snapper, but not a big fan of $haddock.")

    // Condición 'when'
    val fishName = "Goldfish"
    when (fishName.length) {
        0 -> println("Fish name cannot be empty")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }

    // Recorrer listas
    val numbers = arrayOf(11, 12, 13, 14, 15)
    val stringList = mutableListOf<String>()
    for (num in numbers) stringList.add(num.toString())
    println(stringList)

    // Lista de números divisibles por 7
    val divisibleBy7 = mutableListOf<Int>()
    for (i in 0..100 step 7) divisibleBy7.add(i)
    println(divisibleBy7)

    // Día de la semana
    fun dayOfWeek() {
        println("What day is it today?")
        val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        val dayName = when (day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Unknown"
        }
        println(dayName)
    }
    dayOfWeek()

    // Galleta de la fortuna
    fun getFortuneCookie(): String {
        val fortunes = listOf(
            "¡Tendrás un día estupendo!",
            "Las cosas te irán bien hoy.",
            "Disfruta de un maravilloso día de éxito.",
            "Sé humilde y todo saldrá bien.",
            "Hoy es un buen día para actuar con moderación.",
            "¡Tómatelo con calma y disfruta la vida!",
            "Aprecia a tus amigos porque son tu mayor fortuna."
        )
        print("Ingresa tu fecha de nacimiento: ")
        val birthday = readLine()?.toIntOrNull() ?: 1
        return fortunes[birthday % fortunes.size]
    }
    println("Tu fortuna es: ${getFortuneCookie()}")

    // Decisión de actividad
    fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
        return when {
            mood == "happy" && weather == "sunny" -> "go for a walk"
            mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
            temperature > 35 -> "go swimming"
            else -> "Stay home and read."
        }
    }
    println(whatShouldIDoToday("happy"))

    }