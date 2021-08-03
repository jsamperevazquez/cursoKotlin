package interfaces

interface IPoligono {

    var indentificador: String

    fun obtenerArea(): Double
    fun obtenerPerimetro(): Double


    fun centimetrosAPulgadas(valor : Double): Double {
        return (1 / 2.54) * valor
    }
}