/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity3;

/**
 *
 * @author izzai
 */
public class Tank extends Hero {
    public Tank(int level) {
        super.setStat(7000 + (level * 200), 500 + (level * 20), 500 + (level * 15), 0);
    }

    public void spawnIntro() {
        if (super.getLifeStatus() == true) {
            System.out.println("'Think you can break through my defenses?'");
        } else {
            System.out.println("'Tank is dead'");
        }
    }
}
