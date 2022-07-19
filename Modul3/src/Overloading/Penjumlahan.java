/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author izzai
 */
class Penjumlahan {
    public void jumlah(int a, int b) {
        System.out.println("int a + int b : " + (a + b));
    }
    
    public void jumlah(double a, int b) {
        System.out.println("double a + int b : " + (a + b));
    }
    
    public void jumlah(int a, double b) {
        System.out.println("int a + double b : " + (a + b));
    }
    
    public void jumlah(double a, double b) {
        System.out.println("double a + double b : " + (a + b));
    }
}
