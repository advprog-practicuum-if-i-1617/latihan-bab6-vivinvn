package inheritance;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama\t\t : ");
        String nama = in.nextLine();
        System.out.print("Jenis Pekerjaan\t : ");
        String pekerjaan = in.nextLine();
        System.out.print("Masa Kerja\t : ");
        int kerja = in.nextInt();
        if (pekerjaan.equalsIgnoreCase("Software Engineer")) {
            SoftwareEngineer a = new SoftwareEngineer(nama, pekerjaan, kerja);
            System.out.println("");
            System.out.println("Nama\t\t : " + nama);
            System.out.println("Jenis Pekerjaan\t : " + pekerjaan);
            System.out.println("Masa Kerja\t : " + kerja);
            System.out.println("Total Gaji\t : "+a.getGaji());
        }
        else if (pekerjaan.equalsIgnoreCase("Project Manager")) {
            ProjectManager b = new ProjectManager (nama, pekerjaan, kerja);
            System.out.println("");
            System.out.println("Nama\t\t : "+nama);
            System.out.println("Jenis Pekerjaan\t : "+pekerjaan);
            System.out.println("Masa Kerja\t : "+kerja);
            System.out.println("Total Gaji\t : "+b.getGaji());
        }
    }
}
