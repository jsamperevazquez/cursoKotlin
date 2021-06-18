package ejerciciosIniciales

/**
 *   Creado por @autor: Usuario
 *      El 18/06/2021
 *
 *
 **/
class Ejercicio1 {

    fun solicitarDatos() {
        println(
            "Introduce tu dirección\n" +
                    "Nombre de la calle"
        )
        var calle = readLine()

        println("Ciudad")
        var ciudad = readLine()

        println("Provincia")
        var provincia = readLine()

        println("Pais")
        var pais = readLine()

        println("Código postal")
        var codigoPostal = readLine()!!.toInt()

        println("""
            $calle, $ciudad, $provincia, $pais, $codigoPostal
        """.trimIndent())

    }
}