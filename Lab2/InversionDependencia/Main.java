/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.InversionDependencia;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        
        InterruptorV1 interruptor = new InterruptorV1();
        interruptor.presionarInterruptor(); // Enciende la lámpara directamente
        
        DispositivoElectronico lamparaV2 = new LamparaV2();
        
        InterruptorV2 interruptorLampara = new InterruptorV2(lamparaV2);
        
        interruptorLampara.presionarInterruptor();
        
    }
}
