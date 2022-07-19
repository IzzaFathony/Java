/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity1B;

/**
 *
 * @author izzai
 */
class Aquascape {
    int Size = 30;
    String Theme = "Random";

    void shopName() {
        System.out.println("===MOZZA AQUASCAPE===");
    }
}

class Dutch extends Aquascape {
    public static void main(String[] args) {
        Dutch dutch = new Dutch();
        // dutch.Size = 40;
        // dutch.Theme = "Dutch";
        dutch.shopName();
        System.out.println("Aquascape bertema " + dutch.Theme + " dengan ukuran " + dutch.Size + "cm");
    }
}

class Iwagumi extends Aquascape {
    public static void main(String[] args) {
        Aquascape aquascape = new Aquascape();
        aquascape.Size = 50;
        aquascape.Theme = "Iwagumi";
        aquascape.shopName();
        System.out.println("Aquascape bertema " + aquascape.Theme + " dengan ukuran " + aquascape.Size + "cm");
    }
}

class Natural extends Aquascape {
    public static void main(String[] args) {
        Aquascape aquascape = new Aquascape();
        aquascape.Size = 60;
        aquascape.Theme = "Natural";
        aquascape.shopName();
        System.out.println("Aquascape bertema " + aquascape.Theme + " dengan ukuran " + aquascape.Size + "cm");
    }
}