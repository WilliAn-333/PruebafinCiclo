/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.pruebafinciclo.modelo;

/**
 *
 * @author USER
 */
public class Producto {
    private int id;
    private String Nombre;
    private double Precio;
    private boolean Disponible;

    public Producto(int id, String Nombre, double Precio, boolean Disponible) {
        this.id = id;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Disponible = Disponible;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public boolean isDisponible() {
        return Disponible;
    }
    
    
    
}
