public class TestMahasiswa {
    public static void main (String args[]){
        // Objek 1
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        // Objek 2
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Budi Santoso";
        mhs2.alamat = "Jl. Mawar No 10";
        mhs2.kelas = "1B";
        mhs2.tampilBiodata();

        // Objek 3
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Siti Aminah";
        mhs3.alamat = "Jl. Kenanga No 5";
        mhs3.kelas = "1C";
        mhs3.tampilBiodata();
    }
}
