/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.Segregacioninterface;

/**
 *
 * @author PC
 */
public class RobotV1 implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("Trabajando...");
    }
    @Override
    public void comer() {
        // Los robots no necesitan comer, pero deben implementar este método debido a la interfaz
        throw new UnsupportedOperationException("Los robots no necesitan comer");
    }
    @Override
    public void descansar() {
        // Los robots no necesitan descansar, pero deben implementar estemétodo debido a la interfaz
        throw new UnsupportedOperationException("Los robots no necesitan descansar");
    }
    @Override
    public void reunirse() {
        // Los robots no necesitan reunirse, pero deben implementar este método debido a la interfaz
        throw new UnsupportedOperationException("Los robots no necesitan reunirse");
    }
}

