/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;

/**
 *
 * @author izzai
 */
class Bola extends BangunRuang {
    double diameter, jari;

    void setBola(double diameter, double jari) {
        this.diameter = diameter;
        this.jari = jari;
    }

    double getLuasPermukaan() {
        return (4 * (getPhi(jari)) * jari * jari);
    }

    double getVolume() {
        return ((4 / 3) * (getPhi(jari)) * jari * jari * jari);
    }
}
