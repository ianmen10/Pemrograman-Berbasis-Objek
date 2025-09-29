package SIakad;
public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    int angkatan;
    String email;

    public Mahasiswa(String nim, String nama, String prodi, int angkatan, String email) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.angkatan = angkatan;
        this.email = email;
    }
     public void tampilData() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Prodi    : " + prodi);
        System.out.println("Angkatan : " + angkatan);
        System.out.println("Email    : " + email);
    }
}
