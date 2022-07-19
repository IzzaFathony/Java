/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;

/**
 *
 * @author izzai
 */
public class Geekvape extends Device {
    public void setGeekvape(String name, int maxWatt) {
        this.name = name;
        this.maxWatt = maxWatt;
    } 
    
    public void printGeekvape() {
        System.out.println("Mod\t\t: " + name + "\nMax Watt\t: " + maxWatt + "W");
        
        Atomizer atomizer = new Atomizer();
        atomizer.printAtomizer("Alexa", "Single");
    }
}
