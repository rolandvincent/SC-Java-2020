package Tugas1;

public class BangunRuang extends BangunDatar {
    @Override
    public double RectangleArea(double x){
        return Math.pow(x,2);
    }

    public double RectangleCircumference(double x, double y){
        return x * 2 + y * 2;
    }

    public double VolumeKubus(double S){
        return  RectangleArea(S) * S;
    }

    public double VolumeBalok(double P, double L, double T){
        return  RectangleArea(P, L) * T;
    }
}
