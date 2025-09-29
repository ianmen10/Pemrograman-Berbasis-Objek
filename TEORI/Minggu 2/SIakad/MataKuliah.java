package SIakad;
public class MataKuliah {
    String kode;
    String nama;
    int sks;
    int semester;
    String dosenPengampu;

    public MataKuliah(String kode, String nama, int sks, int semester, String dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.semester = semester;
        this.dosenPengampu = dosenPengampu;
    }
}