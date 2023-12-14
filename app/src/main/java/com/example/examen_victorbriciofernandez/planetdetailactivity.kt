package com.example.examen_victorbriciofernandez
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
class planetdetailactivity: AppCompatActivity() {



        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.planetdetailactivity)

            val planetName = intent.getStringExtra("planet_name")
            val planetType = intent.getStringExtra("planet_type")
            val planetImageResId = intent.getIntExtra("planet_image", 0)

            //val imageView: ImageView = findViewById(R.id.planet_image)
            //imageView.setImageDrawable(ContextCompat.getDrawable(this, planetImage))

            val nameTextView: TextView = findViewById(R.id.planet_name)
            nameTextView.text = planetName

            val typeTextView: TextView = findViewById(R.id.planet_type)
            typeTextView.text = planetType
        }
    }


