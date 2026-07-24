package com.estudiodecaso2.estudiodecaso2;

public class ListaCircular {
    NodoCircular cabeza;

    public void insertar(Animal a) {
        NodoCircular nuevo = new NodoCircular(a);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            NodoCircular ultimo = cabeza.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }

    public String recorrerAdelante() {
        String lista = "";
        if (cabeza == null) return "Vacío";

        NodoCircular aux = cabeza;
        do {
            lista += aux.dato.nombre + "\n";
            aux = aux.siguiente;
        } while (aux != cabeza);

        return lista;
    }

    public String recorrerAtras() {
        String lista = "";
        if (cabeza == null) return "Vacío";

        NodoCircular aux = cabeza.anterior;
        NodoCircular inicio = aux;

        do {
            lista += aux.dato.nombre + "\n";
            aux = aux.anterior;
        } while (aux != inicio);

        return lista;
    }

    public void eliminar(String nombre) {
        if (cabeza == null) return;

        NodoCircular aux = cabeza;

        do {
            if (aux.dato.nombre.equalsIgnoreCase(nombre)) {

                if (aux == cabeza && aux.siguiente == cabeza) {
                    cabeza = null;
                    return;
                }

                aux.anterior.siguiente = aux.siguiente;
                aux.siguiente.anterior = aux.anterior;

                if (aux == cabeza) {
                    cabeza = aux.siguiente;
                }

                return;
            }

            aux = aux.siguiente;
        } while (aux != cabeza);
    }
}