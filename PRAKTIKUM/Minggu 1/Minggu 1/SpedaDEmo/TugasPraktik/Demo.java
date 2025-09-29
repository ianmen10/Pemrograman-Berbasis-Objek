public class Demo {
    public static void main(String[] args) {

        // Objek Laptop Gaming
        LaptopGaming lg = new LaptopGaming();
        lg.setData("Asus ROG", "Intel i9");
        lg.setGamingSpec("NVIDIA RTX 4080", 32);
        lg.hidupkan();
        lg.mainGame();
        lg.cetakInfo();
        System.out.println();

        // Objek Laptop Ultrabook
        LaptopUltrabook lu = new LaptopUltrabook();
        lu.setData("Macbook Air", "Apple M2");
        lu.setUltrabookSpec(1.2, 13);
        lu.hidupkan();
        lu.hematBaterai();
        lu.cetakInfo();
        System.out.println();

        // Objek Smartphone
        Smartphone hp = new Smartphone();
        hp.setData("Samsung Galaxy S24", 5000);
        hp.telfon();
        hp.cetakInfo();
    }
}
