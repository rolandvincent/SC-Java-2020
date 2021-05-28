/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DatabaseIntermediate {
    public static void main(String[] args) {
        int ID;
        String namaBuah = null;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan ID buah: ");
        ID = s.nextInt();
        
        switch(ID){
            case 1:
                namaBuah = "Apel";
                break;
            case 2:
                namaBuah = "Jeruk";
                break;
            case 3:
                namaBuah = "Anggur";
                break;
            case 4:
                namaBuah = "Kelapa";
                break;
            case 5:
                namaBuah = "Pisang";
                break;
            default: 
                System.out.println("Data tidak ditemukan");
        }
        
        if (namaBuah != null){
            System.out.println("Ditemukan '" + namaBuah + "' dengan ID " + ID);
        }
    }
}
