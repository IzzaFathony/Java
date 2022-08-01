/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2B;

/**
 *
 * @author izzai
 */

import java.util.Scanner;

public class Rhombus {
    public int getKeliling(int sisi) {
        return (sisi * 4);
    }

    public double getLuas(int diagonal1, int diagonal2) {
        return (0.5 * diagonal1 * diagonal2);
    }

    public void printKeliling(int sisi) {
        System.out.println("Keliling Belah Ketupat dengan panjang sisi " + sisi + " adalah " + this.getKeliling(sisi));
    }

    public void printLuas(int diagonal1, int diagonal2) {
        System.out.println("Luas Belah Ketupat dengan D1 = " + diagonal1 + ", dan D2 = " + diagonal2 + " adalah "
                + this.getLuas(diagonal1, diagonal2));
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Rhombus rhombus = new Rhombus();

        System.out.println("MENU");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        System.out.println("3. Keluar");
        System.out.print("Pilih Menu : ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Sisi : ");
                rhombus.printKeliling(input.nextInt());
                break;
            case 2:
                System.out.print("Diagonal 1 : ");
                int diagonal1 = input.nextInt();
                System.out.print("Diagonal 2 : ");
                int diagonal2 = input.nextInt();
                rhombus.printLuas(diagonal1, diagonal2);
                break;
            default:
                break;
        }
    }
}
