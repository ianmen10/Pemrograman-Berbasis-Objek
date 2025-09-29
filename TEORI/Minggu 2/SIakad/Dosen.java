package SIakad;
public class Dosen {
    String nip;
    String nama;
    String email;
    String noHp;
    String mataKuliah;

    public Dosen(String nip, String nama, String email, String noHp, String mataKuliah) {
        this.nip = nip;
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
        this.mataKuliah = mataKuliah;
    }

    public void tampilData() {
        System.out.println("NIP          : " + nip);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Email        : " + email);
        System.out.println("No HP        : " + noHp);
        System.out.println("Mata Kuliah  : " + mataKuliah);
    }
}