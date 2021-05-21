package TugasNomor1_2;

public class Matematika implements IMatematika {
    public int pertambahan(int a, int b) {
        return  a + b;
    }

    public int pengurangan(int a, int b){
        return a - b;
    }

    public int perkalian(int a, int b){
        return a * b;
    }

    public double pembagian(int a, int b){
        return (double) a / b;
    }
}
