package CompanionObjectYConstantes

import java.lang.Exception

/**
 *   Creado por @autor: Usuario
 *      El 25/07/2021
 *
 *
 **/
class Nota(var nombre: String, var contenido: String) {
    init {
        numeroInstancias ++
        if (nombre.length > LONGITUD_MAXIMA_NOMBRE) throw  Exception (" El nombre no puede ser mayor de 10 caracteres")
    }
    companion object {
        const val LONGITUD_MAXIMA_NOMBRE = 10
        var numeroInstancias = 0
        fun mostrarNumeroInstancias(){
            println(numeroInstancias)
        }
    }
}