package inheritance;

public class ProjectManager extends perusahaan {

    private int tunjangan=6000000;
    private int masakerja;
    private int apresiasi=225000;
    private int gaji;
    private int bonus= 450000;

    public ProjectManager(String nama, String jenis, int masakerja) {
        super(nama, jenis, masakerja);
        if (masakerja >= 10) {
            apresiasi= 700000;
        } 
    }
    public int getGaji() {
        gaji = super.gajipokok + super.getBonus() + tunjangan + bonus+apresiasi;
        return gaji;
    }
}
