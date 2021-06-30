package nullSafety

class Nulos {
    fun calcularAreaCuadrado() {
        println("Lado del cuadrado?")
        val entrada = readLine()
        val lado = if (entrada != null) {
            entrada.toDouble()
        } else
            0.0

        val resultado = lado * lado
        println(
            """
            El área del cuadrado es de: $resultado cms
        """.trimIndent()
        )
    }

    fun calcularAreaCuadradoConElvis() {
        println("Lado del cuadrado?")
        val entrada = readLine()
        val lado = entrada?.toDouble() ?: 0.0

        val resultado = lado * lado
        println(
            """
            El área del cuadrado es de: $resultado cms
        """.trimIndent()
        )
    }
    fun calcularAreaCuadradoOtraOpcion(){
        println("Lado del cuadrado?")
        val entrada = readLine()
        val lado = entrada?.toDoubleOrNull() ?: 0.0 // Si es número lo convierte a Double y si es texto o caracter le da nulo y entra en ?: (Else)

        val resultado = lado * lado
        println(
            """
            El área del cuadrado es de: $resultado cms
        """.trimIndent()
        )
    }
    fun calcularAreaCuadradoLLamadaSegura(){
        println("Lado del cuadrado?")
        var entrada = readLine()
        val lado = entrada?.toDoubleOrNull()

        // Lambda que se ejecula solamente si el valor no es nulo; es como un if != null
        // Si el valor no es valido salta el let
        lado?.let {
            var resultado = it * it
            println(
                """
            El área del cuadrado es de: $resultado cms
        """.trimIndent()
            )
        }
        println("Programa finalizado")
    }
}