package TugasNomor1_2;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        System.out.println("Pertambahan\t: 20+10=" + mtk.pertambahan(20,10));
        System.out.println("Pengurangan\t: 10-5=" + mtk.pengurangan(10,5));
        System.out.println("Perkalian\t: 10*3=" + mtk.perkalian(10,3));
        System.out.println("Pembagian\t: 21/2=" + mtk.pembagian(21,2));
    }
}
