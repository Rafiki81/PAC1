package com.rafaFormacion;

import java.util.Collections;
import java.util.List;

public class Pasajeros {

    private List<Pasajero> pasajeros;
    private int numeroPasajeros;

    public Pasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
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


    public void removePasajero(Pasajero pasajero){

        pasajeros.remove(pasajero);
    }

    public void desordenar(){

        Collections.shuffle(pasajeros);

    }

    public void addPasajeros(Pasajero pasajero) {

        pasajeros.add(pasajero);

    }
}
