public class Main {
    public static void main(String[] args) {

        Barang b = new Barang("B01", "Laptop");

        b.setKategori("Elektronik");

        // coba error
        b.setHargaSatuan(-100);
        b.setStok(-5);

    
        b.setHargaSatuan(8000000);
        b.tambahStok(10);

        b.kurangiStok(20); 
        b.kurangiStok(3);

        b.tampilkanDetailBarang();
    }
}