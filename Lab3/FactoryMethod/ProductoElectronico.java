/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3.FactoryMethod;

/**
 *
 * @author PC
 */
public class ProductoElectronico implements Producto {
        private String nombre;
    private double precio;
    private double costoEnvio;

    public ProductoElectronico(String nombre, double precio, double costoEnvio) {
        this.nombre = nombre;
        this.precio = precio;
        this.costoEnvio = costoEnvio;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public double calcularEnvio() {
        return costoEnvio;
    }
    
}
