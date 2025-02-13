/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.pruebafinciclo.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class GestorProducto {
    private List  Productos;
    
    public  GestorProducto(){
        this.Productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto){
        Producto.add(producto);
    }
    
    public List Producto listarProductos(){
        return Producto;
    }
}
