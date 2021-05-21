package Praktikum;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        int batas;
        Scanner s = new Scanner(System.in);
        System.out.print("Batas Akhir : ");
        batas = s.nextInt();
        for (int h = 0; h <= batas; h++){
            if (h==0)
                System.out.print(SR(""));
            else
                System.out.print(SR("#" + h));
        }
        System.out.println();
        for (int y = 1; y <= batas; y++){
            System.out.print(SR("#"+y));
            for(int x = 1; x <= batas; x++){
                System.out.print(SR(String.valueOf(x*y)));
            }
            System.out.println();
        }
    }

    public static String SR(String val){
        return String.format("%4s",val);
    }
}
