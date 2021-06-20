package expresionWhen

/**
 *   Creado por @autor: Usuario
 *      El 20/06/2021
 *
 *
 **/
class When {


    fun usarWhen() {
        println(" Introduce un valor ")
        when (val valor = readLine()!!.toInt()) {
            1 -> println(" El valor es 1")
            2 -> println(" El valor es 2")

            else -> println(
                """
                El valor no es ni 1 ni 2, es $valor
            """.trimIndent()
            )

        }
        println("\n")
        usarWhen()
    }

    fun comprobarCombustible() {
        println(" Introduce un combustible ")
        val combustible = readLine().toString().toLowerCase()

        when (combustible) {
            "gasolina", "diesel" -> println(" El vehículo usa gasolina o diesel ")
            else -> println(" El vehículo usa otro combustibe")
        }
    }

    fun otraManeraWhen() {
        println(" Introduce la edad ")
        val edad = readLine()!!.toInt()
        when {
            edad < 18 -> println(" Eres menor de edad ")
            edad < 60 -> println(" Eres mayor de edad ")
            else -> println(" Eres de la 3º edad ")
        }
    }

    fun whenEnRango() {
        println(" Introduce la edad ")
        val edad = readLine()!!.toInt()
        when (edad) {
            // Así se evalúa por rango
            in 1..17 -> println(" Eres menor de edad")
            in 18..59 -> println(" Eres mayor de edad")
            in 60..100 -> println(" Eres de la 3º edad")
            else -> println(" Macho que edad es esa ")
        }
        whenEnRango()
    }
    fun whenEnVariable(){
        println(" Introduce la edad ")
        val edad = readLine()!!.toInt()

        val mensajeResultado = when (edad) {
            in 1..17 ->  " Eres menor de edad"
            in 18..59 -> " Eres mayor de edad"
            in 60..100 -> " Eres de la 3º edad"
            else -> " Macho que edad es esa "
        }
        println(mensajeResultado)
        whenEnVariable()
    }

    fun comprobarTipoDato(){

        val valor : Any = " Hola " // Esto acepta cualquier tipo de dato

        when(valor){
            // Evaluamos que tipo de dato es valor
            is String -> println(" Es un string")
            is Int -> println(" Es un entero ")
            is Long -> println( " Es un long ")

        }
    }
}