public class Main {
    public static void main(String[] args) {
        // Membuat data anggota kampus
        Mahasiswa mhs1 = new Mahasiswa("Ilham", "A01", "2141720140", "Teknik Informatika");
        Dosen dosen1 = new Dosen("Pak Budi", "D01", "1987654321", "Informatika");

        // Membuat tata tertib
        TataTertib tt1 = new TataTertib("Tidak boleh terlambat masuk kelas", "Teguran tertulis");
        TataTertib tt2 = new TataTertib("Dilarang merokok di area kampus", "Skorsing 3 hari");

        // Sistem
        SistemInformasiTataTertib sistem = new SistemInformasiTataTertib();

        // Mencatat pelanggaran
        Pelanggaran pel1 = new Pelanggaran(mhs1, tt1, "2025-09-30");
        Pelanggaran pel2 = new Pelanggaran(dosen1, tt2, "2025-09-29");

        sistem.catatPelanggaran(pel1);
        sistem.catatPelanggaran(pel2);

        // Melihat riwayat pelanggaran
        sistem.lihatRiwayatPelanggaran(mhs1);
        sistem.lihatRiwayatPelanggaran(dosen1);
    }
}
