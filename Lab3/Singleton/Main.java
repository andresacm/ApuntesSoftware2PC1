/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3.Singleton;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia de DatabaseConnector y conectar a la base de datos
        DatabaseConnector connector1 = DatabaseConnector.getInstance();
        // Crear otra instancia de DatabaseConnector y conectar a la base de datos nuevamente
        DatabaseConnector connector2 = DatabaseConnector.getInstance();
    }
}

