package KeywordSuper;

class KelilingPersegi extends LuasPersegi {
    public int keliling(int sisi) {
        return (sisi * 4);
    }

    public void printKeliling(int sisi) {
        System.out.println("Keliling persegi adalah : " + this.keliling(sisi));
    }

    public void printLuasPersegi(int sisi) {
        System.out.println("Luas persegi adalah : " + super.luas(sisi));
    }
}
