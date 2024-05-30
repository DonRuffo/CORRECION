// Richard Padilla
// Dennis Diaz
package org.example;

import java.util.Scanner;
public class Hoteles {
    int habitaciones, pisos;
    double calificacion, area;
    String nombre;

// Dennis Diaz
    public Hoteles(){}
    public Hoteles(int habitaciones, int pisos, double calificacion, double area, String nombre){
        this.habitaciones = habitaciones;
        this.pisos = pisos;
        this.calificacion = calificacion;
        this.area = area;
        this.nombre = nombre;
    }

    //Richard Padilla
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}