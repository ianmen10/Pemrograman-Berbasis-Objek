public class Peminjaman {
    String id;
    String namaMember;
    String namaGame;
    int harga;
    int lamaSewa;

    // Method menampilkan data peminjaman
    public void tampilData() {
        System.out.println("=== DATA PEMINJAMAN ===");
        System.out.println("ID          : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga Sewa  : Rp " + harga);
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");
        System.out.println("Total Bayar : Rp " + hitungTotal());
    }

    // Method menghitung total biaya sewa
    public int hitungTotal() {
        return lamaSewa * harga;
    }
}
