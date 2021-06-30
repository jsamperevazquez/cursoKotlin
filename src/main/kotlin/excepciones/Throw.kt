package excepciones

import java.lang.Exception

class Throw {
    fun calcularInteresPrestamo(valor:Double): Double{
        if (valor> 100000){
            throw Exception ("El préstamo no puede ser mayor de 100000 €")
        }


        return valor * 0.10
    }
}