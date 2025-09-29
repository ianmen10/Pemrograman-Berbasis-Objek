import java.util.ArrayList;

public class Perpustakaan {
    private String nama;
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Peminjaman> daftarPeminjaman;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.daftarAnggota = new ArrayList<>();
        this.daftarBuku = new ArrayList<>();
        this.daftarPeminjaman = new ArrayList<>();
    }

    public void tambahAnggota(Anggota a) {
        daftarAnggota.add(a);
        System.out.println("Anggota " + a.getNama() + " berhasil ditambahkan.");
    }

    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
        System.out.println("Buku " + b.getJudul() + " berhasil ditambahkan.");
    }

    public void pinjamBuku(Anggota a, Buku b) {
        Peminjaman p = new Peminjaman(a, b);
        daftarPeminjaman.add(p);
        System.out.println("Buku berhasil dipinjam: " + p.info());
    }

    public String info() {
        String info = "Perpustakaan: " + nama + "\n";
        info += "Total Anggota: " + daftarAnggota.size() + "\n";
        info += "Total Buku: " + daftarBuku.size() + "\n";
        info += "Total Peminjaman: " + daftarPeminjaman.size() + "\n";
        return info;
    }
}