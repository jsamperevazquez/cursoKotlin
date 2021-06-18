package ejerciciosIniciales

import java.text.DecimalFormat

/**
 *   Creado por @autor: Usuario
 *      El 18/06/2021
 *
 *
 **/
class Ejercicio2 {

    private val formato = ".00"

    fun calcularNeto(){
        println(" Introduzca su salario mensual bruto ")
        val sueldoBruto = readLine()!!.toDouble()

        println(" Introduzca su impuesto mensual ")
        val impuesto = readLine()!!.toFloat()

        val sueldoNetoMes = DecimalFormat(formato).format(sueldoBruto - (sueldoBruto * impuesto / 100))
        val impuestosMes = DecimalFormat(formato).format(sueldoBruto * impuesto / 100)
        val netoAnual = ((sueldoBruto - (sueldoBruto * impuesto / 100)) * 12).toInt().toBigDecimal()
        val impuestosAnual = ((sueldoBruto * impuesto / 100) * 12).toInt().toBigDecimal()
        println("""
            Salario mensual neto: $sueldoNetoMes€
            Impuestos a pagar por mes: $impuestosMes€
            
            Salario anual neto: $netoAnual
            Impuestos a pagar por año: $impuestosAnual
        """.trimIndent())
    }
}