/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.Abierto_Cerrado;

/**
 *
 * @author PC
 */
public class GestorDeMensajesV1 {
    public void enviarMensaje(String tipo, String contenido) {
        if (tipo.equalsIgnoreCase("correo")) {
            enviarCorreo(contenido);
        } else if (tipo.equalsIgnoreCase("sms")) {
            enviarSMS(contenido);
        }
    }
    private void enviarCorreo(String contenido) {
        System.out.println("Enviando correo V1: " + contenido);
    }
    private void enviarSMS(String contenido) {
        System.out.println("Enviando SMS V1: " + contenido);
    }
}
