package Latihan;

public class NegaraKota {
    public static void main(String[] args) {
        String list[][] = new String[][]
            {
                {"Amerika", "Inggris", "Jepang", "Perancis", "Indonesia", "Iran", "Irak"},
                {"Teheran", "Bekasi", "Jakarta", "Bantar Gebang", "Tokyo"}
            };
        System.out.println("Ibukota " + list[0][4] + " adalah " + list[1][2]);
        System.out.println("Ibukota " + list[0][2] + " adalah " + list[1][4]);
        System.out.println("Ibukota " + list[0][5] + " adalah " + list[1][0]);
    }
}
