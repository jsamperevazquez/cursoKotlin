package herencia

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

open class Persona(
    var nombre: String,
    var apellidos: String,
    var direccion: String,
    var telefono: String?,
    var fechaNacimientoTexto: String
) {
    var fechaNacimiento : LocalDate = LocalDate.parse(fechaNacimientoTexto, DateTimeFormatter.ofPattern(FORMATO_FECHA)) // Convierte el texto pasado por parámetro en una fecha

    fun obtenerEdad(): Int {
        return Period.between(fechaNacimiento, LocalDate.now()).years  // Calcula la diferencia entre dos fechas (En Años (years) )
    }

    // Metodo de sobreescritura para ver valores de un objeto
    override fun toString(): String {
        return  "Nombre: $nombre\n" +
                "Apellidos: $apellidos\n" +
                "Dirección: $direccion\n" +
                "Telefono: ${telefono ?: "No disponible"}\n" +
                "Fecha de nacimiento: $fechaNacimiento\n" +
                "Edad: ${obtenerEdad()}"
    }
    companion object {
        const val FORMATO_FECHA = "dd/MM/yyyy"
    }

}