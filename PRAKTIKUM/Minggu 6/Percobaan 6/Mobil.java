class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    void jalankan() { // Wajib implementasi abstract method
        System.out.println("Mobil " + merk + " berjalan dengan 4 roda...");
    }

    @Override
    void info() { // Overriding method info()
        super.info(); // Memanggil info() dari Kendaraan
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}