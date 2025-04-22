package org.example

fun nombreFecha(nombre:String, fecha:String ):String {
    return "soy $nombre y hoy es $fecha"
}

fun areaRectangulo(base:Double,altura:Double):Double{
    return base*altura
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
}