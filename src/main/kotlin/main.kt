fun main() {
    fun convert(
        x: Double,
        converter: (Double) -> Double
    ): Double {
        val result = converter(x)
        println("$x конвертировались в $result")
        return result
    }

    fun convertFive(converter: (Int) -> Double): Double {
        val result = converter(5)
        println("5 конвертировалось в  $result")
        return result
    }

    val cConvToFar = { x: Double ->
        println("Переводим градусы по цельсию в градусы по фаренгейту")
        x * 1.8 + 32
    }
    val poundsConvToKg = { x: Double ->
        println("Переводим фунты в килограммы")
        x / 2.204623
    }
    convert(45.8, cConvToFar)
    convert(32.8, poundsConvToKg)
    convert(45.4) { it * 3 + 25 }
    convertFive { it + 5.6 }
    println(
        "Выберите операцию:\n" +
                "1) Перевод градусов цельсия в градусы Фаренгейта\n" +
                "2) Перевод килограммов в фунты\n" +
                "3) Перевод фунтов в европейские тонны"
    )
    val a = readLine()?.toInt() ?: return
    println("Введите переводимую величину")
    val x = readLine()?.toDouble() ?: return


    val result = when (a) {
        1 -> {
            println("Перевод градусов цельсия в градусы Фаренгейта")
            x * 1.8 + 32
        }
        2 -> {
            println("Перевод килограммов в фунты")
            x * 2.204623
        }
        3 -> {
            println("Перевод фунтов в европейские тонны")
            x / 2000.0
        }
        else -> {
            x
        }
    }
    println("$x конвертированы в $result")
}