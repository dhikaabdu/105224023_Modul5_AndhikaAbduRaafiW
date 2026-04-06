public class KamarHotel {

    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    public KamarHotel(String nomor, String tipe, int kapasitas) {
        this.nomorKamar = nomor;
        setTipeKamar(tipe);
        this.kapasitasMaksimal = kapasitas;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomor, String tipe, int kapasitas, double harga) {
        this.nomorKamar = nomor;
        setTipeKamar(tipe);
        this.kapasitasMaksimal = kapasitas;
        setHargaPerMalam(harga);
        this.isTersedia = true;
    }

    public String getNomorKamar() { return nomorKamar; }
    public String getTipeKamar() { return tipeKamar; }
    public int getKapasitasMaksimal() { return kapasitasMaksimal; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public boolean isTersedia() { return isTersedia; }

    public void setTipeKamar(String tipe) {
        if (tipe.equalsIgnoreCase("Reguler") ||
            tipe.equalsIgnoreCase("Premium") ||
            tipe.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipe;
        } else {
            System.out.println("Tipe salah → jadi Reguler");
            this.tipeKamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double harga) {
        if (harga >= 50000) {
            this.hargaPerMalam = harga;
        } else {
            System.out.println("Harga salah → jadi 50000");
            this.hargaPerMalam = 50000;
        }
    }

    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Berhasil pesan kamar");
        } else {
            System.out.println("Kamar sudah terisi");
        }
    }

    public void pesanKamar(int tamu) {
        if (tamu > kapasitasMaksimal) {
            System.out.println("Tamu melebihi kapasitas!");
        } else {
            pesanKamar();
        }
    }

    public void batalPesan() {
        isTersedia = true;
    }

    public double hitungTotalBayar(int malam) {
        return malam * hargaPerMalam;
    }

    public double hitungTotalBayar(int malam, String voucher) {
        double total = malam * hargaPerMalam;
        if (voucher.equalsIgnoreCase("PROMO") && malam >= 3) {
            return total * 0.8;
        }
        return total;
    }

    public void tampilkanInfo() {
        System.out.println(nomorKamar + " | " + tipeKamar + " | " +
                kapasitasMaksimal + " | " + hargaPerMalam + " | " +
                (isTersedia ? "Tersedia" : "Terisi"));
    }
}