package whileDoWhile

class DoWhile {
    fun pedirNombres(){
        println(" Introduce los nombres uno a uno \n")
        val listaNombres = arrayListOf<String>()

        do {
            println(" Nombre: ")
            var nombre = readLine().toString()
            listaNombres.add(nombre)
        }while (nombre.isNotEmpty())

        println("\n-----RESULTADO----")
        for (nombre in listaNombres)
            println(nombre)
    }
}