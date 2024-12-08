package com.example.examenandroid_9.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.examenandroid_9.databinding.ItemTareasBinding
import com.example.examenandroid_9.pojos.Tarea

class TareasAdapter(
    private val tareas: List<Tarea>
) : RecyclerView.Adapter<TareasAdapter.TareaViewHolder>() {

    inner class TareaViewHolder(private val binding: ItemTareasBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tarea: Tarea) {
            binding.txtTareaName.text = tarea.getNombre()
            binding.txtTareaPriority.text = "Prioridad: ${tarea.getPrioridad()}"
            binding.imgTarea.setImageResource(tarea.getImagen())

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "Tarea seleccionada: ${tarea.getNombre()}\nPrioridad: ${tarea.getPrioridad()}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Métodos estándar de un adaptador de RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareaViewHolder {
        // Inflamos el layout para cada tarea.
        val binding = ItemTareasBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TareaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TareaViewHolder, position: Int) {
        // Llenamos los datos de la tarea en la vista.
        holder.bind(tareas[position])
    }

    override fun getItemCount(): Int = tareas.size
}