package Tugas3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double IMT = 0, BeratBadan = 0, TinggiBadan = 0;
        String Kriteria;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        try
        {
            System.out.print("Masukkan Berat Badan (Kg) : ");
            BeratBadan = s.nextDouble();
            System.out.print("Masukkan Tinggi Badan (Cm) : ");
            TinggiBadan = s.nextDouble() / 100d;
            IMT = BeratBadan / (TinggiBadan * TinggiBadan);
            System.out.println("Index Masa Tubuh = " + IMT);
            if (IMT >= 40){
                Kriteria = "Sangat Gemuk";
            }else if(IMT >= 30){
                Kriteria = "Gemuk";
            }else if(IMT >= 25){
                Kriteria = "Berat Badan Lebih";
            }else if(IMT >= 18.5){
                Kriteria = "Berat Badan Ideal";
            }else{
                Kriteria = "Berat Badan Kurang";
            }
            System.out.println("Kriteria : " + Kriteria);
        }catch (Exception ex){
            System.out.println("[] Error Value!");
        }

    }
}
