public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2022, 4);
        Motor motor = new Motor("Honda", 2023, 150);
        
        mobil.info();
        mobil.jalankan(); // Implementasi dari Mobil

        System.out.println("-----");
        
        motor.info();
        motor.jalankan(); // Implementasi dari Motor
        
        System.out.println("-----");
        
        // Tugas Praktikum: Uji coba kelas Truk
        Truk truk = new Truk("Fuso", 2018, 10);
        truk.info();
        truk.jalankan(); // Implementasi dari Truk
    }
}