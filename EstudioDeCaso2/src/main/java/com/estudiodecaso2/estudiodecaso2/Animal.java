package com.estudiodecaso2.estudiodecaso2;

public class Animal {
    String nombre;
    int edad;
    String tratamiento;

    ListaDoble historial; // cada animal tiene su historial

    public Animal(String nombre, int edad, String tratamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.tratamiento = tratamiento;
        this.historial = new ListaDoble();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Tratamiento: " + tratamiento;
    }
}