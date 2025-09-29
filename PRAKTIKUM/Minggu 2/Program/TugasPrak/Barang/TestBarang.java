public class TestBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "B001";
        brg.namaBarang = "Headset Gaming";
        brg.hargaDasar = 500000;
        brg.diskon = 0.2f;

        brg.tampilData();
    }
}
