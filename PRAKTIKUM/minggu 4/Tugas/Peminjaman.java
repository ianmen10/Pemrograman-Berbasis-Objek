import java.time.LocalDate;

public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private LocalDate tanggalPinjam;

    public Peminjaman(Anggota anggota, Buku buku) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = LocalDate.now();
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public String info() {
        return "Peminjaman oleh " + anggota.getNama() + 
               " dengan buku " + buku.getJudul() + 
               " pada tanggal " + tanggalPinjam.toString();
    }
}