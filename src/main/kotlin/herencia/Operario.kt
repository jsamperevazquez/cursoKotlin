package herencia

class Operario(
    nombre: String,
    apellidos: String,
    direccion: String,
    telefono: String?,
    fechaNacimientoTexto: String,
    salario: Double,
    var categoria: String
) : Empleado(nombre, apellidos, direccion, telefono, fechaNacimientoTexto, salario) {


    override fun toString(): String {
        return super.toString() + "\nCateforía del operario: $categoria"
    }
}