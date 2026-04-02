class Barang {
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;

    protected String kategori;

    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        stok = 0;
        hargaSatuan = 0;
    }

    public int getStok() {
        return stok;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("stok ga boleh minus");
        }
    }

    public void setHargaSatuan(double harga) {
        if (harga > 0) {
            hargaSatuan = harga;
        } else {
            System.out.println("harga harus > 0");
        }
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void tambahStok(int jml) {
        if (jml > 0) {
            stok += jml;
        }
    }

    public void kurangiStok(int jml) {
        if (jml > 0 && jml <= stok) {
            stok -= jml;
        } else {
            System.out.println("stok ga cukup / input salah");
        }
    }

    public void tampilkanDetailBarang() {
        System.out.println("ID: " + idBarang);
        System.out.println("Nama: " + namaBarang);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + hargaSatuan);
    }
}