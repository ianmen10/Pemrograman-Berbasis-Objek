class Anjing extends Mamalia { // Anjing mewarisi dari Mamalia
    private String ras;

    public Anjing(String nama, int umur, String ras) {
        super(nama, umur); // Memanggil konstruktor Mamalia
        this.ras = ras;
        System.out.println("Konstruktor Anjing dipanggil");
    }
    
    void menggonggong() {
        System.out.println(nama + " menggonggong: Guk Guk!");
    }
    
    public String getRas() {
        return ras;
    }
}