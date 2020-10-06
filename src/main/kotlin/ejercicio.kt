

fun main(args: Array<String>) {

    val lista = listOf("Hola",2,3,"¿",0.1,"Qué",1,"tal",0.9,"?")

    var resultadoNum = 0.0
    var cadenadeString = ""
    var i = 0;

    repeat(lista.size){
        if (lista[i] is String)
            cadenadeString = cadenadeString + " " + lista[i]

        else if (lista [i] is Int){
            val numero = lista[i] as Int
            resultadoNum += numero
    } else if (lista[i] is Double){
        resultadoNum += lista[i] as Double
    }
        i++
    }
    print(resultadoNum)
    print(cadenadeString)
}