class Motor extends Kendaraan {
    int kapasitasCC;

    public Motor(String merk, int tahunProduksi, int kapasitasCC) {
        super(merk, tahunProduksi);
        this.kapasitasCC = kapasitasCC;
    }

    @Override
    void jalankan() { // Wajib implementasi abstract method
        System.out.println("Motor " + merk + " berjalan dengan dua roda dan mesin " + kapasitasCC + " CC...");
    }

    @Override
    void info() { // Overriding method info()
        super.info(); // Memanggil info() dari Kendaraan
        System.out.println("Kapasitas CC: " + kapasitasCC);
    }
}