/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Siglenton;

/**
 *
 * @author PC
 */
public class Singleton {
    static private Singleton unicaInstancia;
    private Singleton(){}
    
    public static Singleton instancia(){
        if (unicaInstancia == null) {
            unicaInstancia = new Singleton();
        }
        
        return unicaInstancia;
    }
}
