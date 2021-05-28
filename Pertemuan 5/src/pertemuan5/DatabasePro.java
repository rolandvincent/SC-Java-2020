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
public class DatabasePro {

    public static void main(String[] args) {

        Object database[][] = new Object[][]{
            {1, 2, 3, 4, 5, 8},
            {"Apel", "Jeruk", "Anggur", "Kelapa", "Pisang", "Coklat"}
        };

        int ID = 0;

        while (true) {

            Scanner s = new Scanner(System.in);

            System.out.print("Masukkan ID buah: ");

            try {
                ID = s.nextInt();
            } catch (Exception ex) {
                System.out.println("Masukkan hanya angka");
                continue;
            }

            boolean ditemukan = false;
            for (int i = 0; i < database[1].length; i++) {
                if ((int) database[0][i] == ID) {
                    System.out.println("Data ditemukan '" + database[1][i] + "' dengan ID " + ID);
                    ditemukan = true;
                }
            }

            if (!ditemukan) {
                System.out.println("Data tidak ditemukan.");
            }
        }

    }

}
