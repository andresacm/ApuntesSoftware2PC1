/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.InversionDependencia;

/**
 *
 * @author PC
 */
public class InterruptorV1 {
    private LamparaV1 lampara;
    public InterruptorV1() {
    this.lampara = new LamparaV1();
    }
    public void presionarInterruptor() {
        lampara.encender();

    }   

}