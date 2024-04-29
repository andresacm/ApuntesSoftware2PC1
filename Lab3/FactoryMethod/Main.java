/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3.FactoryMethod;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la tienda
        Tienda tienda = new TiendaElectronica();
        
        Producto ProductoElectronico = tienda.crearProducto("Iphone", 4000, 100);
        mostrarDetallesProducto(ProductoElectronico);
    }
    // Método para mostrar los detalles de un producto
    public static void mostrarDetallesProducto(Producto producto) {
        System.out.println("Nombre: " + producto.obtenerNombre());
        System.out.println("Precio: $" + producto.obtenerPrecio());
        System.out.println("Costo de envío: $" + producto.calcularEnvio());
    }
}