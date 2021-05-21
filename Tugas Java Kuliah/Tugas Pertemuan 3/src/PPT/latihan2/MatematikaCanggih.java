package PPT.latihan2;

public class MatematikaCanggih extends Matematika {
    public MatematikaCanggih(long NIM, String Nama){
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t: " + Nama);
    }

    public double perkalian(double a, double b){
        return a * b;
    }

    public double pembagian(double a, double b){
        return a / b;
    }

    public double modulus(double a, double b){
        return a % b;
    }
}
