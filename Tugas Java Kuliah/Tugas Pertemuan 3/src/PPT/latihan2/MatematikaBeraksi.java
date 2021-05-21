package PPT.latihan2;

import java.text.DecimalFormat;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih(1910631170131l, "Roland Vncent Sitanggang");
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("Pertambahan:");
        System.out.println("12.5 + 28.7 + 14.2\t= " + df.format(mtk.pertambahan(12.5,28.7,14.2)));
        System.out.println("23 + 34.5\t\t\t= " + df.format(mtk.pertambahan(23,34.5)));
        System.out.println("12.6 + 28 + 14\t\t= " + df.format(mtk.pertambahan(12.6,28,14)));
        System.out.println("3 + 4 + 9\t\t\t= " + df.format(mtk.pertambahan(3,4,9)));
        System.out.println("Pengurangan:");
        System.out.println("187.5 - 24.7 - 43.2\t= " + df.format(mtk.pengurangan(187.5,24.7,43.2)));
        System.out.println("54 - 34.5\t\t\t= " + df.format(mtk.pengurangan(54,34.5)));
        System.out.println("Perkalian:");
        System.out.println("43 * 21.3\t= " + df.format(mtk.perkalian(43,21.3)));
        System.out.println("Modulus:");
        System.out.println("23.3 % 5\t= " + df.format(mtk.modulus(23.3,5)));
    }
}
