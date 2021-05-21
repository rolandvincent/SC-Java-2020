package Tugas1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long NPM = 0;
        String Nama_Mahasiswa = "", Keterangan, Grade;
        double NilaiKehadiran = 0, NilaiTugas = 0, NilaiUTS = 0, NilaiUAS = 0,
                NilaiAkhir;

        Scanner s = new Scanner(System.in);
        try{
            /* INPUT */
            System.out.print("NPM\t: ");
            NPM = s.nextLong();
            s.nextLine();
            System.out.print("Nama Mahasiswa\t: ");
            Nama_Mahasiswa = s.nextLine();
            System.out.print("Nilai Kehadiran\t: ");
            NilaiKehadiran = s.nextDouble();
            System.out.print("Nilai Tugas\t: ");
            NilaiTugas = s.nextDouble();
            System.out.print("Nilai UTS\t: ");
            NilaiUTS = s.nextDouble();
            System.out.print("Nilai UAS\t: ");
            NilaiUAS = s.nextDouble();
        }catch (Exception ex){
            System.out.println("[Error] " + ex.getMessage());
        }
        NilaiAkhir = 0.1 * NilaiKehadiran + 0.2 * NilaiTugas +
                0.3 * NilaiUTS + 0.4 * NilaiUAS;
        if (NilaiAkhir > 75){
            Grade = "A";
            Keterangan = "ISTIMEWA";
        } else if (NilaiAkhir > 65){
            Grade = "B";
            Keterangan = "BAIK";
        } else if (NilaiAkhir > 55){
            Grade = "C";
            Keterangan = "CUKUP";
        } else if (NilaiAkhir > 45){
            Grade = "D";
            Keterangan = "KURANG";
        } else if (NilaiAkhir > 0){
            Grade = "E";
            Keterangan = "KURANG SEKALI";
        } else {
            Grade = "Tidak ada";
            Keterangan = "Nilai Error";
        }
        /* OUTPUT */
        System.out.println("======== OUTPUT =========");
        System.out.println("NPM Mahasiswa\t:" + NPM);
        System.out.println("Nama Mahasiswa\t:" + Nama_Mahasiswa);
        System.out.println("Nilai Akhir\t:" + NilaiAkhir);
        System.out.println("Grade\t\t:" + Grade);
        System.out.println("Keterangan\t:" + Keterangan);
    }
}
