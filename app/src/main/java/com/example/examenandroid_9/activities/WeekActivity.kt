package com.example.examenandroid_9.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examenandroid_9.R
import com.example.examenandroid_9.databinding.ActivityWeekBinding
import com.example.examenandroid_9.fragments.DiasFragment
import com.example.examenandroid_9.fragments.TareasFragment
import com.example.examenandroid_9.interfaces.OnClickListener
import com.example.examenandroid_9.pojos.Tarea

class WeekActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityWeekBinding
    private var isTablet: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityWeekBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        isTablet = binding.tareasFragmentContainer != null

        val diasFragment = supportFragmentManager.findFragmentById(R.id.diasFragmentContainer) as DiasFragment
        diasFragment.setOnClickListener(this)
    }

    override fun onButtonClick(tareas: List<Tarea>) {
        val nuevoFragment = TareasFragment.newInstance(tareas)

        if (isTablet) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.tareasFragmentContainer, nuevoFragment)
                .commit()
        } else {
            supportFragmentManager.beginTransaction()
                .replace(R.id.diasFragmentContainer, nuevoFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}