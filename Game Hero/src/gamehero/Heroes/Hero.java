package gamehero.Heroes;

import java.text.DecimalFormat;
import java.util.Random;

public abstract class Hero extends A {
    
    public String name;
    public double damage;
    public double health;
    public double deff;
    public double critRate = 0.3;
    public double critDamage = 1.1;

    public Hero(String name, double damage, double health, double deff) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.deff = deff;
    }
    
    private Random random = new Random();
    
    public void attack(Hero hero){
        DecimalFormat format = new DecimalFormat("0.##");
        System.out.println("***"+name+"***");
        if (health == 0){
            System.out.println(name + " died.");
            return;
        }
        double attackDamage = damage;
        if (random.nextInt() % (int)(10d / critRate) < 10){
            attackDamage *= (1 + critDamage);
            System.out.println("Crit rate:" + format.format(attackDamage));
        }
        attackDamage = attackDamage - (int)(deff * random.nextDouble());
        if (attackDamage < 0) attackDamage = 0;
        if (hero.health < attackDamage)
            hero.health = 0;
        else
            hero.health -= attackDamage;
        System.out.println("Hero attack with " + format.format(attackDamage) + " damage");
        System.out.println("Enemy HP : " + format.format(hero.health) );
    }
    
    public abstract void skillAttack(Hero hero);
    
}
