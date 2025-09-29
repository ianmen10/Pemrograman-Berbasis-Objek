package SIakad;

public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("230101", "Ilham Atmaja", "Teknik Informatika", 2023, "ilham@example.com");

        // Membuat objek dosen
        Dosen dosen1 = new Dosen("198765", "Budi Santoso", "budi@example.com", "081234567890", "Pemrograman Java");

        // Membuat objek mata kuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Java", 3, 2, "Budi Santoso");

        // Membuat objek nilai
        Nilai nilai1 = new Nilai(mhs1, mk1, 85, 80, 90);

        // Menampilkan data lengkap
        nilai1.tampilData();

        System.out.println("\n=== DATA DOSEN PENGAMPU ===");
        dosen1.tampilData();
    }
}