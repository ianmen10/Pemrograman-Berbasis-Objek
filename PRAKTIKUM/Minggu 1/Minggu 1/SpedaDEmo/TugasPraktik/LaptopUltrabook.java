public class LaptopUltrabook extends Laptop {
    private double berat;
    private double ketebalan;

    public void setUltrabookSpec(double berat, double ketebalan) {
        this.berat = berat;
        this.ketebalan = ketebalan;
    }

    public void hematBaterai() {
        System.out.println("Ultrabook " + merek + " dalam mode hemat baterai...");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Ketebalan: " + ketebalan + " mm");
    }
}
