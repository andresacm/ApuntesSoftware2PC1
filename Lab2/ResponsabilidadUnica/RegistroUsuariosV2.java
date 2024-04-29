/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.ResponsabilidadUnica;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author PC
 */
public class RegistroUsuariosV2 {
    private String nombre;
    private String contraseña;
    
    public RegistroUsuariosV2(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    public void registrarUsuario() {
        Encriptador encriptador = new Encriptador();
        encriptador.encriptarContraseña(contraseña);
    }

}