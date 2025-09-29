public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2);
        
        // Kucing mewarisi nama dan umur dari Hewan melalui Mamalia
        System.out.println("Nama: " + kucing.nama + ", Umur: " + kucing.umur + " tahun"); 
        
        // Kucing mewarisi menyusui() dari Mamalia
        kucing.menyusui(); // Output: Menyusui anaknya...
        
        // Tugas Praktikum: Uji coba kelas Anjing
        Anjing anjing = new Anjing("Max", 5, "Bulldog");
        System.out.println("Nama Anjing: " + anjing.nama + ", Umur: " + anjing.umur + ", Ras: " + anjing.getRas());
        anjing.menyusui();
        anjing.menggonggong();
    }
}