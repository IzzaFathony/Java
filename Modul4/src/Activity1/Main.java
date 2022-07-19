/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;

/**
 *
 * @author izzai
 */
class Main {
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setBola(14, 7);
        System.out.println("Hasil Permukaan Luas Bola : " + bola.getLuasPermukaan());
        System.out.println("Hasil Volume Bola : " + bola.getVolume());

        System.out.println("============================================================");

        Kerucut kerucut = new Kerucut();
        kerucut.setKerucut(7, 10, 12);
        System.out.println("Hasil Permukaan Luas Kerucut : " + kerucut.getLuasPermukaan());
        System.out.println("Hasil Volume Kerucut : " + kerucut.getVolume());
    }
}
