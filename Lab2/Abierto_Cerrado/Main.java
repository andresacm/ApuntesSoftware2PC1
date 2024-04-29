/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.Abierto_Cerrado;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        GestorDeMensajesV1 gestorV1 = new GestorDeMensajesV1();
        gestorV1.enviarMensaje("correo", "¡Hola, esto es un correo!");
        gestorV1.enviarMensaje("sms", "¡Hola, esto es un SMS!");
        
        GestorDeMensajesV2 gestorV2 = new GestorDeMensajesV2();
        Correo C1 = new Correo();
        Sms S1 = new Sms();
        
        
        gestorV2.enviarMensaje(C1, "RAAAAAAA");
        gestorV2.enviarMensaje(S1, "KKKKKKKK");
        
    }
}
