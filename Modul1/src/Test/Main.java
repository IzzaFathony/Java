/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author izzai
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Memanggil Class User
        User user1 = new User();

        user1.setUsername("Izza");
        user1.setPassword("12345");

        System.out.println("Username : " + user1.getUsername());
        System.out.println("Password : " + user1.getPassword());
    }
}
