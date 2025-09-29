public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();
        ling.r = 7;

        System.out.println("=== DATA LINGKARAN ===");
        System.out.println("Jari-jari    : " + ling.r);
        System.out.println("Luas         : " + ling.hitungLuas());
        System.out.println("Keliling     : " + ling.hitungKeliling());
    }
}
