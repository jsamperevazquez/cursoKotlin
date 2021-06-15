package casaCambio

import java.text.DecimalFormat
import kotlin.system.exitProcess

/**
 *   Creado por @autor: Usuario
 *      El 10/06/2021
 *
 *
 **/
class TasaCambio {

    private var tasaCambio = 0.0
    private var eurosCaja = 0.0
    private var dolaresCaja = 0.0
    private val formato = ".00"

    fun calcularCambio() {
        println(" Introduzca cuanto es la tasa cambio de $ a € ")
        tasaCambio = readLine()!!.toDouble()

        println(" Cuanto dinero tines en € en caja ")
        eurosCaja = readLine()!!.toDouble()

        println(" Cuanto dinero tienes en $ en caja ")
        dolaresCaja = readLine()!!.toDouble()
        var cantidadDolares: Double
        var totalEuros: Double
        do {

            println("$ que desea cambiar a €")
            cantidadDolares = readLine()!!.toDouble()
            if (cantidadDolares <= 0) {

                println(" Importe erroneo , vuelva a intentarlo ")
            }


            totalEuros = cantidadDolares * tasaCambio
            if (eurosCaja < totalEuros) {

                println(" Sin capacidad en € para realizar el cambio ")
                exitProcess(1)

            }
            dolaresCaja += cantidadDolares
            eurosCaja -= totalEuros


        } while (cantidadDolares > 0 && eurosCaja > totalEuros)

        println(
            """ 
            Ha cerrado caja con un total de: 
            ${DecimalFormat(formato).format(dolaresCaja)} $
            ${DecimalFormat(formato).format(eurosCaja)} €
        """.trimIndent()
        )
    }
}