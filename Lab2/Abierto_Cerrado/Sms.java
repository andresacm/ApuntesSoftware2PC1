/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.Abierto_Cerrado;

/**
 *
 * @author PC
 */
public class Sms implements CanalDeComunicacion{
    public void enviarMensaje(String contenido){
        System.out.println("Enviar mensaje: " + contenido);
    }
}
