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
public class DatabaseNoob {
    public static void main(String[] args) {
        
        int ID;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan ID buah: ");
        ID = s.nextInt();
        
        if (ID == 1){
            System.out.println("Ditemukan 'Apel' dengan ID 1");
        } else if (ID == 2){
            System.out.println("Ditemukan 'Jeruk' dengan ID 2");
        }else if (ID == 3){
            System.out.println("Ditemukan 'Anggur' dengan ID 3");
        }else if (ID == 4){
            System.out.println("Ditemukan 'Kelapa' dengan ID 4");
        }else if (ID == 5){
            System.out.println("Ditemukan 'Pisang' dengan ID 5");
        }else {
            System.out.println("Data tidak ditemukan");
        }
        
    }
}
