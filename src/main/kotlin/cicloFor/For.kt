package cicloFor

class For {
    fun forRango(){
        for (x in 0..5){ // de 0 a 5
            println(x)
        }
    }
    fun forArray(): IntArray{
        var sumatorio = 0
        val array = intArrayOf(10,15,20,25,30)

        for (i in 0 until array.size){
            sumatorio += array[i]
            println(array[i])
        }
        println("""
            Suma total de los elementos del array = $sumatorio
        """.trimIndent())
        return array
    }
    fun forDosEnDos(array: IntArray){
        for ( i in 0 until array.size step 2){ // Itera de 2 en 2
            println(array[i])
        }
    }
}