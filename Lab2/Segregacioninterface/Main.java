/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.Segregacioninterface;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Trabajador humano = new HumanoV1();
        humano.trabajar();
        humano.comer();
        humano.descansar();
        humano.reunirse();
        Trabajador robot = new RobotV1();
        robot.trabajar();
        //robot.comer(); // Esto lanzará una excepción, ya que los robots no pueden comer
        System.out.println("");
        HumanoTrabajador humano2 = new HumanoV2();
        humano2.trabajar();
        humano2.comer();
        humano2.descansar();
        humano2.reunirse();
        RobotTrabajador robot2 = new RobotV2();
        robot2.trabajar();
    }
}
