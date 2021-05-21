package Praktikum;

public class No1 {
    public static void main(String[] args) {
        System.out.println("Ganjil :");
        for (int i = 0; i <= 20; i++){
            if (i % 2 == 1)
                System.out.println(i);
        }
        System.out.println("Genap :");
        for (int i = 0; i <= 20; i++){
            if (i % 2 == 0)
                System.out.println(i);
        }
        System.out.println("Z-A :");
        for (char i = 'Z'; i >= 'A'; i--){
                System.out.println(i);
        }
        System.out.println("Anak ayam :");
        String[] nomor = new String[] {"Induknya", "Satu", "Dua", "Tiga", "Empat"};
        for (int a = 4; a >= 1; a = a-2){
            System.out.println("Tek kotek, kotek kotek");
            System.out.println("Anak ayam turunlah berkotek");
            for (int b = a; b > a-2; b--){
                System.out.println("Anak ayam turunlah " + nomor[b]);
                System.out.println("Mati satu tinggallah " + nomor[b - 1]);
            }
            System.out.println();
        }
    }
}
