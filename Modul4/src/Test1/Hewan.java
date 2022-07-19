/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

/**
 *
 * @author izzai
 */
abstract class Hewan {
    abstract void setNama();
    abstract void setMakanan();
}

class Kucing extends Hewan {
    @Override
    void setNama() {
        System.out.println("Nama Hewan adalah Kucing");
    }
    
    @Override
    void setMakanan() {
        System.out.println("Makanan Kucing adalah Ikan");
    }
    
    void setWarna() {
        System.out.println("Warna Putih");
    }
}

class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.setNama();
        kucing.setMakanan();
        kucing.setWarna();
    }
}
