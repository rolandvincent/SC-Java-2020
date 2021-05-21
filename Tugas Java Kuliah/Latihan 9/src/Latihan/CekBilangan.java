package Latihan;

public class CekBilangan {
    public static void main(String[] args) {
        int nilai[] = {9, 3, 7, 8, 2, 4};
        for(int x : nilai)
            System.out.print(x + " ");
        System.out.println();

        for(int i = 0; i < nilai.length - 1; i++){
            for (int j = i + 1; j < nilai.length; j++){
                if (nilai[i] > nilai[j]){
                    int tmp = nilai[i];
                    nilai[i] = nilai[j];
                    nilai[j] = tmp;
                }
            }
        }

        for(int x : nilai)
            System.out.print(x + " ");
    }
}
