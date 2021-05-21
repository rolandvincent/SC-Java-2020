package PPT.package1;

public class BangunDatar {
    public double LuasPersegiPanjang(double P, double L){
        return P * L;
    }
    public double KelilingPersegiPanjang(double P, double L){
        return 2d * (P + L);
    }
    public double LuasSegitiga(double Alas, double Tinggi){
        return Alas * Tinggi / 2d;
    }
    public double KelilingSegitigaSamaKaki(double Alas, double Tinggi){
        double miring = Math.sqrt(Math.pow(Tinggi,2) + Math.pow(Alas/2d,2));
        return miring * 2 + Alas;
    }
    public double KelilingSegitigaSikuSiku(double Alas, double Tinggi){
        double miring = Math.sqrt(Math.pow(Tinggi,2) + Math.pow(Alas,2));
        return miring + Alas;
    }
    public double LuasLingkaran(double r){
        return Math.PI * r * r;
    }
    public double KelilingLingkaran(double r) { return 2 * Math.PI * r; }
    public double LuasPersegiEmpat(double Sisi){
        return Sisi * Sisi;
    }
    public double KelilingPersegiEmpat(double Sisi){
        return 4 * Sisi;
    }
}
