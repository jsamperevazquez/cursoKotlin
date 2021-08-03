package clasesAbstractas

abstract class Poligono(identificador : String)  {

    abstract fun obtenerArea() : Double
    abstract fun obtenerPerimetro() : Double
    abstract fun dibujar()

    // Esta función no tiene porqué ser implementada por las clases que hereden de esta
    protected fun centimetrosAPulgadas(valor: Double) : Double {
        return (1/2.54) * valor
    }
}