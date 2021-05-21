package TugasNo2;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        System.out.println("30 C diubah ke F menjadi " + konversi.celciusToFahrenheit(30));
        System.out.println("60 C diubah ke R menjadi " + konversi.celciusToReamur(60));
        System.out.println("80 F diubah ke R menjadi " + konversi.farenheitToReamur(80));
    }
}
