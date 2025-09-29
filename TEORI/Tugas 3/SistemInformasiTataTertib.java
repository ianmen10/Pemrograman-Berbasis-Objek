import java.util.ArrayList;

public class SistemInformasiTataTertib {
    private ArrayList<Pelanggaran> daftarPelanggaran = new ArrayList<>();

    public void catatPelanggaran(Pelanggaran pelanggaran) {
        daftarPelanggaran.add(pelanggaran);
        System.out.println("Pelanggaran dicatat: " + pelanggaran.getPelanggar().getNama() +
                " melanggar " + pelanggaran.getPeraturanDilanggat().getPeraturan() +
                " pada " + pelanggaran.getTanggal());
    }

    public void lihatRiwayatPelanggaran(AnggotaKampus anggota) {
        System.out.println("Riwayat pelanggaran " + anggota.getNama() + ":");
        for (Pelanggaran p : daftarPelanggaran) {
            if (p.getPelanggar().equals(anggota)) {
                System.out.println("- " + p.getPeraturanDilanggat().getPeraturan() +
                        " | Sanksi: " + p.getPeraturanDilanggat().getSanksi() +
                        " | Tanggal: " + p.getTanggal());
            }
        }
    }
}
