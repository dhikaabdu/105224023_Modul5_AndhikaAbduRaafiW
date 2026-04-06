public class Main {
    public static void main(String[] args) {

        // kamar 1 (
        KamarHotel k1 = new KamarHotel("101", "Presidential", 2, -10000);

        // kamar 2
        KamarHotel k2 = new KamarHotel("102", "Premium", 2, 200000);

        // test over kapasitas
        k2.pesanKamar(4);

        // pesan benar
        k2.pesanKamar(2);

        // pesan lagi (harus gagal)
        k2.pesanKamar();

        // tagihan
        System.out.println("Total k1: " + k1.hitungTotalBayar(2, "PROMO"));
        System.out.println("Total k2: " + k2.hitungTotalBayar(4, "PROMO"));

        k1.tampilkanInfo();
        k2.tampilkanInfo();
    }
}