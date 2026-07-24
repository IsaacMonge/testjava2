package com.estudiodecaso2.estudiodecaso2;

public class ListaSimple {
    NodoSimple cabeza;

    public void insertar(Animal animal) {
        NodoSimple nuevo = new NodoSimple(animal);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoSimple aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    public String listar() {
        String lista = "";
        NodoSimple aux = cabeza;

        while (aux != null) {
            lista += aux.dato.toString() + "\n";
            aux = aux.siguiente;
        }

        return lista;
    }

    public Animal buscar(String nombre) {
        NodoSimple aux = cabeza;
        while (aux != null) {
            if (aux.dato.nombre.equalsIgnoreCase(nombre)) {
                return aux.dato;
            }
            aux = aux.siguiente;
        }
        return null;
    }
}