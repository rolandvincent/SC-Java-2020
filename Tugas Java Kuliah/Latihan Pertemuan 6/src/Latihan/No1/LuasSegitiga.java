package Latihan.No1;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        double alas, tinggi;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        alas = s.nextDouble();
        System.out.print("Masukkan tinggi : ");
        tinggi = s.nextDouble();
        double Luas = alas * tinggi / 2;
        System.out.println("Luas Segitiga : " + Luas);
    }
}
