package com.example.examenandroid_9.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examenandroid_9.databinding.ItemDiasBinding
import com.example.examenandroid_9.interfaces.OnClickListener
import com.example.examenandroid_9.pojos.Dia

class DiasAdapter(
    private val dias: List<Dia>,
    private val listener: OnClickListener?
) : RecyclerView.Adapter<DiasAdapter.DiaViewHolder>() {

    inner class DiaViewHolder(private val binding: ItemDiasBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(dia: Dia) {
            binding.txtTareaName.text = dia.getNombre()
            binding.root.setOnClickListener {
                listener?.onButtonClick(dia.getTareas())
            }
        }
    }

    // Métodos estándar de un adaptador de RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiaViewHolder {
        // Inflamos el layout para cada elemento de la lista
        val binding = ItemDiasBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DiaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DiaViewHolder, position: Int) {
        // Llenamos los datos del día en la vista.
        holder.bind(dias[position])
    }

    override fun getItemCount(): Int = dias.size
}