package cine;

public class Documental extends ObraVisual {

    String actores;
    boolean educativo;
    int puntuacion;

    @Override
    public void puntuar(double puntos){
        puntuacion+=puntos;
    }
}
