class Mamalia extends Hewan {
    public Mamalia(String nama, int umur) {
        super(nama, umur);
        System.out.println("Konstruktor Mamalia dipanggil");
    }

    void menyusui() {
        System.out.println("Menyusui anaknya...");
    }
}