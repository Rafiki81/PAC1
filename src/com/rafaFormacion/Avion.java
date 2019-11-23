package com.rafaFormacion;

import java.util.HashMap;
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

        HashMap<Integer, Pasajero> embarcados = new HashMap<>();

        while (pasajeros.tieneMasPasajeros()) {
            Pasajero pasajero = pasajeros.siguientePasajero();

            if (pasajero.isTieneTarjeta()) {
                if (!embarcados.containsKey(pasajero.getAsientoAsignado())) {
                    embarcados.put(pasajero.getAsientoAsignado(), pasajero);
                    pasajeros.removePasajero(pasajero);
                } else {
                    while (embarcados.containsKey(pasajero.getAsientoAsignado())) {
                        pasajero.setAsientoAsignado((int) (Math.random() * plazasAvion) + 1);
                    }
                    pasajeros.removePasajero(pasajero);
                }

            } else {
                while (embarcados.containsKey(pasajero.getAsientoAsignado()) || pasajero.getAsientoAsignado() == 0) {
                    pasajero.setAsientoAsignado((int) (Math.random() * plazasAvion) + 1);
                }
                pasajeros.removePasajero(pasajero);
            }
            System.out.println(pasajero);
        }

    }
}
