package ejerciciosIniciales

import kotlin.math.roundToInt

class Ejercicio4 {
    fun calcularPrecioTrayecto() {
        val precioKm = 2.25
        do {
            println("Ingrese los kms del trayecto a realizar o s para salir")
            var kms = readLine()!!
            while (kms.isEmpty()) {
                println("Se deben ingresar los kilómetros del trayecto ")
                println("Ingrese los kms del trayecto a realizar o s para salir")
                kms = readLine()!!
                if (kms == "s")
                    break
                val kms = readLine()!!
            }
            if (kms == "s")
                break

            println("Tiene 60 o más años y documentación que lo acredite? Introduce si o 1 para caso afirmativo ")
            val opcionDescuento = readLine()!!.toString()
            when (opcionDescuento) {
                "1", "si" -> println("Total a cobrar: " + ((precioKm * kms.toInt()) - (precioKm * kms.toInt() * 0.45)).roundToInt() + "€\n")
                else -> println("Total a cobrar: " + (precioKm * kms.toInt()).roundToInt() + "€\n") // readondea y convierte a Int
            }
        } while (kms != "s")
        println("Programa finalizado")


    }
}