class Hewan {
    protected String nama; // Hanya dapat diakses dari dalam kelas Hewan
    protected int umur; // Dapat diakses dalam package yang sama dan oleh subclass

    public Hewan(String nama, int umur2) {
        this.nama = nama;
        this.umur = umur;
    }

    public void berjalan() {
        System.out.println(nama + " berjalan...");
    }

    public void info() {
        System.out.println("Nama: " + nama); // Dapat mengakses 'nama' karena berada di dalam kelas Hewan
        System.out.println("Umur: " + umur); // Dapat mengakses 'umur'
    }

    void bersuara() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bersuara'");
    }
}