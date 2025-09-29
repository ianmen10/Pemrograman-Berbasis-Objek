public class Main {
    public static void main(String[] args) {
        // Buat objek perpustakaan
        Perpustakaan perpustakaanKu = new Perpustakaan("Perpustakaan Kota");

        // Tambahkan anggota
        Anggota a1 = new Anggota("001", "Budi Santoso");
        Anggota a2 = new Anggota("002", "Siti Aminah");
        perpustakaanKu.tambahAnggota(a1);
        perpustakaanKu.tambahAnggota(a2);

        // Tambahkan buku
        Buku b1 = new Buku("B001", "Dasar-Dasar Pemrograman");
        Buku b2 = new Buku("B002", "Struktur Data");
        perpustakaanKu.tambahBuku(b1);
        perpustakaanKu.tambahBuku(b2);

        // Lakukan peminjaman
        perpustakaanKu.pinjamBuku(a1, b1);
        perpustakaanKu.pinjamBuku(a2, b2);

        // Tampilkan informasi perpustakaan
        System.out.println("\n--- Informasi Perpustakaan ---");
        System.out.println(perpustakaanKu.info());
    }
}