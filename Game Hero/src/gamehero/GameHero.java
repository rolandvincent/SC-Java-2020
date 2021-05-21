package gamehero;

import gamehero.Heroes.A;
import gamehero.Heroes.Hero;
import java.util.Random;

public class GameHero {
    public static void main(String[] args) {
        Hero Alucard = new Fighter("Alucard",8,100,4);
        Hero Gusion = new Assasin("Gusion",7,100,5);
        Hero Rafaela = new Healer("Rafaela", 5, 100, 5);
        Fighter Balmond = new Fighter("Balmond", 4,150,2);
        
        A test = new A();
        test.setPhoneNumber("0812884732454");
        System.out.println(test.getPhoneNumber());
        
//        while(Alucard.health != 0 && Gusion.health != 0){
//            Alucard.attack(Gusion);
//            Gusion.attack(Alucard);
//        }
//        if (Alucard.health != 0){
//            System.out.println("Alucard win!");
//        }else{
//            System.out.println("Gusion win!");
//        }

    }
    
}
