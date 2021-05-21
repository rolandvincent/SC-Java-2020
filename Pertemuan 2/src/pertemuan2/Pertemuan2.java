package pertemuan2;

import java.awt.Color;

public class Pertemuan2 {

    public static void main(String[] args) {
        Mobil Nissan = new Mobil();
                
        Nissan.banyakTempatDuduk = 4;
        Nissan.jumlahRoda = 4;
        Nissan.kecepatanMobil = 200;
        Nissan.merkRoda = "Dalton";
        Nissan.warnaMobil = "Merah";
        
        System.out.println("Banyak tempat duduk : " + Nissan.banyakTempatDuduk);
        System.out.println("Jumlah Roda : " + Nissan.jumlahRoda);
        System.out.println("Kecepatan Mobil : " + Nissan.kecepatanMobil);
        System.out.println("Merek Roda : " + Nissan.merkRoda);
        System.out.println("Warna Mobil : " + Nissan.warnaMobil);
        
        Nissan.maju();
        System.out.println("Lokasi X : " + Nissan.lokasiX);
        
        Nissan.maju();
        System.out.println("Lokasi X : " + Nissan.lokasiX);
        
        Nissan.mundur();
        System.out.println("Lokasi X : " + Nissan.lokasiX);
        
    }
    
}
