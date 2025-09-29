public class Main {
    public static void main(String[] args) {
        // Percobaan 3: Memanggil konstruktor dengan 2 parameter
        Kucing kucing = new Kucing("Milo", 2); 
        
        // Tugas Praktikum: Uji coba konstruktor Kucing dengan tambahan parameter ras
        Kucing kucingRas = new Kucing("Nala", 3, "Siam");
        System.out.println("Kucing Tugas: " + kucingRas.nama + ", Umur: " + kucingRas.umur + ", Ras: " + kucingRas.getRas());
    }
}