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

        listaPersonajes.add(new Personaje(
                "Batman: El Caballero de la Noche",
                "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_FMjpg_UX1000_.jpg",
                "2008",
                "Acción, Crimen",
                "Christopher Nolan",
                "4.9/5"
        ));

        listaPersonajes.add(new Personaje(
                "Avengers: Endgame",
                "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_FMjpg_UX1000_.jpg",
                "2019",
                "Acción, Sci-Fi",
                "Anthony y Joe Russo",
                "4.8/5"
        ));

        listaPersonajes.add(new Personaje(
                "Joker",
                "https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX1000_.jpg",
                "2019",
                "Drama, Crimen",
                "Todd Phillips",
                "4.7/5"
        ));

        listaPersonajes.add(new Personaje(
                "The Matrix",
                "https://m.media-amazon.com/images/M/MV5BNzQzOTk3OTAtNDQ0Zi00ZTVkLWI0MTEtMDllZjNkYzNjNTc4L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_FMjpg_UX1000_.jpg",
                "1999",
                "Sci-Fi, Acción",
                "Lilly y Lana Wachowski",
                "4.8/5"
        ));

        listaPersonajes.add(new Personaje(
                "Inception",
                "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_FMjpg_UX1000_.jpg",
                "2010",
                "Sci-Fi, Acción",
                "Christopher Nolan",
                "4.8/5"
        ));

        listaPersonajes.add(new Personaje(
                "Interestelar",
                "https://m.media-amazon.com/images/M/MV5BZjdkOTU3MDktN2IxOS00OGEyLWFmMjktY2FiMmZkNWIyODZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX1000_.jpg",
                "2014",
                "Sci-Fi, Drama",
                "Christopher Nolan",
                "4.8/5"
        ));

        rcPersonajes.setLayoutManager(new LinearLayoutManager(this));
        PersonajeAdaptador adaptador = new PersonajeAdaptador(listaPersonajes);
        rcPersonajes.setAdapter(adaptador);
    }
}
