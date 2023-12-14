package com.example.examen_victorbriciofernandez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

import android.content.Intent


class MainActivity : AppCompatActivity() {

    data class Planeta(val name: String, val type: String, val image: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planets = listOf(
            Planeta("Mercurio", "Terrestre", R.drawable.mercurio),
            Planeta("Venus", "Gigante gaseoso", R.drawable.venus),
            Planeta("Tierra", "Terrestre", R.drawable.tierra),
            Planeta("Marte", "Gigante helado", R.drawable.marte),
            Planeta("Júpiter", "Gigante helado", R.drawable.jupiter),
            Planeta("Saturno", "Terrestre", R.drawable.saturno),
            Planeta("Urano", "Gigante gaseoso", R.drawable.urano),
            Planeta("Neptuno", "Gigante gaseoso", R.drawable.neptuno)
        )

        val adapter = PlanetaAdapter(this, planets)
        val listViewPlanetas: ListView = findViewById(R.id.planetsListView)
        listViewPlanetas.adapter = adapter

        listViewPlanetas.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, planetdetailactivity::class.java)
            val planet = planets[position]
            intent.putExtra("planet_name", planet.name)
            intent.putExtra("planet_type", planet.type)
            intent.putExtra("planet_image_res_id", planet.image)
            startActivity(intent)
        }
    }
}
/*
private fun leerPlanetas(): ArrayList<Planeta>{
    var lista = ArrayList<Planeta>()

    for(indice in 0..8){
        var planeta = Planeta("Nombre$indice", "Tipo$indice", "Image$indice")
        lista.add(planeta)
    }

    return lista
    }*/

