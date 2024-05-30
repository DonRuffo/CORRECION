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

    //DENNIS DIAZ
    public int getHabitaciones() {
        return habitaciones;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getPisos() {
        return pisos;
    }

    public double getArea() {
        return area;
    }

    public String getNombre() {
        return nombre;
    }

    //Richard Padilla
    public void mostrar(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Habitaciones: "+this.getHabitaciones());
        System.out.println("Pisos: "+this.getPisos());
        System.out.println("Calificacion: "+this.getCalificacion());
        System.out.println("Area: "+this.getArea());
    }

    //Dennis Diaz
    public void modificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine(); this.setNombre(nombre);
        System.out.println("Ingrese el habitacion: ");
        int habitaciones = sc.nextInt(); this.setHabitaciones(habitaciones);
        System.out.println("Ingrese el piso: ");
        int pisos = sc.nextInt(); this.setPisos(pisos);
        System.out.println("Ingrese el calificacion: ");
        double calificacion = sc.nextDouble(); this.setCalificacion(calificacion);
        System.out.println("Ingrese el area: ");
        double area = sc.nextDouble(); this.setArea(area);
    }

    //comprobando
}