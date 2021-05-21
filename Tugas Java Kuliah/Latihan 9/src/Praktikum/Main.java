package Praktikum;

import javax.swing.plaf.IconUIResource;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0, totalBayar = 0;
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan Item Barang : ");
        n = s.nextInt();
        Barang[] barang = new Barang[n];
        for (int i = 0; i < n; i++){
            Barang b = new Barang();
            System.out.println("Data ke " + (i + 1) +" : ");
            s.nextLine();
            System.out.print("Masukkan kode\t\t: ");
            b.kode = s.nextLine();
            System.out.print("Masukkan jumlah beli: ");
            b.jumlahBeli = s.nextInt();
            barang[i] = b;
        }

        System.out.println("\n");
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");

        Table tb = new Table();
        tb.addHeaderRow("No","Kode Barang","Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        for (int i = 0; i < n; i++){
            String namaBarang = "";
            int harga = 0, jmlhBayar = 0;
            switch (barang[i].kode){
                case "a001":
                    namaBarang = "Buku";
                    harga = 3000;
                    break;
                case "a002":
                    namaBarang = "Pensil";
                    harga = 4000;
                    break;
                case "a003":
                    namaBarang = "Pulpen";
                    harga = 5000;
                    break;
                default:
                    namaBarang = "(Tidak ditemukan)";
            }
            jmlhBayar = harga * barang[i].jumlahBeli;
            totalBayar += jmlhBayar;
            tb.addRow(new TableRow(i+1+"",barang[i].kode,namaBarang, df.format(harga), barang[i].jumlahBeli + "", df.format(jmlhBayar)));
        }
        tb.addRow(new TableLine());
        tb.addRow(new TableRow(new TableColumn("Total Bayar", 1, 4), new TableColumn(df.format(totalBayar))));
        tb.getTable();
    }
}
