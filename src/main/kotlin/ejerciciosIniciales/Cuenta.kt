package ejerciciosIniciales

import kotlin.system.exitProcess

class Cuenta(var clave: String, var titular: String, var saldo: Double) {
    fun menu() {
        println(
            """
        Ingrese la acción a realizar:
            1->Ingresar dinero
            2->Retirar dinero
            presione cualquier botón para salir del programa
    """.trimIndent()
        )
        val opcion = readLine()!!.toInt()
        if (opcion == 1) {
            depositar()
        } else if (opcion == 2) {
            retirar()
        } else {
            println("Opción no valida, que tenga un buen día")
            System.out
        }
    }


    fun depositar() {
        println("Introduce la cantidad a ingresar")
        val saldoAnterior = saldo
        try {
            var cantidadIngresar = readLine()!!.toDouble()
            saldo += cantidadIngresar
            println(
                """
                Clave:  $clave - Titular: $titular
                Acción: Depósito de dinero
                Monto: $cantidadIngresar€
                Saldo Anterior: $saldoAnterior€
                Nuevo Saldo: $saldo€
                Gracias por usar nuestros servicios 
            """.trimIndent()
            )
        } catch (e: NumberFormatException) {
            println("Monto incorrecto")
            menu()

        }

    }

    fun retirar() {
        println("Introduce la cantidad a retirar")
        val saldoAnterior = saldo
        try {

            var cantidadRetirar = readLine()!!.toDouble()
            if (cantidadRetirar > saldo) {
                println("El monto a retirar ($cantidadRetirar) no puede ser mayor que el saldo ($saldo)\n" +
                        "No se pudo realizar la acción")
                exitProcess(1)
            } else
                saldo -= cantidadRetirar
            println("""
                Clave:  $clave - Titular: $titular
                Acción: Retiro de dinero
                Monto: $cantidadRetirar€
                Saldo Anterior: $saldoAnterior€
                Nuevo Saldo: $saldo€
                Gracias por usar nuestros servicios 
            """.trimIndent())

        } catch (e: NumberFormatException) {
            println("Cantidad no valida")
            menu()

        }
    }

}
