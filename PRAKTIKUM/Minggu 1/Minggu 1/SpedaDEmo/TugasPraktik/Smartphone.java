public class Smartphone {
    private String merek;
    private int kapasitasBaterai;

    public void setData(String merek, int baterai) {
        this.merek = merek;
        this.kapasitasBaterai = baterai;
    }

    public void telfon() {
        System.out.println("Smartphone " + merek + " sedang melakukan panggilan...");
    }

    public void cetakInfo() {
        System.out.println("Merek Smartphone: " + merek);
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + "mAh");
    }
}
