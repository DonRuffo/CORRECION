//Richard Padilla
//Dennis Dias
package org.example;

//Todo el Main fue desarrollado por ambos colaboradores
public class Main {
    public static void main(String[] args) {

        //creación de objetos
        Hoteles hotel1 = new Hoteles(40,5,4.3,63.4,"Colon");
        Hoteles hotel2 = new Hoteles(35,4,4.1,62.5,"Maverick");
        Hoteles hotel3 = new Hoteles(25,3,3.9,58.4,"San Antonio");
        Hoteles hotel4 = new Hoteles(43,7,4.5,70.0,"Marriot");
        Hoteles hotel5 = new Hoteles(23,3,3.6,40.0,"Quito");
        Hoteles hotel6 = new Hoteles();
        Hoteles hotel7 = new Hoteles();

        hotel3.setNombre(null);
        hotel3.setCalificacion(0);
        hotel3.setHabitaciones(0);    //seteo de valores a null o 0
        hotel3.setPisos(0);
        hotel3.setArea(0);

        hotel6.modificar();
        hotel7.modificar();
        hotel3.modificar();  //llamando a la función modificar para cambiar los valores de los objetos

        hotel1.mostrar();
        hotel2.mostrar();
        hotel3.mostrar();
        hotel4.mostrar();    // impresión de los atributos de todos los objetos con la función mostrar
        hotel5.mostrar();
        hotel6.mostrar();
        hotel7.mostrar();
    }
}