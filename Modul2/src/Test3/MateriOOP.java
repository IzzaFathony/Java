package Test3;

public class MateriOOP {
    public static void main(String[] args) {
        Converter converter = new Converter();
        int[] doll = new int[3];

        doll[0] = 10;
        doll[1] = converter.getDollInRing(68);
        doll[2] = converter.getDollInYen(1620);

        converter.printDollInRup(doll[0]);
        converter.printDollInRing(doll[0]);
        converter.printDollInYen(doll[0]);
    }
}
