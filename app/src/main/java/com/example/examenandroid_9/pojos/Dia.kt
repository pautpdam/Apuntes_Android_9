package com.example.examenandroid_9.pojos

class Dia(private var nombre:String, private var tareas: List<Tarea>) {
    fun getNombre(): String {
        return nombre
    }

    fun getTareas(): List<Tarea> {
        return tareas
    }
}