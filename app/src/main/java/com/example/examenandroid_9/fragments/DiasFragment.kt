package com.example.examenandroid_9.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examenandroid_9.R
import com.example.examenandroid_9.adapters.DiasAdapter
import com.example.examenandroid_9.interfaces.OnClickListener
import com.example.examenandroid_9.pojos.DiasDatos

class DiasFragment : Fragment() {
    private var listener: OnClickListener? = null
    private lateinit var diasAdapter: DiasAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dias, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewDias)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val dias = DiasDatos().datos()
        diasAdapter = DiasAdapter(dias, listener)

        recyclerView.adapter = diasAdapter

        return view
    }

    fun setOnClickListener(listener: OnClickListener) {
        this.listener = listener
    }
}