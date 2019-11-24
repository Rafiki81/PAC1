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
        List<Integer> asientosLibres = new ArrayList<>();

        for (int i = 1; i <= plazasAvion; i++) {
            asientosLibres.add(i);
        }

        while (pasajeros.tieneMasPasajeros()) {

            Pasajero pasajero = pasajeros.siguientePasajero();


            if (pasajero.isTieneTarjeta()) {
                if (!asientos.contains(pasajero.getAsientoAsignado())) {
                    System.out.println("Quedan los siguientes asientos libres: ");
                    for (Integer i : asientosLibres) {
                        System.out.println(i);
                    }
                    System.out.println("El Pasajero " + pasajero.getNombre() + " tendrá el asiento " + pasajero.getAsientoAsignado());
                    asientos.add(pasajero.getAsientoAsignado());
                    asientosLibres.removeIf(n -> (n == pasajero.getAsientoAsignado()));
                    pasajeros.removePasajero(pasajero);
                } else {
                    while (asientos.contains(pasajero.getAsientoAsignado())) {
                        pasajero.setAsientoAsignado((int) (Math.random() * (plazasAvion) + 1));
                    }
                    System.out.println("Quedan los siguientes asientos libres: ");
                    for (Integer i : asientosLibres) {
                        System.out.println(i);
                    }
                    System.out.println("El Pasajero " + pasajero.getNombre() + " tendrá el asiento " + pasajero.getAsientoAsignado());
                    asientos.add(pasajero.getAsientoAsignado());
                    asientosLibres.removeIf(n -> (n == pasajero.getAsientoAsignado()));
                    pasajeros.removePasajero(pasajero);
                }

            } else {
                do {
                    pasajero.setAsientoAsignado((int) (Math.random() * (plazasAvion) + 1));
                } while (asientos.contains(pasajero.getAsientoAsignado()));
                System.out.println("Quedan los siguientes asientos libres: ");
                for (Integer i : asientosLibres) {
                    System.out.println(i);
                }
                System.out.println("El Pasajero " + pasajero.getNombre() + " tendrá el asiento " + pasajero.getAsientoAsignado());
                asientos.add(pasajero.getAsientoAsignado());
                asientosLibres.removeIf(n -> (n == pasajero.getAsientoAsignado()));
                pasajeros.removePasajero(pasajero);
            }


        }


    }
}
