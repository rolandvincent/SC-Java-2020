import java.awt.*;
import java.util.*;

public class test {
    public static void main(String[] args) {

        ArrayList<String> abc = new ArrayList<>();
        abc.add("String 1");
        abc.add("String 2");
        Print(abc);

        Stack<Planet> acb = new Stack<>();
        acb.add(new Planet("Bumi", 2.4));
        acb.add(new Planet("Merikurius", 4.5));
        Color a = Color.red;
        Print(acb);
    }

    public static void Print(Collection c){
        for (Object o: c) {
            if (o.getClass().equals(Planet.class)){
                System.out.println(((Planet)o).nama);
            }else {
                System.out.println(o);
            }
        }
    }
}

class Planet{
    String nama;
    double massa;

    public Planet(String nama, double massa) {
        this.nama = nama;
        this.massa = massa;
    }
}