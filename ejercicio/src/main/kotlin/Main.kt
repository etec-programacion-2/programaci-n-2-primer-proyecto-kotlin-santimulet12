package org.example

fun nombreFecha(nombre:String, fecha:String ):String {
    return "soy $nombre y hoy es $fecha"
}

fun areaRectangulo(base:Double,altura:Double):Double{
    return base*altura
}

fun parOImpar(num:Int):String{
    if (num%2==0){
        return "par"
    }
    return "impar"
}

fun positivoNegativoCero(num:Int):String{
    return when{
        num == 0 -> "Cero"
        num < 0 -> "Negativo"
        else -> "Positivo"
    }
}

fun mostrarNumerosConLoops() {
    // Usando for
    println("Usando for:")
    for (i in 1..10) {
        println(i)
    }

    // Usando while
    println("\nUsando while:")
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }

    // Usando do-while
    println("\nUsando do-while:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 10)
}

fun loopAPares220():Unit{
    println("\nUsando for:")
    for(i:Int in 2..20 step 2){
        println(i)
    }

    println("\nUsando while:")
    var i:Int = 2
    while (i<=20){
        println(i)
        i += 2
    }

    println("\nUsando do-while:")
    var x:Int = 2
    do {
        println(x)
        x += 2
    }while (x<=20)
}

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun saludar(nombre: String, edad: Int = 0) {
    println("Hola $nombre, tienes $edad años")
}

fun potencia(base: Int, exponente: Int):Int{
    if (base == 1){
        return base
    }
    else if (exponente == 1){
        return base
    }
    else if (exponente == 0){
        return 1
    }
    else{
        var resultado:Int = 1
        for (i:Int in 1..exponente){
            resultado = resultado * base
        }
        return resultado
    }
}

fun demostrarAlcanceVariables() {
    // Variable local en el ámbito de la función
    val variableGlobal = "Soy global en esta función"

    // Bloque if con su propio ámbito
    if (true) {
        val variableIf = "Soy local del if"
        println("Dentro del if: $variableIf")
        println("Puedo acceder a: $variableGlobal")
    }

    // Bloque for con su propio ámbito
    for (i in 1..3) {
        val variableFor = "Soy local del for - iteración $i"
        println("Dentro del for: $variableFor")
        println("Puedo acceder a: $variableGlobal")
    }

    // Intentar acceder a variables locales fuera de su ámbito
    // println(variableIf)  // Esto daría error
    // println(variableFor) // Esto daría error
}

fun calcularPromedio(numeros: List<Int>): Double {
    var suma = 0  // Variable local mutable
    var contador = 0  // Variable local mutable

    for (numero in numeros) {
        suma += numero
        contador++
    }

    return if (contador > 0) suma.toDouble() / contador else 0.0
}

fun bigger(numeros: List<Int>){
    var auxGran: Int = numeros[0]
    for(numero in numeros){
       if (numero >= auxGran){
           auxGran = numero
       }
    }

    var auxPeque: Int = numeros[0]
    for(numero in numeros){
        if (numero<=auxPeque){
            auxPeque = numero
        }
    }
    println("El numero mas grande de la lista es: $auxGran")
    println("El numero mas pequeño de la lista es: $auxPeque")

}

fun main() {
    val name:String = "Santiago"
    val surname:String = "Mulet"
    println("¡Hola, Kotlin!")
    println(nombreFecha(name,"22/4/25"))

    //  Variables y Tipos de Datos

    val age:Int = 16
    val height:Double = 1.60
    val esEstudiante:Boolean = true

    println("Nombre: $name")
    println("Edad: $age")
    println("Altura: $height")
    println("Es estudiante: $esEstudiante")

    println("el area de un rectangulo de base 2 y altura 5 es ${areaRectangulo(2.0,5.0)}m2")

    //  Control de Flujo
    println("el numero 3 es ${parOImpar(3)}")

    println("el numero -10 es ${positivoNegativoCero(-10)}")

    //  Loops (Bucles)
    mostrarNumerosConLoops()

    loopAPares220()

    //  Funciones
    println("el factorial de 4 es ${factorial(4)}")
    saludar("Santi",16)

    println("3 a la 3 es ${potencia(3,3)}")

    //  Variables Locales y Alcance

    demostrarAlcanceVariables()

    val myList: List <Int> = listOf(10,5,3,8,9,2)
    println(calcularPromedio(myList))

    println(bigger(myList))
}