package arrayList

class ArrayListOf {

    fun crearArrayListOf() {
        val empleados = arrayListOf("Jesus", "Juan", "Angel")
        empleados.add("Pedro")

        for (empleado in empleados) {
            println(empleado)

        }
        println("-------------------\n")
        println("Ordenamos los elementos \n")
        empleados.sort()
        for (empleado in empleados)
        println(empleado)


        println("---------------------\n")
        // Ahora con foreach
        empleados.forEach { empleado ->
            println(empleado)
        }

        println("----------------------\n")
        // Ahora también con el índice
        empleados.forEachIndexed { i, empleado ->
            println("""
                Número empleado: $i, Nombre empleado: $empleado
            """.trimIndent())
        }
    }
}