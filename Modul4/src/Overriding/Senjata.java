/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author izzai
 */
class Senjata {
    String cekSenjata() {
        return "Output dari Class Senjata";
    }
}

class Pistol extends Senjata {
    @Override
    String cekSenjata() {
        return "Output dari class Pistol";
    }
}

class BelajarOverriding {
    public static void main(String[] args) {

        Senjata senjata = new Senjata();
        System.out.println(senjata.cekSenjata());
    }
}