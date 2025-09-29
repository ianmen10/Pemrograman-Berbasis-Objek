public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pj = new Peminjaman();
        pj.id = "P001";
        pj.namaMember = "Ilham Atmaja";
        pj.namaGame = "FIFA 24";
        pj.harga = 20000;
        pj.lamaSewa = 3;
        pj.tampilData();
    }
}
