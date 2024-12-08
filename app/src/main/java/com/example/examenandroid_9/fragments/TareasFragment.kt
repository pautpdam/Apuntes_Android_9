package com.example.examenandroid_9.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examenandroid_9.R
import com.example.examenandroid_9.adapters.TareasAdapter
import com.example.examenandroid_9.pojos.Tarea

class TareasFragment : Fragment() {
    private var tareas: List<Tarea> = emptyList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tareas, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewTareas)
        recyclerView.layoutManager = LinearLayoutManager(context)

        recyclerView.adapter = TareasAdapter(tareas)

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(tareas: List<Tarea>) =
            TareasFragment().apply {
                this.tareas = tareas
            }
    }
}