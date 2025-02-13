/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.pruebafinciclo.controlador;

import ec.edu.espoch.pruebafinciclo.modelo.GestorProducto;
import ec.edu.espoch.pruebafinciclo.modelo.Producto;

/**
 *
 * @author PERSONAL
 */
public class Controlador {
    
    private GestorProducto modelo;
    private Producto producto;

    public Controlador(GestorProducto modelo, Producto producto) {
        this.modelo = modelo;
        this.producto = producto;
    }
    
    public void iniciar() {
        boolean running = true;
        while (running) {
            producto.mostrarMenu();
            int opcion = producto.leerOpcion();
            switch (opcion) {
                case 1:
                    Producto nuevoProducto = producto.leerProducto();
                    modelo.agregarProducto(nuevoProducto);
                    break;
                case 2:
                    producto.mostrarProducto(modelo.listarProducto());
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
}

    

