/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity3;

/**
 *
 * @author izzai
 */
public class Mage extends Hero implements MagicalDamage {
    public Mage(int level) {
        super.setStat(2500 + (level * 85), 700 + (level * 35), 200 + (level * 10), magicDamageBonus);
    }

    public void spawnIntro() {
        if (super.getLifeStatus() == true) {
            System.out.println("'I can kill without touching you'");
        } else {
            System.out.println("'Mage is dead'");
        }
    }
}
