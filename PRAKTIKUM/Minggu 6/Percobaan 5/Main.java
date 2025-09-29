public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Oranye");
        kucing.info(); // Memanggil Kucing.info(), yang kemudian memanggil Hewan.info() melalui super.info()
        kucing.berjalan(); // Diwarisi dari Hewan

        // System.out.println(kucing.nama); // ERROR: 'nama' adalah private di Hewan
        System.out.println("Akses umur (protected): " + kucing.umur); // Valid, 'umur' adalah protected dan bisa diakses oleh subclass (dan dalam package yang sama)
        
        System.out.println("-----");
        
        // Tugas Praktikum: Uji coba kelas Anjing
        Anjing anjing = new Anjing("Shadow", 4, "Lurus");
        anjing.info(); 
        System.out.println("Jenis Bulu Anjing (melalui public method): " + anjing.getJenisBulu()); // Akses atribut private melalui public method
    }
}