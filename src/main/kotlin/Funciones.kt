import java.util.*

/**
 *   Creado por @autor: Usuario
 *      El 09/06/2021
 *
 *
 **/
class Funciones {
    fun mostrarMensaje(texto: String){
        println("""
            texto: $texto
            fecha: ${Date()}
        """.trimIndent())
    }

    // Funci�n con varios par�metros
    fun ejemploParametros(datoUno: String, datoDos:Int){
        println("""
            parametro: $datoUno
            parametro: $datoDos
        """.trimIndent())
    }

    // Funci�n con retorno
    fun ejemplo(): String{
        return "Hola desde Kotlin"
    }
    fun calcularImpuestos(salario: Double, porcentaje: Double): Double {

        return (salario / 100) * porcentaje

    }

    // Funci�n con valor predeterminado
    fun ejemploPred(datoUno: String = "Valor predeterminado "){
        println(datoUno)
    }

    fun calcularIva (producto:Double, iva:Double = 21.00): Double{
        return (producto*iva)/100
    }
}