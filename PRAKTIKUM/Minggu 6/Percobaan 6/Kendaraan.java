abstract class Kendaraan {
    String merk;
    int tahunProduksi;

    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    // Abstract method: harus diimplementasikan oleh subclass
    abstract void jalankan(); 

    void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun produksi: " + tahunProduksi);
    }
}