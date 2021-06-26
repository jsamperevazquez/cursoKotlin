package ejerciciosIniciales

class Ejercicio5 {
    var listaAlumnos = arrayOf( "José", "Alberto", "Laura"," Noel", "Erika", "Daniel" )
    var calificaciones = arrayOf( 31.0,94.0,98.5,75.0,46.5,75.0 )

    fun calcularPromedio() {
        println("Promedio de calificación: " + calificaciones.sum() / calificaciones.size)
    }

    fun calificacionMasAlta(){
        println("La clasificación más alta: " + calificaciones.maxOrNull())
    }

    fun calificacionMasBaja(){
        println("La clasificación más baja: " + calificaciones.minOrNull())
    }
    fun alumnosReprobados(){
        println("\nReprobados:")
         calificaciones.forEachIndexed{indice, clasificacion ->
            if (clasificacion < 60.0 )
                println(listaAlumnos[indice] + ", " + clasificacion)

        }
    }
}