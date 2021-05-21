/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class Mobil {
    int kecepatanMobil;
    int banyakTempatDuduk;
    int jumlahRoda;
    String merkRoda;
    String warnaMobil;
    int lokasiX;
    
    public void maju(){
        lokasiX = lokasiX + 1;
    }

    public void mundur(){
        lokasiX = lokasiX - 1;
    }
}
