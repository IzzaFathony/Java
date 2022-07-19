/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;

import java.util.Scanner;

/**
 *
 * @author izzai
 */
public class Main {
    public static void main(String[] args) {
        int startArray = 0;
        int maxArray = 2;
        DinasPertanahan dinas = new DinasPertanahan(2);
        // String alamat = new String[maxArray];
        // int panjangTanah = new int[maxArray];
        // int luasTanah = new int[maxArray];

        do {
            Scanner input = new Scanner(System.in);

            System.out.print("Input Alamat : ");
            String alamat = input.nextLine();
            dinas.setAlamat(alamat, startArray);

            System.out.print("Input Panjang Tanah : ");
            int panjangTanah = input.nextInt();
            dinas.setPanjangTanah(panjangTanah, startArray);

            System.out.print("Input Luas Tanah : ");
            int luasTanah = input.nextInt();
            dinas.setLuasTanah(luasTanah, startArray);
            startArray++;
        } while (startArray < maxArray);

        for (int i = 0; i < maxArray; i++) {
            System.out.println("Alamat\t\t: " + dinas.getAlamat(i));
            System.out.println("Panjang Tanah\t: " + dinas.getPanjangTanah(i));
            System.out.println("Luas Tanah\t: " + dinas.getLuasTanah(i));
        }
    }
}
