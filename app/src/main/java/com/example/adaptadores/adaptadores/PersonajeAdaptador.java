package com.example.adaptadores.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.example.adaptadores.Clases.Personaje;
import com.example.adaptadores.R;

import java.util.List;

public class PersonajeAdaptador extends RecyclerView.Adapter<PersonajeAdaptador.ViewHolder> {

    private final List<Personaje> datos;

    public PersonajeAdaptador(List<Personaje> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public PersonajeAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeAdaptador.ViewHolder holder, int position) {
        Personaje dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPelicula;
        TextView txtTitulo, txtAnio, txtGenero, txtDirector, txtCalificacion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPelicula = itemView.findViewById(R.id.imgPelicula);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtAnio = itemView.findViewById(R.id.txtAnio);
            txtGenero = itemView.findViewById(R.id.txtGenero);
            txtDirector = itemView.findViewById(R.id.txtDirector);
            txtCalificacion = itemView.findViewById(R.id.txtCalificacion);
        }

        public void bind(Personaje dato) {
            if (dato.getImagen() == null || dato.getImagen().isEmpty()) {
                itemView.setVisibility(View.GONE);
                itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
                return;
            }
            itemView.setVisibility(View.VISIBLE);
            itemView.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            txtTitulo.setText(dato.getTitulo());
            txtAnio.setText(dato.getAnio());
            txtGenero.setText(dato.getGenero());
            txtDirector.setText("Dir: " + dato.getDirector());
            txtCalificacion.setText("★ " + dato.getCalificacion());

            // Usamos Picasso con configuración robusta
            Picasso.get()
                    .load(dato.getImagen())
                    .placeholder(android.R.drawable.progress_horizontal)
                    .error(android.R.drawable.stat_notify_error)
                    .into(imgPelicula);
        }
    }
}
