package Tugas1;

public class main {
    public static void main(String[] args) {
        BangunRuang math = new BangunRuang();
        System.out.println("Volume Kubus dengan sisi 4 adalah: "
                + math.VolumeKubus(4));
        System.out.println("Volume Balok dengan panjang 4x6x8 adalah: "
                + math.VolumeBalok(4, 6, 8));

    }

    private static final int s = 674;
}
