public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    // Method menghitung harga jual setelah diskon
    public int hitungHargaJual() {
        return hargaDasar - (int)(diskon * hargaDasar);
    }

    // Method menampilkan data barang
    public void tampilData() {
        System.out.println("=== DATA BARANG ===");
        System.out.println("Kode Barang   : " + kode);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Dasar   : Rp " + hargaDasar);
        System.out.println("Diskon        : " + (diskon * 100) + "%");
        System.out.println("Harga Jual    : Rp " + hitungHargaJual());
    }
}
