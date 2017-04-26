package inheritance;

public class perusahaan {

    public int gajipokok = 2500000;
    public int bonus;
    public int masakerja;
    public String nama;
    public String jenis;

    public perusahaan(String nama, String jenis, int masakerja) {
        this.nama = nama;
        this.jenis = jenis;
        this.masakerja = masakerja;
    }

    private String getNama() {
        return nama;
    }

    private String getjenis() {
        return jenis;
    }

    public int getBonus() {
        if (masakerja > 5) {
            return 500000 / 2;
        } else if (masakerja <= 5) {
            return 0;

        }
        return bonus;
    }
}
