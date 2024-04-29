/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Siglenton;

/**
 *
 * @author PC
 */
public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1,s2,s3;
        s1 = Singleton.instancia();
        s2 = Singleton.instancia();
        s3 = Singleton.instancia();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
