package ejerciciosIniciales.ultimoEjercicio

class Refrigerador(
    numeroSerie: String,
    tipo: Electrodomesticos.tipoElectrodomestico,
    color: Electrodomesticos.color,
    peso: Float,
    precio: Double,
    var capacidad: Float,
    var temperaturaMinConservador: Float,
    var temperaturaMinCongelador: Float
) : Electrodomestico(numeroSerie, tipo, color, peso, precio) {
    override fun toString(): String {
        return super.toString() + " - Capacidad: $capacidad ft^3 -  Temperatura mínima: [$temperaturaMinConservador ºC conservador][$temperaturaMinCongelador ºC congelador]"
    }

}