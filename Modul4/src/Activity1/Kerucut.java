/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;

/**
 *
 * @author izzai
 */
class Kerucut extends BangunRuang {
    double jari, sisi, tinggi;

    void setKerucut(double jari, double sisi, double tinggi) {
        this.jari = jari;
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    double getLuasPermukaan() {
        return ((getPhi(jari)) * jari * (jari + sisi));
    }

    double getVolume() {
        return (0.3 * (getPhi(jari)) * jari * jari * tinggi);
    }
}
