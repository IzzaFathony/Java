/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;

import java.io.IOException;
import java.io.*;
import java.util.*;

/**
 *
 * @author izzai
 */
public class Main {
    public static void main(String[] args) throws InputMismatchException, IOException {
        int inputLoop = 0;
        int index = 0;
        int number = 1;

        DinasPertanahan dinas = new DinasPertanahan();
        Scanner input = new Scanner(System.in);
        FileWriter writeFile = new FileWriter("input.txt");
        FileReader readFile = new FileReader("C:\\code\\Java\\Modul5\\input.txt");
        BufferedReader output = new BufferedReader(readFile);
        String writeOutput = output.readLine();

        do {
            try {
                String alamat = "";
                String panjangTanah, luasTanah;

                int dataPanjang = 0;
                int dataLuas = 0;
                System.out.println("Data ke - " + index);

                if ("".equals(alamat)) {
                    System.out.print("Input Alamat\t\t: ");
                    alamat = input.nextLine();
                    dinas.setAlamat(alamat, index);
                }
                if (dataPanjang == 0) {
                    System.out.print("Input Panjang Tanah\t: ");
                    panjangTanah = input.nextLine();
                    dataPanjang = Integer.parseInt(panjangTanah);
                }
                if (dataLuas == 0) {
                    System.out.print("Input Luas Tanah\t: ");
                    luasTanah = input.nextLine();
                    dataLuas = Integer.parseInt(luasTanah);
                }

                inputLoop = 0;
                dinas.setPanjangTanah(dataPanjang, index);
                dinas.setLuasTanah(dataLuas, index);
                index++;
            } catch (InputMismatchException e) {
                System.out.println("Inputkan Panjang dan Luas dengan tipe data angka / integer !");
                ++inputLoop;
                input.next();
                index = 0;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nData inputan melebihi kapasitas");
                break;
            } finally {
                System.out.println("Hati-hati saat menginputkan data agar tidak terjadi kesalahan");
            }
        } while (inputLoop >= 1 || index < 3);

        for (int indexOuput = 0; indexOuput < index; indexOuput++) {

            writeFile.write("Data ke - " + number + "\n\nAlamat : " + dinas.getAlamat(indexOuput)
                    + "\nPanjang Tanah : "
                    + dinas.getPanjangTanah(indexOuput) + "\nLuas Tanah: " + dinas.getLuasTanah(indexOuput) + "\n\n");
            ++number;
        }

        writeFile.close();
        System.out.println("Data Berhasil Di inputkan ke dalam File");

        System.out.println("\n\nMembaca File");
        for (int indexOuput = 0; indexOuput < 19; indexOuput++) {
            System.out.println(writeOutput);
            writeOutput = output.readLine();
        }

    }
}
