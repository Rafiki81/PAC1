package com.rafaFormacion;

import java.util.ArrayList;
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

        List<Integer> asientos = new ArrayList<>();

        for(int i = 1; i== plazasAvion; i++){

            asientos.add(i);
            System.out.println(i);

        }



    }
}
