package ejerciciosIniciales.ultimoEjercicio

open abstract class Electrodomestico(
    var numeroSerie: String,
    var tipo: Electrodomesticos.tipoElectrodomestico,
    var color: Electrodomesticos.color,
    var peso: Float,
    var precio: Double
) {
    init {
        electrodomesticosFabricados++
    }

    companion object {
        var electrodomesticosFabricados = 0
        fun mostrarFabricados() {
            println("Total de productos fabricados: $electrodomesticosFabricados")
        }
    }

    override fun toString(): String {
        return "Numero de Serie: $numeroSerie  -  Tipo: $tipo  -  Peso: $peso Kg  -  Precio: $precio€"
    }
}