<<<<<<< HEAD
class Karyawan {
    // no 1
    private String idKaryawan;
    private String nama;

    // no 2
    private double gajiPokok;

    // no 3
    protected String departemen;

    // konstruktor
    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.gajiPokok = 0;
        this.departemen = "-";
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok >= 0) {
            this.gajiPokok = gajiPokok;
        } else {
            System.out.println("Gaji tidak boleh negatif!");
        }
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void tampilkanDataKaryawan() {
        System.out.println("=== Data Karyawan ===");
        System.out.println("ID          : " + idKaryawan);
        System.out.println("Nama        : " + nama);
        System.out.println("Departemen  : " + departemen);
        System.out.println("Gaji Pokok  : " + gajiPokok);
    }
=======
class Karyawan {
    // no 1
    private String idKaryawan;
    private String nama;

    // no 2
    private double gajiPokok;

    // no 3
    protected String departemen;

    // konstruktor
    public Karyawan(String idKaryawan, String nama) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.gajiPokok = 0;
        this.departemen = "-";
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok >= 0) {
            this.gajiPokok = gajiPokok;
        } else {
            System.out.println("Gaji tidak boleh negatif!");
        }
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void tampilkanDataKaryawan() {
        System.out.println("=== Data Karyawan ===");
        System.out.println("ID          : " + idKaryawan);
        System.out.println("Nama        : " + nama);
        System.out.println("Departemen  : " + departemen);
        System.out.println("Gaji Pokok  : " + gajiPokok);
    }
>>>>>>> c3e0e5f4b96b92c11338726b52f45fd64f64b497
}