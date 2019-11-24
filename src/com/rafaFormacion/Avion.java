package com.rafaFormacion;

import java.util.ArrayList;
import java.util.List;

public class Avion {

    private int plazasAvion;

    public Avion(int plazasAvion) {
        this.plazasAvion = plazasAvion;
    }

    public int getPlazasAvion() {
        return plazasAvion;
    }

    public void setPlazasAvion(int plazasAvion) {
        this.plazasAvion = plazasAvion;
    }

    public void embarcar(Pasajeros pasajeros) {

        List<Integer> asientos = new ArrayList<>();

        while(pasajeros.tieneMasPasajeros()){

            Pasajero pasajero = pasajeros.siguientePasajero();

            if(pasajero.isTieneTarjeta()){
                if(!asientos.contains(pasajero.getAsientoAsignado())){
                    System.out.println("El Pasajero " + pasajero.getNombre() + " tendrá el asiento " + pasajero.getAsientoAsignado());
                    asientos.add(pasajero.getAsientoAsignado());
                    pasajeros.removePasajero(pasajero);
                }else{
                    while(asientos.contains(pasajero.getAsientoAsignado())){
                        pasajero.setAsientoAsignado((int) (Math.random()*(plazasAvion)+1));
                    }
                    System.out.println("El Pasajero " + pasajero.getNombre() + " tendrá el asiento " + pasajero.getAsientoAsignado());
                    asientos.add(pasajero.getAsientoAsignado());
                    pasajeros.removePasajero(pasajero);
                }

            }else{
                do {
                    pasajero.setAsientoAsignado((int) (Math.random()*(plazasAvion)+1));
                } while(asientos.contains(pasajero.getAsientoAsignado()));
                System.out.println("El Pasajero " + pasajero.getNombre() + " tendrá el asiento " + pasajero.getAsientoAsignado());
                asientos.add(pasajero.getAsientoAsignado());
                pasajeros.removePasajero(pasajero);
            }

        }



    }
}
