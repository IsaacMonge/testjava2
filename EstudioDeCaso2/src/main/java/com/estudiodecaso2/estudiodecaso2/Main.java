package com.estudiodecaso2.estudiodecaso2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        ListaSimple listaAnimales = new ListaSimple();
        ListaCircular ronda = new ListaCircular();

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "1. Registrar animal\n" +
                "2. Listar animales\n" +
                "3. Historial médico\n" +
                "4. Ronda diaria\n" +
                "0. Salir"
            ));

            switch (opcion) {

                case 1:
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    String tratamiento = JOptionPane.showInputDialog("Tratamiento:");

                    listaAnimales.insertar(new Animal(nombre, edad, tratamiento));
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, listaAnimales.listar());
                    break;

                case 3:
                    String buscar = JOptionPane.showInputDialog("Nombre del animal:");
                    Animal a = listaAnimales.buscar(buscar);

                    if (a != null) {
                        String tipo = JOptionPane.showInputDialog("Tipo:");
                        String fecha = JOptionPane.showInputDialog("Fecha:");
                        String obs = JOptionPane.showInputDialog("Observación:");

                        a.historial.agregar(new Tratamiento(tipo, fecha, obs));

                        JOptionPane.showMessageDialog(null, a.historial.listar());
                    }
                    break;

                case 4:
                    String nombreRonda = JOptionPane.showInputDialog("Animal para ronda:");
                    Animal ar = listaAnimales.buscar(nombreRonda);

                    if (ar != null) {
                        ronda.insertar(ar);
                        JOptionPane.showMessageDialog(null, ronda.recorrerAdelante());
                    }
                    break;
            }

        } while (opcion != 0);
    }
}