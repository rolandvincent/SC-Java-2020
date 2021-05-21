/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamehero;

import gamehero.Heroes.Hero;

/**
 *
 * @author HP
 */
public class Assasin extends Hero{
    public Assasin(String name, double damage, double health, double deff){
        super(name,damage,health,deff);
    }

    @Override
    public void skillAttack(Hero hero) {
        hero.health -= 12;
    }
    
}
