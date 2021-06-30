package excepciones

import java.io.File
import java.io.FileNotFoundException
import java.lang.Exception
import java.lang.NumberFormatException


class TryCatch {
    fun capturarExcpcion() {
        println("Introduce un número")
        try {
            val valor = readLine()!!.toDouble()
            println(valor)
        } catch (e: NumberFormatException) {
            println("Entrada incorrecta, el valor debe ser un número")
            capturarExcpcion()
        }
    }

    fun capturarExcepcionDesdeArchivo() {
        try {
            println("Cuantas veces quires repetir el mensaje??")
            val repeticiones = readLine()!!.toInt()
            val mensaje =
                File("C:\\Users\\angel\\OneDrive\\Escritorio\\archivo.txt").readLines()[0] // readlines devulve un arraylist con las lineas por ello [0]
            for (i in 0 until repeticiones)
                println(mensaje)
        } catch (e: FileNotFoundException) {
            println("Archivo no encontrado")
        } catch (e: NumberFormatException) {
            println("Dato de entrada no válido, debe ser un número")
            capturarExcepcionDesdeArchivo()
        } catch (e: Exception) {
            println("Error: ${e.localizedMessage}") // Si se diese una excepción diferente
        } finally {
            println("\nPrograma terminado")
        }
    }

    fun esNumero(valor: Any): Boolean{
    val resultado = try {
        valor.toString().toDouble()
        true
    }catch (e:NumberFormatException){
        false
    }
    if (resultado)
        println("Es número")

        else
        println("No es número")
        return resultado
    }

}