/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamehero.Heroes;

/**
 *
 * @author HP
 */
public class A {
    protected int test = 1;
    public int test2 =2;
    private int test3 = 3;
    int test4 = 4;
    
    
    private String phoneNumber;

    public String getPhoneNumber() {
        return "08xxxxx"+phoneNumber.substring(phoneNumber.length() - 2);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
