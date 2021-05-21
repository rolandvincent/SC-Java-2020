package Tugas2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.GERMANY);
        DecimalFormat df = new DecimalFormat("#,##0.00", dfs);
        double TotalPembelian = 0, TotalBayar, TotalPotongan ;
        Scanner s = new Scanner(System.in);
        try{
            System.out.print("Total Pembelian : ");
            TotalPembelian = s.nextDouble();
        }catch (Exception ex){
            System.out.println("[] Error Value!");
        }
        if (TotalPembelian >= 50_000){
            TotalPotongan = TotalPembelian * 0.2;
        }else {
            TotalPotongan = TotalPembelian * 0.05;
        }
        TotalBayar = TotalPembelian - TotalPotongan;
        System.out.println("Besarnya potongan Rp" + df.format(TotalPotongan));
        System.out.println("Jumlah yang harus dibayarkan Rp" + df.format(TotalBayar));


    }
}
