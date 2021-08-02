import arrayList.ArrayListOf
import cicloFor.For
import ejerciciosIniciales.Ejercicio4
import ejerciciosIniciales.Ejercicio5
import ejerciciosIniciales.Ejercicio6
import ejerciciosIniciales.Ejercicio7
import excepciones.Throw
import excepciones.TryCatch
import herencia.Empleado
import herencia.Operario
import herencia.Persona
import nullSafety.Nulos
import whileDoWhile.DoWhile
import whileDoWhile.While

fun main(args: Array<String>) {
/*
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

    Funciones().mostrarMensaje("Realizado en kotlin")
    Funciones().ejemploParametros("Hola",2)
    println(Funciones().ejemplo())
    println(Funciones().calcularImpuestos(1500.00, 16.00))
    // Si no se envía valor en el argumento de la función coge el valor predeter, si se envía no.
    println(Funciones().ejemploPred())

    println(Funciones().calcularIva(producto = 289.00))

 */

      //  TasaCambio().calcularCambio()
    // Ejercicio1().solicitarDatos()
    // Ejercicio2().calcularNeto()

    /*
    Ejercicio3().pedirDatos()
    Ejercicio3().calcularArea()
    Ejercicio3().calcularPerimetro()
    Ejercicio3().visualizarDatos()

     */

    //  When().usarWhen()
     // When().comprobarCombustible()
    // When().otraManeraWhen()
    // When().whenEnRango()
    // When().whenEnVariable()
    // When().comprobarTipoDato()
    // For().forRango()
    // For().forArray()
    // For().forDosEnDos(For().forArray())
    // ArrayListOf().crearArrayListOf()
    // While().pedirEmpleados()
    // DoWhile().pedirNombres()
    // Ejercicio4().calcularPrecioTrayecto()
   /* Ejercicio5().calcularPromedio()
    Ejercicio5().calificacionMasAlta()
    Ejercicio5().calificacionMasBaja()
    Ejercicio5().alumnosReprobados()
    Ejercicio6().sumarListaNumeros()

    */
    //TryCatch().capturarExcpcion()
    // TryCatch().capturarExcepcionDesdeArchivo()
    // TryCatch().esNumero("4")
    // println(Throw().calcularInteresPrestamo(readLine()!!.toDouble()))
   /* Nulos().calcularAreaCuadrado()
    Nulos().calcularAreaCuadradoConElvis()
    Nulos().calcularAreaCuadradoOtraOpcion()
    Nulos().calcularAreaCuadradoLLamadaSegura()
    */
    // Ejercicio7().calcularDonas()
    val persona1 = Persona("Angel", "Lopez", "Garcia Barbon 45", "647797865" , "17/03/1989")
    println(persona1.obtenerEdad()) // obtener edad actual de la persona
    println(persona1)
    val empleado1 = Empleado("Juan","Martinez","Portanet 32",null,"12/09/1991",1850.0)
    println(empleado1.obtenerEdad())
    println(empleado1)
    val operario1 = Operario("Marcos", "Martinez", "Orense 13","986452432", "30/11/1981",2000.0 , "Oficial")
    println(operario1.obtenerEdad())
    println(operario1)
}
