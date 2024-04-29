/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3.FactoryMethod;

/**
 *
 * @author PC
 */
public abstract class Tienda {
    
    public abstract Producto crearProducto(String nombre, double precio, double costoEnvio);
    
}

