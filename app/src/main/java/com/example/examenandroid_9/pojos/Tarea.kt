package com.example.examenandroid_9.pojos

class Tarea(private var nombre: String, private var prioridad: Int, private var imagen: Int) {
    fun getNombre(): String {
        return nombre
    }

    fun getPrioridad(): Int {
        return prioridad
    }

    fun getImagen(): Int {
        return imagen
    }
}