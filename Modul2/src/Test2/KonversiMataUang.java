package Test2;

public class KonversiMataUang {
    public static void main(String[] args) {
        int dollar = 2;
        double rupiah;
        double ringgit;
        double yen;

        rupiah = dollar * 14.36690;
        ringgit = dollar * 4.19;
        yen = dollar * 115.00;

        System.out.println("Hasil Konversi Mata Uang");
        System.out.println(dollar + " Dollar = " + rupiah + " Rupiah");
        System.out.println(dollar + " Dollar = " + ringgit + " Ringgit");
        System.out.println(dollar + " Dollar = " + yen + " Yen");
    }
}
