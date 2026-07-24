package com.estudiodecaso2.estudiodecaso2;

public class ListaDoble {
    NodoDoble cabeza;

    public void agregar(Tratamiento t) {
        NodoDoble nuevo = new NodoDoble(t);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoDoble aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            nuevo.anterior = aux;
        }
    }

    public String listar() {
        String lista = "";
        NodoDoble aux = cabeza;

        while (aux != null) {
            lista += aux.dato.toString() + "\n";
            aux = aux.siguiente;
        }

        return lista;
    }

    public void eliminar(String tipo) {
        NodoDoble aux = cabeza;

        while (aux != null) {
            if (aux.dato.tipo.equalsIgnoreCase(tipo)) {
                if (aux.anterior != null) {
                    aux.anterior.siguiente = aux.siguiente;
                } else {
                    cabeza = aux.siguiente;
                }

                if (aux.siguiente != null) {
                    aux.siguiente.anterior = aux.anterior;
                }
                break;
            }
            aux = aux.siguiente;
        }
    }
}