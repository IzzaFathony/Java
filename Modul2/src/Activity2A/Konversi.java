/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2A;

/**
 *
 * @author izzai
 */
public class Konversi {
    public int getBulanInDetik(int bulan) {
        return (bulan * 2629800);
    }

    public int getBulanInMenit(int bulan) {
        return (bulan * 43830);
    }

    public int getBulanInJam(int bulan) {
        // return (bulan * 730.5);
        return (bulan * 730);
    }

    public int getBulanInHari(int bulan) {
        // return (bulan * 30.4375);
        return (bulan * 30);
    }

    public void printBulanInDetik(int bulan) {
        System.out.println(bulan + " Bulan setara dengan " + this.getBulanInDetik(bulan) + " Detik");
    }

    public void printBulanInMenit(int bulan) {
        System.out.println(bulan + " Bulan setara dengan " + this.getBulanInMenit(bulan) + " Menit");
    }

    public void printBulanInJam(int bulan) {
        System.out.println(bulan + " Bulan setara dengan " + this.getBulanInJam(bulan) + " Jam");
    }

    public void printBulanInHari(int bulan) {
        System.out.println(bulan + " Bulan setara dengan " + this.getBulanInHari(bulan) + " Hari");
    }

    public static void main(String[] args) throws Exception {
        Konversi konversi = new Konversi();

        int bulan = 2;

        konversi.printBulanInDetik(bulan);
        konversi.printBulanInMenit(bulan);
        konversi.printBulanInJam(bulan);
        konversi.printBulanInHari(bulan);
    }
}
