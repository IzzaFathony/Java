/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;

/**
 *
 * @author izzai
 */
abstract class BangunRuang {
    double getPhi(double jari) {
        if (jari % 7 == 0) {
            return 22 / 7;
        } else {
            return 3.14;
        }
    }

    abstract double getLuasPermukaan();

    abstract double getVolume();
}