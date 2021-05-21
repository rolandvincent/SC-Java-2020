package PPT.latihanInherit;

import java.text.DecimalFormat;

public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget mtk = new MatematikaCanggihBanget();
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("Pertambahan\t\t: 10 + 23\t= " + df.format(mtk.tambah(10,23)));
        System.out.println("Perkalian\t\t: 12 * 35\t= " + df.format(mtk.kali(12,35)));
        System.out.println("Modulus\t\t\t: 24.5 % 6\t= " + df.format(mtk.tambah(24.5,6)));
        System.out.println("PertambahanTiga\t: 10 + 11 + 12 = " + df.format(mtk.pertambahanTiga(10,11, 12)));
    }
}
