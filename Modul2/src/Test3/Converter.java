package Test3;

public class Converter {
    public int getDollInRup(int doll) {
        return (doll * 1436690);
    }

    public int getDollInRing(int doll) {
        return (doll * 419);
    }

    public int getDollInYen(int doll) {
        return (doll * 11500);
    }

    public void printDollInRup(int doll) {
        System.out.println(doll + " Dollar setara dengan " + this.getDollInRup(doll) + " Rupiah");
    }

    public void printDollInRing(int doll) {
        System.out.println(doll + " Dollar setara dengan " + this.getDollInRing(doll) + " Ringgit");
    }

    public void printDollInYen(int doll) {
        System.out.println(doll + " Dollar setara dengan " + this.getDollInYen(doll) + " Yen");
    }
}
