package com.example.examen_victorbriciofernandez;

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView

class PlanetaAdapter(private val activity: Activity, private val listaPlanetas: List<MainActivity.Planeta>) : BaseAdapter(){

    class ViewHolder {
        lateinit var imageViewPlaneta: ImageView
        lateinit var textViewNombre: TextView
        lateinit var textViewTipo: TextView
    }

    override fun getCount(): Int {
        return listaPlanetas.size
    }

    override fun getItem(position: Int): Any {
        return listaPlanetas[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var myView = convertView
        var viewHolder = ViewHolder()

        if (myView == null) {
            val inflater = activity.layoutInflater
            myView = inflater.inflate(R.layout.item_planets_layout, null)

            viewHolder.imageViewPlaneta = myView.findViewById(R.id.planet_image)
            viewHolder.textViewNombre = myView.findViewById(R.id.planet_name)
            viewHolder.textViewTipo = myView.findViewById(R.id.planet_type)

            myView.tag = viewHolder
        } else {
            viewHolder = myView.tag as ViewHolder
        }


        viewHolder.textViewNombre.text = listaPlanetas[position].name
        viewHolder.textViewTipo.text = listaPlanetas[position].type
        viewHolder.textViewTipo.text = listaPlanetas[position].image.toString()

        return myView!!
    }
}

//data class Planeta(val name: String, val type: String, val image: Int)

