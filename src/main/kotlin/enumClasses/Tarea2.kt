package enumClasses

class Tarea2(var nombre : String, var estado : EstadoTarea) {
}

enum class EstadoTarea{
    PENDIENTE,
    EN_PROCESO,
    REALIZADA
}
