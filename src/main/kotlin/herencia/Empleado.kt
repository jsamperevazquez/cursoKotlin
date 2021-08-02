package herencia

open class Empleado(
    nombre: String,
    apellidos: String,
    direccion: String,
    telefono: String?,
    fechaNacimientoTexto: String,
    var salario: Double
) : Persona(nombre, apellidos, direccion, telefono, fechaNacimientoTexto) {

    override fun toString(): String {
        return super.toString() + "\nSalario : $salario"
    }
}