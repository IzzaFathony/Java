package Test;

public class Cavalry {
    protected String unitName = "Cavalry";
    protected int unitNumber;

    Cavalry(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public void display() {
        System.out.println("Unit Number " + this.unitNumber + " is a " + unitName);
    }
}
