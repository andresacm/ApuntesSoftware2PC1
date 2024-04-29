/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        FachadaTiendaOnline fachada = new FachadaTiendaOnline();
        fachada.completarOrden("ander", "andersonachata@gmail.com", "ps5", 5000);
    }
}
