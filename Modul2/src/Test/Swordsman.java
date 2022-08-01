package Test;

public class Swordsman {
    protected String unitName = "Swordsman";
    protected int unitNumber;

    Swordsman(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public void display() {
        System.out.println("Unit Number " + this.unitNumber + " is a " + unitName);
    }
}
