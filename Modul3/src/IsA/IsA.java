/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IsA;

/**
 *
 * @author izzai
 */
public class IsA {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.tampilNama();
        
        Child c = new Child();
        c.tampilNama();
        c.tampilKecepatan();
    }
}
