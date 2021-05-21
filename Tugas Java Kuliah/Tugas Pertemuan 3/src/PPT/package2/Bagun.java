package PPT.package2;
import PPT.package1.*;
import java.text.DecimalFormat;
public class Bagun {
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();
        DecimalFormat df = new DecimalFormat("0.###");
        System.out.println("Balok: p=10, l=20, t=15");
        System.out.println("\tLuas Permukaan: " + df.format(bangunRuang.LuasPermukaanBalok(10,20,15)));
        System.out.println("\tVolume: " + df.format(bangunRuang.VolumeBalok(10,20,15)));
        System.out.println("=======================================================================");
        System.out.println("Prisma Segitiga Sama Kaki: Alas Segitiga=10, Tinggi Segitiga=12, Tinggi Prisma=15");
        System.out.println("\tLuas Permukaan: " + df.format(bangunRuang.LuasPermukaanPrismaAlasSamaKaki(10,12,15)));
        System.out.println("\tVolume: " + df.format(bangunRuang.VolumePrisma(10,12,15)));
        System.out.println("=======================================================================");
        System.out.println("Tabung: r=10, t=20");
        System.out.println("\tLuas Permukaan: " + df.format(bangunRuang.LuasPermukaanTabung(10,20)));
        System.out.println("\tVolume: " + df.format(bangunRuang.VolumeTabung(10,20)));
        System.out.println("=======================================================================");
        System.out.println("Kubus: s=10");
        System.out.println("\tLuas Permukaan: " + df.format(bangunRuang.LuasPermukaanKubus(10)));
        System.out.println("\tVolume: " + df.format(bangunRuang.VolumeKubus(10)));
        System.out.println("=======================================================================");
        System.out.println("Lingkaran: r=14");
        System.out.println("\tLuas: " + df.format(bangunRuang.LuasLingkaran(14)));
        System.out.println("\tKeliling: " + df.format(bangunRuang.KelilingLingkaran(14)));

        String s1 = "geeksquiz";
        String s2 = "geeksquiz";
        System.out.println("s1 == s2 is:" + s1 == s2);
    }
}
