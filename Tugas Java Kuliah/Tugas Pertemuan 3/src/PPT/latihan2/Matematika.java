package PPT.latihan2;

public class Matematika {
    public double pertambahan(double a, double b){ return a + b; }

    public double pertambahan(double a, double b, double... x){
        double result = a + b;
        for (double _x:x)
            result += _x;
        return result;
    }

    public double pengurangan(double a, double b){
        return a - b;
    }

    public double pengurangan(double a, double b, double... x){
        double result = a - b;
        for (double _x:x)
            result -= _x;
        return result;
    }
}
