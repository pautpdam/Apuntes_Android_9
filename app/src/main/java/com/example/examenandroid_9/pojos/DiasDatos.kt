package com.example.examenandroid_9.pojos

import com.example.examenandroid_9.R

class DiasDatos {
    fun datos(): List<Dia> {
        return listOf(
            Dia("Lunes", listOf(
                Tarea("Hacer ejercicio", 1, R.drawable.ic_ejercicio),
                Tarea("Planificar la semana", 2, R.drawable.ic_planificar),
                Tarea("Comprar víveres", 3, R.drawable.ic_compras)
            )),
            Dia("Martes", listOf(
                Tarea("Estudiar Kotlin", 1, R.drawable.ic_estudio),
                Tarea("Asistir a la reunión de equipo", 2, R.drawable.ic_reunion),
                Tarea("Leer un libro", 3, R.drawable.ic_lectura)
            )),
            Dia("Miércoles", listOf(
                Tarea("Correr 5km", 1, R.drawable.ic_correr),
                Tarea("Limpiar la casa", 2, R.drawable.ic_limpieza),
                Tarea("Cocinar algo nuevo", 3, R.drawable.ic_cocina)
            )),
            Dia("Jueves", listOf(
                Tarea("Escribir en el diario", 1, R.drawable.ic_diario),
                Tarea("Ver un documental", 2, R.drawable.ic_documental),
                Tarea("Llamar a un amigo", 3, R.drawable.ic_llamada)
            )),
            Dia("Viernes", listOf(
                Tarea("Ir al gimnasio", 1, R.drawable.ic_gimnasio),
                Tarea("Salir a cenar", 2, R.drawable.ic_cena),
                Tarea("Ver una película", 3, R.drawable.ic_pelicula)
            )),
            Dia("Sábado", listOf(
                Tarea("Pasear por el parque", 1, R.drawable.ic_parque),
                Tarea("Hacer un picnic", 2, R.drawable.ic_picnic),
                Tarea("Jugar videojuegos", 3, R.drawable.ic_videojuegos)
            )),
            Dia("Domingo", listOf(
                Tarea("Desayunar en la cama", 1, R.drawable.ic_desayuno),
                Tarea("Ordenar la ropa", 2, R.drawable.ic_ordenar),
                Tarea("Meditar 15 minutos", 3, R.drawable.ic_meditar)
            ))
        )
    }
}