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
public class Grade {
    private int nilaiProgdas, nilaiKalkulus, nilaiOrkom;
    private double hasil;
    
    public void setNilaiProgdas(int nilaiProgdas) {
        this.nilaiProgdas = nilaiProgdas;
    }
    
    public int getNilaiProgdas() {
        return nilaiProgdas;
    }
    
    public void setNilaiKalkulus(int nilaiKalkulus) {
        this.nilaiKalkulus = nilaiKalkulus;
    }
    
    public int getNilaiKalkulus() {
        return nilaiKalkulus;
    }
    
    public void setNilaiOrkom(int nilaiOrkom) {
        this.nilaiOrkom = nilaiOrkom;
    }
    
    public int getNilaiOrkom() {
        return nilaiOrkom;
    }
    
    public double hitungRata() {
        this.hasil = (getNilaiProgdas() + getNilaiKalkulus() + getNilaiOrkom()) / 3;
        return hasil;
    }
    
    public void cekNilai() {
        System.out.println("\nNilai Anda : ");
        System.out.println("Progdas\t\t: " + getNilaiProgdas());
        System.out.println("Kalkulus\t: " + getNilaiKalkulus());
        System.out.println("Orkom\t\t: " + getNilaiOrkom());
        
        System.out.println("Rata-rata\t: " + hitungRata());
        if(hitungRata() > 70) {
            System.out.println("Status\t\t: LULUS");
        } else {
            System.out.println("Status\t\t: GAGAL");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Grade grade = new Grade();
        
        int nilaiProgdas, nilaiKalkulus, nilaiOrkom;
        double hasil;
        
        System.out.print("Nilai Progdas\t: ");
        nilaiProgdas = input.nextInt();
        
        System.out.print("Nilai Kalkulus\t: ");
        nilaiKalkulus = input.nextInt();
        
        System.out.print("Nilai Orkom\t: ");
        nilaiOrkom = input.nextInt();
        
        grade.setNilaiProgdas(nilaiProgdas);
        grade.setNilaiKalkulus(nilaiKalkulus);
        grade.setNilaiOrkom(nilaiOrkom);
        
        grade.cekNilai();
    }
}
