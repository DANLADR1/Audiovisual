package cine;

public class Pelicula extends ObraVisual implements Calificacion {

    String actores;
    boolean educativo;
    double puntuacion;

    @Override
    public void puntuar(double puntos){
        puntuacion+=puntos;
    }
}
