public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        kucing.bersuara(); // Output: Meong! (karena metode di-override)
        kucing.mengeong();

        System.out.println("-----");

        // Tugas Praktikum: Uji coba kelas Anjing yang sudah di-override
        Anjing anjing = new Anjing("Buddy");
        anjing.bersuara(); // Output: Guk!
    }
}