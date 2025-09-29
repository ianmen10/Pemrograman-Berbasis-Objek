public class LaptopGaming extends Laptop {
    private String vga;
    private int ram;

    public void setGamingSpec(String vga, int ram) {
        this.vga = vga;
        this.ram = ram;
    }

    public void mainGame() {
        System.out.println("Laptop gaming " + merek + " sedang digunakan untuk bermain game berat!");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("VGA: " + vga);
        System.out.println("RAM: " + ram + "GB");
    }
}
