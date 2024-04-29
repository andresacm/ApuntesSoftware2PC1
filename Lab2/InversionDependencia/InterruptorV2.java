/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.InversionDependencia;

/**
 *
 * @author PC
 */
public class InterruptorV2 {
    
    private DispositivoElectronico dispositivo;
    
    public InterruptorV2(DispositivoElectronico dispositivo) {
    this.dispositivo = dispositivo;
    }
    public void presionarInterruptor() {
        dispositivo.encender();

    }   

}