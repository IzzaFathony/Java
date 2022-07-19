/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

/**
 *
 * @author izzai
 */
public class Main {
    public static void main(String[] args) {
        Moveable m = new Tank();
        Fireable f = new Pistol();
        
        m.move();
        f.shot();
        f = (Fireable) m;
        f.shot();
    }
}
