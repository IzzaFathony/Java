/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

/**
 *
 * @author izzai
 */

// EXCEPTION HANDLER

public class ExcepTest {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
//            System.out.println("Access element three : " + a[1]);
            System.out.println("Access element three : " + a[3]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }
        
        System.out.println("Out of the block");
    }
}
