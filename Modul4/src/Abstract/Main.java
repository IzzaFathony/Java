/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author izzai
 */
public abstract class Main {
    private String name;
    private String gender;

    public Main(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Name" + this.name + "::Gender" + this.gender;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

}