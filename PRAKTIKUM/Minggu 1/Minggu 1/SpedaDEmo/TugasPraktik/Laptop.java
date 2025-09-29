public class Laptop {
    protected String merek;
    protected String prosesor;

    public void setData(String merek, String prosesor) {
        this.merek = merek;
        this.prosesor = prosesor;
    }

    public void hidupkan() {
        System.out.println(merek + " dengan prosesor " + prosesor + " sedang dinyalakan...");
    }

    public void cetakInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Prosesor: " + prosesor);
    }
}
