package com.rafaFormacion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void poblarDatos(){
        Avion avion = new Avion(15);
        Pasajero pasajero1 = new Pasajero("Juan", 1);
        pasajero1.setTieneTarjeta(true);
        Pasajero pasajero2 = new Pasajero("Pedro", 2);
        pasajero2.setTieneTarjeta(true);
        Pasajero pasajero3 = new Pasajero("Pablo", 3);
        pasajero3.setTieneTarjeta(true);
        Pasajero pasajero4 = new Pasajero("Jimena", 4);
        pasajero4.setTieneTarjeta(true);
        Pasajero pasajero5 = new Pasajero("Alfonso", 5);
        pasajero5.setTieneTarjeta(true);
        Pasajero pasajero6 = new Pasajero("Ana", 6);
        pasajero6.setTieneTarjeta(true);
        Pasajero pasajero7 = new Pasajero("Rafael", 7);
        pasajero7.setTieneTarjeta(true);
        Pasajero pasajero8 = new Pasajero("Carmen", 8);
        pasajero8.setTieneTarjeta(true);
        Pasajero pasajero9 = new Pasajero("Juan Carlos", 9);
        pasajero9.setTieneTarjeta(true);
        Pasajero pasajero10 = new Pasajero("Eva", 10);
        pasajero10.setTieneTarjeta(true);
        Pasajero pasajero11 = new Pasajero("Milagros", 11);
        pasajero11.setTieneTarjeta(true);
        Pasajero pasajero12 = new Pasajero("Encarna", 12);
        pasajero12.setTieneTarjeta(true);
        Pasajero pasajero13 = new Pasajero("Adrian", 13);
        pasajero13.setTieneTarjeta(true);
        //Añadimos dos sin tarjeta
        Pasajero pasajero14 = new Pasajero();
        pasajero14.setNombre("Alberto");
        pasajero14.setTieneTarjeta(false);
        Pasajero pasajero15 = new Pasajero();
        pasajero15.setNombre("Daniel");
        pasajero15.setTieneTarjeta(false);


        Pasajeros pasajeros = new Pasajeros(avion.getPlazasAvion());
        ArrayList<Pasajero> listaPasajeros = new ArrayList<Pasajero>();
        pasajeros.setPasajeros(listaPasajeros);

        pasajeros.addPasajeros(pasajero1);
        pasajeros.addPasajeros(pasajero2);
        pasajeros.addPasajeros(pasajero3);
        pasajeros.addPasajeros(pasajero4);
        pasajeros.addPasajeros(pasajero5);
        pasajeros.addPasajeros(pasajero6);
        pasajeros.addPasajeros(pasajero7);
        pasajeros.addPasajeros(pasajero8);
        pasajeros.addPasajeros(pasajero9);
        pasajeros.addPasajeros(pasajero10);
        pasajeros.addPasajeros(pasajero11);
        pasajeros.addPasajeros(pasajero12);
        pasajeros.addPasajeros(pasajero13);
        pasajeros.addPasajeros(pasajero14);
        pasajeros.addPasajeros(pasajero15);

        //Los desordenamos
        pasajeros.desordenar();

        //Los embarcamos
        avion.embarcar(pasajeros);


    }
}
