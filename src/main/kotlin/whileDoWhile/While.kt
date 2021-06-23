package whileDoWhile

class While {
    fun pedirEmpleados(){
        println(" Ingresa los nombres de los empleados \n")
        val listaEmpleados = arrayListOf<String>()

        println("Nombre: ")
        var nombre = readLine().toString()

        while (nombre.isNotEmpty()){
            listaEmpleados.add(nombre)
            println("Nombre: ")
            nombre = readLine().toString()
        }
        println("\n----RESULTADO----\n")
        for (empleado in listaEmpleados)
            println(empleado)
    }
}