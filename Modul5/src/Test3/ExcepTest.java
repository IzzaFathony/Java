/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test3;

/**
 *
 * @author izzai
 */
public class ExcepTest {
    public static void main(String[] args) {
        int a[] = new int[2];
        
        try {
//            System.out.println("Access element three : " + a[1]);
            System.out.println("Access element three : " + a[3]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value : " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
