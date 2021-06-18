package ejerciciosIniciales

import java.text.DecimalFormat
import kotlin.math.pow

/**
 *   Creado por @autor: Usuario
 *      El 18/06/2021
 *
 *
 **/
class Ejercicio3 {
    private val formato = ".00"
    // Esto es como una variable estática de java
    companion object {
        private var radio = 0.00
    }

    fun pedirDatos():Double{
        println(" Introduce el radio de la circunferencia en cms")
        radio = readLine()!!.toDouble()
        return radio
    }

    fun calcularArea(): Double {
        return Math.PI * radio.pow(2.0)
    }

    fun calcularPerimetro(): Double{
        return 2 * radio * Math.PI
    }
    fun visualizarDatos(dato1: Double =calcularArea(), dato2 : Double = calcularPerimetro()){
        val areaCms = DecimalFormat(formato).format(dato1)
        val perimCms = DecimalFormat(formato).format(dato2)
        val areaPul = DecimalFormat(formato).format(dato1 * 0.155)
        var perimPul = DecimalFormat(formato).format(dato2 * 0.39)
        println("""
            *** Centimetros ***
            Área               | $areaCms
            Circunferencia     | $perimCms
              
            *** Pulgadas *** 
            Área               | $areaPul
            Circunferencia     | $perimPul
                
        """.trimIndent())
    }
}