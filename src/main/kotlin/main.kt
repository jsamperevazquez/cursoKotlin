import ejerciciosIniciales.Cuenta
import enumClasses.EstadoTarea
import enumClasses.Tarea
import enumClasses.Tarea2
import javax.swing.JOptionPane

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
    /*
    val persona1 = Persona("Angel", "Lopez", "Garcia Barbon 45", "647797865" , "17/03/1989")
    println(persona1.obtenerEdad()) // obtener edad actual de la persona
    println(persona1)
    val empleado1 = Empleado("Juan","Martinez","Portanet 32",null,"12/09/1991",1850.0)
    println(empleado1.obtenerEdad())
    println(empleado1)
    val operario1 = Operario("Marcos", "Martinez", "Orense 13","986452432", "30/11/1981",2000.0 , "Oficial")
    println(operario1.obtenerEdad())
    println(operario1)
     */

    /*
    var rectangulo = Rectangulo(10.0, 5.0,"Rectangulo 1")
    println(rectangulo.obtenerArea())
    println(rectangulo.obtenerPerimetro())
    println(rectangulo.obtenerAreaPulgadas())
    println(rectangulo.obtenerPerimetroPulgadas())
    rectangulo.dibujar()
     */

    /*
    var cuadrado1 = Cuadrado(8.0,5.0,"cuadrado")
    println(cuadrado1.obtenerArea())
    println(cuadrado1.obtenerPerimetro())
    cuadrado1.dibujar()
     */
    /*
    // Las data class se utilizan para almacenar datos y atributos de objetos:
    val persona1 = Persona("Angel" , "986345432")
    println("La data class ya viene implementado el toString ::: $persona1")

    val persona2 = PersonaB("Juan", "678989878")
    println("La clase normal sin toString te muestra la dirección de memoria ::: $persona2")

    // Para hacer copia de un objeto con data class de forma directa (Todos los atributos del objeto):
    val persona3 = persona1.copy()
    println(persona3)

    // Para copiar solo atributos que deseemos copiar:
    val persona4 = persona1.copy("Marcos", persona1.telefono)
    println(persona4)

    // Las data class permiten desestructurar un objeto:
    val (nombre,telefono) = persona1
    println("$nombre,$telefono")
     */
    /*
    //Enum classes es una clase especial para enumerar constantes y limitar creación de objetos:
    // - Con una clase normal (Vemos que estado está una con MAY y otra min, con lo cual si no se trata no la tiene en cuenta):
    val listaTareas = arrayListOf(Tarea("Lavar ropa", "Pendiente"), Tarea("Comprar medicamentos", "pendiente"))

    var tareasPendientes = 0
    listaTareas.forEach {
        if (it.estado.equals("Pendiente"))
            tareasPendientes++
    }
    println(
        """
        Tareas pendientes de realizar= $tareasPendientes
    """.trimIndent()
    )
    // -Con una enum class:
    val listaTareas2 = arrayListOf(
        Tarea2("Comprar libros", EstadoTarea.PENDIENTE),
        Tarea2("LLevar coche taller", EstadoTarea.EN_PROCESO)
    )
    listaTareas2.forEach {
      when (it.estado){
          EstadoTarea.PENDIENTE-> println("""
              Tarea ${it.nombre} está pendiente
          """.trimIndent())
          EstadoTarea.EN_PROCESO -> println("""
              Tarea ${it.nombre} está realizándose
          """.trimIndent())
          EstadoTarea.REALIZADA -> println("""
              Tarea ${it.nombre} está terminada
          """.trimIndent())
      }
    }

     */
    var cuenta1 = Cuenta("01-8547-9","Alberto Palma", 5000.00)
    cuenta1.menu()


}
