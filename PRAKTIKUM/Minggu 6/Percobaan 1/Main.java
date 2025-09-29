public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        System.out.println("Nama Kucing: " + kucing.nama); // Mengakses atribut yang diwarisi
        kucing.bersuara(); // Output: Suara hewan... (diwarisi dari Hewan)
        kucing.mengeong(); // Output: Meong!

        // Tugas Praktikum: Uji coba kelas Anjing
        Anjing anjing = new Anjing("Buddy");
        System.out.println("Nama Anjing: " + anjing.nama);
        anjing.bersuara(); // Output: Suara hewan... (diwarisi dari Hewan)
        anjing.menggonggong(); // Output: Guk...Guuk!
    }
}