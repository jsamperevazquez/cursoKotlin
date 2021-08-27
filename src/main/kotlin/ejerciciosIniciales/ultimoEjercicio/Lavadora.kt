package ejerciciosIniciales.ultimoEjercicio

class Lavadora(
    numeroSerie: String,
    tipo: Electrodomesticos.tipoElectrodomestico,
    color: Electrodomesticos.color,
    peso: Float,
    precio: Double,
    var capacidad: Float
) : Electrodomestico(numeroSerie, tipo, color, peso, precio) {
    override fun toString(): String {
        return super.toString() + " -  Capacidad: $capacidad Kg"
    }
}
