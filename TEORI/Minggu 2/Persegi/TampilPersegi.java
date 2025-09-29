public class TampilPersegi {
    public static void main(String[] args) {
        // Membuat objek persegi dengan sisi = 5
        Persegi p1 = new Persegi(5);

        // Menampilkan data persegi
        System.out.println("=== DATA PERSEGI ===");
        p1.dataPersegi();

        // Menampilkan luas dan keliling
        System.out.println("Luas persegi     : " + p1.luasPersegi());
        System.out.println("Keliling persegi : " + p1.kelilingPersegi());
    }
}