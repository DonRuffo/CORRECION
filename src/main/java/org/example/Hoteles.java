package org.example;

import java.util.Scanner;
public class Hoteles {
    int habitaciones, pisos;
    double calificacion, area;
    String nombre;

    public Hoteles(){}
    public Hoteles(int habitaciones, int pisos, double calificacion, double area, String nombre){
        this.habitaciones = habitaciones;
        this.pisos = pisos;
        this.calificacion = calificacion;
        this.area = area;
        this.nombre = nombre;
    }
}