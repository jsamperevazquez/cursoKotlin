package ejerciciosIniciales.ultimoEjercicio

class Microondas(
    numeroSerie: String,
    tipo: Electrodomesticos.tipoElectrodomestico,
    color: Electrodomesticos.color,
    peso: Float,
    precio: Double,
    var potencia: Float
) : Electrodomestico(numeroSerie, tipo, color, peso, precio) {
    override fun toString(): String {
        return super.toString() + " -  Potencia: $potencia watts"
    }
}