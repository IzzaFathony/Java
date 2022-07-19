package KeywordSuper;

public class Super {
    public static void main(String[] args) {
        KelilingPersegi persegi = new KelilingPersegi();
        int[] sisi = new int[1];

        sisi[0] = 10;

        persegi.printLuas(sisi[0]);
        persegi.printKeliling(sisi[0]);
        persegi.printLuasPersegi(sisi[0]);
    }
}
