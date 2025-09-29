class Kucing extends Hewan {
    private String warnaBulu;

    public Kucing(String nama, int i) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    // Overriding method info()
    @Override
    public void info() { 
        super.info(); // Menggunakan 'super.info()' untuk memanggil method info() dari Hewan
        // System.out.println("Nama (akses langsung): " + nama); // ERROR: tidak bisa mengakses 'nama' karena private
        System.out.println("Warna bulu: " + warnaBulu); 
        // System.out.println("Umur (akses langsung): " + umur); // Valid, bisa mengakses 'umur' karena protected
    }

    public void mengeong() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mengeong'");
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