package com.rafaFormacion;

public class Pasajero {
    private String nombre;
    private int asientoAsignado;
    private boolean tieneTarjeta;

    public Pasajero(String nombre, int asientoAsignado) {
        this.nombre = nombre;
        this.asientoAsignado = asientoAsignado;
    }

    public Pasajero() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsientoAsignado() {
        return asientoAsignado;
    }

    public void setAsientoAsignado(int asientoAsignado) {
        this.asientoAsignado = asientoAsignado;
    }

    public boolean isTieneTarjeta() {
        return tieneTarjeta;
    }

    public void setTieneTarjeta(boolean tieneTarjeta) {
        this.tieneTarjeta = tieneTarjeta;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", asientoAsignado=" + asientoAsignado +
                ", tieneTarjeta=" + tieneTarjeta +
                '}';
    }
}
