package SIakad;
public class Nilai {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    public Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double hitungNilaiAkhir() {
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    public void tampilData() {
        mahasiswa.tampilData();
        mataKuliah.tampilData();
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
    }
}