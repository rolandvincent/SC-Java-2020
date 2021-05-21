package TugasNo1;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();
        System.out.println("Pertambahan\t: 20+10=" + mtk.pertambahan(20,10));
        System.out.println("Pengurangan\t: 15-5=" + mtk.pengurangan(15,5));
        System.out.println("Perkalian\t: 22*4=" + mtk.perkalian(22,4));
        System.out.println("Pembagian\t: 24/6=" + mtk.pembagian(24,6));
        System.out.println("Modulus\t\t: 21%6=" + mtk.modulus(21,6));
    }
}
