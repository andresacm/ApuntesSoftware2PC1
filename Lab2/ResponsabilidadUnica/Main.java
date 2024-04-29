/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.ResponsabilidadUnica;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        RegistroUsuariosV1 registro1 = new RegistroUsuariosV1("ander","contraseña123");
        registro1.registrarUsuario();
        
        RegistroUsuariosV2 registro2 = new RegistroUsuariosV2("ander","contraseña123");
        registro1.registrarUsuario();
    }
}

