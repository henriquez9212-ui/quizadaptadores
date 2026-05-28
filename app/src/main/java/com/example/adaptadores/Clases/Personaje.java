package com.example.adaptadores.Clases;

public class Personaje {
    private String titulo;
    private String imagen;
    private String anio;
    private String genero;
    private String director;
    private String calificacion;

    public Personaje(String titulo, String imagen, String anio, String genero, String director, String calificacion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.anio = anio;
        this.genero = genero;
        this.director = director;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
