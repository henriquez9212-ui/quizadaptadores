package com.example.adaptadores;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.adaptadores.Clases.Personaje;
import com.example.adaptadores.adaptadores.PersonajeAdaptador;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcPersonajes;
    List<Personaje> listaPersonajes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rcPersonajes = findViewById(R.id.rcPersonajes);

        // Películas con imágenes directas de TMDB (Servidor oficial de imágenes)
        // He seleccionado títulos variados con una estética cinematográfica profesional
        listaPersonajes.add(new Personaje(
                "Inception",
                "https://image.tmdb.org/t/p/w780/9e3STmYmqRQUOoB3D80qT2T9phV.jpg",
                "2010",
                "Sci-Fi, Acción",
                "Christopher Nolan",
                "4.8/5"
        ));

        listaPersonajes.add(new Personaje(
                "The Dark Knight",
                "https://image.tmdb.org/t/p/w780/qJ2tW6WMUDp9QmSbmzXkeyzqA60.jpg",
                "2008",
                "Acción, Crimen",
                "Christopher Nolan",
                "4.9/5"
        ));

        listaPersonajes.add(new Personaje(
                "Spider-Man: Across the Spider-Verse",
                "https://image.tmdb.org/t/p/w780/8Vt4m9rYj11RrePLnlgznJu14uX.jpg",
                "2023",
                "Animación, Acción",
                "Joaquim Dos Santos",
                "4.9/5"
        ));

        listaPersonajes.add(new Personaje(
                "Pulp Fiction",
                "https://image.tmdb.org/t/p/w780/d5iIl9h9btztU0ccY79sotzU7uG.jpg",
                "1994",
                "Crimen, Drama",
                "Quentin Tarantino",
                "4.6/5"
        ));

        listaPersonajes.add(new Personaje(
                "Gladiator",
                "https://image.tmdb.org/t/p/w780/ty8TGRvSjov6icS9CfnJSarvYvO.jpg",
                "2000",
                "Acción, Drama",
                "Ridley Scott",
                "4.7/5"
        ));

        rcPersonajes.setLayoutManager(new LinearLayoutManager(this));
        PersonajeAdaptador adaptador = new PersonajeAdaptador(listaPersonajes);
        rcPersonajes.setAdapter(adaptador);
    }
}
