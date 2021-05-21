package PPT.latihanInherit;

import java.text.DecimalFormat;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.##");
        MatematikaCanggih mtk = new MatematikaCanggih();
        System.out.println("Pertambahan\t: 12 + 14\t= "+ df.format(mtk.tambah(12, 14)));
        System.out.println("Perkalian\t: 15 * 20\t= "+ df.format(mtk.kali(15, 20)));
        System.out.println("Pengurangan\t: 15 - 25\t= "+ df.format(mtk.kurang(15, 25)));
        System.out.println("Pembagian\t: 75 / 8\t= "+ df.format(mtk.bagi(75, 8)));
        System.out.println("Modulus\t\t: 60 % 7\t= "+ df.format(mtk.modulus(60, 7)));
    }
}
