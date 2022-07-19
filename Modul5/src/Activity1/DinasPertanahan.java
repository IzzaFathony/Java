/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1;

/**
 *
 * @author izzai
 */
public class DinasPertanahan {
    private String [] alamat;
    private int [] panjangTanah, luasTanah;
    
    DinasPertanahan(int index) {
        this.alamat = new String[index];
        this.panjangTanah = new int[index];
        this.luasTanah = new int[index];
    }

    String getAlamat(int index) {
        return alamat[index];
    }

    void setAlamat(String alamat, int index) {
        this.alamat[index] = alamat;
    }

    int getPanjangTanah(int index) {
        return panjangTanah[index];
    }

    void setPanjangTanah(int panjangTanah, int index) {
        this.panjangTanah[index] = panjangTanah;
    }

    int getLuasTanah(int index) {
        return luasTanah[index];
    }

    void setLuasTanah(int luasTanah, int index) {
        this.luasTanah[index] = luasTanah;
    }
}
