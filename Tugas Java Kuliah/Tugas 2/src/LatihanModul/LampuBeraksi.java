package LatihanModul;

public class LampuBeraksi{
    public static void main(String[] args){
        Lampu lampuKamar = new Lampu();
        System.out.println("Status Lampu Saat Ini: Mati");
        lampuKamar.hidupkan(); //Hidupkan Lampu
        lampuKamar.matikan(); //Matikan Lampu
        lampuKamar.matikan(); //Matikan Lampu
        lampuKamar.hidupkan(); //Hidupkan Lampu
        lampuKamar.hidupkan(); //Hidupkan Lampu
    }
}