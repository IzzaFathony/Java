/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;

/**
 *
 * @author izzai
 */
public class DinasPertanahan {
    private String[] alamat = new String[3];
    private int[] panjangTanah = new int[3];
    private int[] luasTanah = new int[3];
    
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
