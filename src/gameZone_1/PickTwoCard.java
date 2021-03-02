/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class PickTwoCard {
    
    public static void main(String[] args) {
        Random r = new Random();
        int aleatorio = r.nextInt(11) + 10;
        
        Suit s = Suit.DIAMANTES;
        
        System.out.println(aleatorio);
        System.out.println(s);
    }
}
