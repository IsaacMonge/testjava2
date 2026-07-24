package com.estudiodecaso2.estudiodecaso2;

public class Tratamiento {
    String tipo;
    String fecha;
    String observacion;

    public Tratamiento(String tipo, String fecha, String observacion) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return tipo + " | " + fecha + " | " + observacion;
    }
}