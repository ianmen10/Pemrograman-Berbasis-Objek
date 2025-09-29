class Kucing extends Hewan {
    private String ras; // Atribut tambahan untuk subclass

    // Konstruktor untuk Tugas Praktikum
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur); // WAJIB menjadi pernyataan pertama: memanggil konstruktor Hewan
        this.ras = ras;
        System.out.println("Konstruktor Kucing (dengan ras) dipanggil");
    }
    
    // Konstruktor asli Percobaan 3 (tanpa ras)
    public Kucing(String nama, int umur) {
        super(nama, umur); 
        System.out.println("Konstruktor Kucing (standar) dipanggil");
    }
    
    // Getter untuk ras (karena ras dibuat private, meskipun di soal tidak disebutkan)
    public String getRas() {
        return this.ras;
    }
}