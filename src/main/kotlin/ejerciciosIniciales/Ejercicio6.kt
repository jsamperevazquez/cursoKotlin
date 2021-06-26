package ejerciciosIniciales

class Ejercicio6 {

    fun sumarListaNumeros() {
        var numeros = arrayListOf<Double>()
        var numero = ""
        do {
            println("Introduce números a la lista. Marca 0 sumar todos y mostrar  el promedio ")
            numero = readLine().toString()
            if (numero != "0")
                numeros.add(numero.toDouble())
            else if (numero == "0")
                println("Sumatoria: " + numeros.sum().toInt() + "\n" + "Promedio: " + numeros.average())

        } while (numero != "0")
    }
}