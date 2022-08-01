package Test;

public class Archer {
    protected String unitName = "Archer";
    protected int unitNumber;

    Archer(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public void display() {
        System.out.println("Unit Number " + this.unitNumber + " is a " + unitName);
    }
}
