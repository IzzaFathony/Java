/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;

/**
 *
 * @author izzai
 */
public class Aquascape {
    private int Size;
    private String Theme;

    protected Aquascape(int size, String theme) {
        this.Size = size;
        this.Theme = theme;
    }

    protected Aquascape() {
        this.Size = 30;
        this.Theme = "Random";
    }

    protected int getSize() {
        return Size;
    }

    protected String getTheme() {
        return Theme;
    }

    protected void shopName() {
        System.out.println("===Mozza Aquascape===");
    }
}
