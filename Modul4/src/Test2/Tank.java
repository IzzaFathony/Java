/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

/**
 *
 * @author izzai
 */
public class Tank implements Fireable, Moveable {
    @Override
    public void shot() {
        System.out.println("Tank menembak");
    }
    
    @Override
    public void move() {
        System.out.println("Tank bergerak");
    }
}
