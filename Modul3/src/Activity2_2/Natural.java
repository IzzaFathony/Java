package Activity2_2;

import Activity2.Aquascape;

public class Natural extends Aquascape {
    public Natural() {
        super(40, "Natural");
    }

    public void print() {
        System.out.println("Aquascape Bertema " + super.getTheme() + " dengan ukuran " + super.getSize() + "cm");
    }
}
