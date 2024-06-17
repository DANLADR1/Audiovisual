package cine;

public class Pelicula extends ObraVisual {

    String actores;
    int puntuacion;
    boolean educativo;

    public void puntuar(int puntos){
        puntuacion+=puntos;
    }
}
