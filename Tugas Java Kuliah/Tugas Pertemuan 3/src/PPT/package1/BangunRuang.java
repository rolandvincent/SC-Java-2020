package PPT.package1;

public class BangunRuang extends BangunDatar{
    public double LuasPermukaanBalok(double P, double L, double T){
        return LuasPersegiPanjang(P, L) * 2 + LuasPersegiPanjang(P, T) * 2 + LuasPersegiPanjang(L,T) * 2;
    }
    public double VolumeBalok(double P, double L, double T){
        return LuasPersegiPanjang(P, L) * T;
    }
    public double LuasPermukaanPrismaAlasSamaKaki(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma){
        double LuasAlas = LuasSegitiga(alasSegitiga, tinggiSegitiga);
        double LuasPersegi1 = Math.sqrt(Math.pow(alasSegitiga/2d,2)+Math.pow(tinggiSegitiga,2)) * tinggiPrisma;
        double LuasPersegi2 = alasSegitiga * tinggiPrisma;
        return LuasAlas * 2 + LuasPersegi1 * 2 + LuasPersegi2;
    }
    public double LuasPermukaanPrismaAlasSikuSiku(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma){
        double LuasAlas = LuasSegitiga(alasSegitiga, tinggiSegitiga);
        double LuasPersegi1 = Math.sqrt(Math.pow(alasSegitiga,2)+Math.pow(tinggiSegitiga,2)) * tinggiPrisma;
        double LuasPersegi2 = alasSegitiga * tinggiPrisma;
        double LuasPersegi3 = tinggiSegitiga * tinggiPrisma;
        return LuasAlas * 2 + LuasPersegi1 + LuasPersegi2 + LuasPersegi3;
    }
    public double VolumePrisma(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma){
        return LuasSegitiga(alasSegitiga,tinggiSegitiga) * tinggiPrisma;
    }
    public double LuasPermukaanTabung(double r, double t){
        return LuasLingkaran(r) * 2 + KelilingLingkaran(r) * t;
    }
    public double VolumeTabung(double r, double t){
        return LuasLingkaran(r) * t;
    }
    public double LuasPermukaanKubus(double Sisi){
        return LuasPersegiEmpat(Sisi) * 6;
    }
    public double VolumeKubus(double Sisi){
        return LuasPersegiEmpat(Sisi) * Sisi;
    }
}
