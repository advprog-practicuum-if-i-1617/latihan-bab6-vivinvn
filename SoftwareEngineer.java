package inheritance;

public class SoftwareEngineer extends perusahaan {

    public int tunjangan= 5500000;
    public int gaji, bonus2=300000;

    public SoftwareEngineer(String nama, String jenis, int masakerja) {
        super(nama,jenis,masakerja);
    }
    
    public int getGaji(){
        gaji= super.gajipokok+super.getBonus()+tunjangan+bonus2;
        return gaji;
    } 
}
