package com.rafaFormacion;

import java.util.Collections;
import java.util.List;

public class Pasajeros {

    private List<Pasajero> pasajeros;
    private int numeroPasajeros;

    public Pasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean tieneMasPasajeros(){

        if (pasajeros.size()>0){
            return true;
        }else  {
            return false;
        }
    }

    public Pasajero siguientePasajero(){

       return pasajeros.get(0);

    }

    public void addPasajero(Pasajero pasajero){

        pasajeros.add(pasajero);

    }

    public void removePasajero(Pasajero pasajero){

        pasajeros.remove(pasajero);
    }

    public void desordenar(){

        Collections.shuffle(pasajeros);

    }
}
