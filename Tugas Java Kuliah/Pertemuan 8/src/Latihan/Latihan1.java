package Latihan;

public class Latihan1 {
    public static void main(String[] args) {
        System.out.println("For");
        for(int i = 1; i <= 20; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");

        System.out.println();
        System.out.println("While");
        int j = 1;
        while(j <= 20)
        {
            if (j % 2 == 0)
                System.out.print(j + " ");
            j++;
        }
    }
}
