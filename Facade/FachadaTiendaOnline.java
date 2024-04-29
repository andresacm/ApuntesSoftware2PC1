/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author PC
 */
public class FachadaTiendaOnline {

    private GestionUsuarios gestionusuarios;
    private GestionProductos gestionproductos;
    private GestionOrdenes gestionordenes;

    public FachadaTiendaOnline() {
        this.gestionusuarios = new GestionUsuarios();
        this.gestionproductos = new GestionProductos();
        this.gestionordenes = new GestionOrdenes();
    }

    public void completarOrden(String username, String email, String nombreproducto, double precio) {
        // Utilizando los subsistemas para completar el pedido
        gestionusuarios.crearUsuario(username, email);
        gestionproductos.crearProducto(nombreproducto, precio);

        // Aquí podríamos agregar más lógica de negocio, como verificar el stock del producto, calcular el total, etc.
        gestionordenes.crearOrden(1, 1);
    }
}