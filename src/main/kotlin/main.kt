fun main(args: Array<String>) {

    val numero=10   // Tipo val no se puede reasignar (final)

    var numero2 =20 // var se puede modificar o reasignar
    numero2 = 30
    println(numero)
    println(numero2)

    // Petición de datos al usuario
    println("Introduce tu nombre: ")
    val nombre= readLine()

    println("Introduce tu edad: ")
    val edad= readLine()

    // primera manera de concatenar
    println("Tu nombre es: " + nombre + " y tu edad es de " + edad + " annos")

    // Segunda manera de concatenar más práctica (String template)
    println("Tu nombre es: $nombre y tu edad es de $edad annos")


    //Raw String (tres veces comillas dobles y enter ya nos da el método para ello)
    println("""
        *** DATOS ***
        nombre: $nombre
        edad: $edad annos
    """.trimIndent())



}