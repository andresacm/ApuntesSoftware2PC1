/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3.Singleton;

/**
 *
 * @author PC
 */
import java.sql.Connection;
public class DatabaseConnector {
    
    private static DatabaseConnector Instancia;    
    private Connection connection;
    
    private DatabaseConnector() {
        // Lógica de conexión a la base de datos
        try {
            System.out.println("Database connected");
        } catch (Error e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    public static DatabaseConnector getInstance(){
        if (Instancia == null) {
            Instancia = new DatabaseConnector();
        }
        
        return Instancia;
    }
}
