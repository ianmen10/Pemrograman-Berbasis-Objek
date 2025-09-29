class Truk extends Kendaraan {
    int jumlahRoda; // Atribut spesifik Truk

    public Truk(String merk, int tahunProduksi, int jumlahRoda) {
        super(merk, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    void jalankan() { // Wajib implementasi abstract method
        System.out.println("Truk " + merk + " berjalan dengan " + jumlahRoda + " roda...");
    }

    @Override
    void info() { // Overriding method info()
        super.info(); // Memanggil info() dari Kendaraan
        System.out.println("Jumlah roda: " + jumlahRoda);
    }
}