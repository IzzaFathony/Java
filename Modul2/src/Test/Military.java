package Test;

public class Military {
    public static void main(String[] args) {
        int i = 0, numOfMiliter = 0;

        Swordsman[] swordsman = new Swordsman[3];
        Archer[] archer = new Archer[3];
        Cavalry[] cavalry = new Cavalry[3];

        for (i = 0; i < 3; i++) {
            swordsman[i] = new Swordsman(++numOfMiliter);
        }

        for (i = 0; i < 3; i++) {
            archer[i] = new Archer(++numOfMiliter);
        }

        for (i = 0; i < 3; i++) {
            cavalry[i] = new Cavalry(++numOfMiliter);
        }

        for (i = 0; i < 3; i++) {
            swordsman[i].display();
        }
        for (i = 0; i < 3; i++) {
            archer[i].display();
        }
        for (i = 0; i < 3; i++) {
            cavalry[i].display();
        }

        // swordsman[i].unitName = "Tukang Pedang";
    }
}
