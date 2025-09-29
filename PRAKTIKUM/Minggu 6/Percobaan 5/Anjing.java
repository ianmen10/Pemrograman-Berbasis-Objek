class Anjing extends Hewan {
    private String jenisBulu; // Private: hanya bisa diakses dari dalam kelas Anjing

    public Anjing(String nama, int i, String string) {
        super(nama, umur); // Memanggil konstruktor Hewan
        this.jenisBulu = jenisBulu;
    }

    public void menggonggong() {
        // ... (metode tambahan)
    }

    public String getJenisBulu() { // Public method untuk mengakses atribut private
        return this.jenisBulu;
    }
    
    @Override
    public void info() { 
        super.info(); // Memanggil Hewan.info() untuk menampilkan nama (private) dan umur (protected)
        System.out.println("Jenis bulu: " + jenisBulu); 
    }

    public void bersuara() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bersuara'");
    }

    public void menyusui() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menyusui'");
    }
}