package interfaces

import kotlin.math.roundToInt

class Cuadrado (var base : Double, var altura: Double, override var indentificador: String, ): IPoligono,IGraficos{
    override fun obtenerArea(): Double {
        return base * altura
    }

    override fun obtenerPerimetro(): Double {
        return (2 * base) + (2 * altura)
    }

    override fun dibujar() {
        for (i in 1..altura.roundToInt()){
            println(" * ".repeat(base.toInt()))
        }
    }

    fun obtenerAreaPulgadas(): Double {
        return centimetrosAPulgadas(obtenerArea())
    }

    fun obtenerPerimetroPulgadas(): Double {
        return centimetrosAPulgadas(obtenerPerimetro())
    }
}