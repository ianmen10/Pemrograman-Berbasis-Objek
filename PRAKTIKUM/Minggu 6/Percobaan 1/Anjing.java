class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama); // Memanggil konstruktor superclass Hewan
    }

    void menggonggong() {
        System.out.println("Guk...Guuk!");
    }
}