public class Persegi {
    // Atribut
    int sisi;

    // Constructor untuk menginisialisasi sisi
    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    // Method untuk menampilkan data persegi
    public void dataPersegi() {
        System.out.println("Panjang sisi persegi: " + sisi);
    }

    // Method untuk menghitung luas persegi
    public int luasPersegi() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling persegi
    public int kelilingPersegi() {
        return 4 * sisi;
    }
}