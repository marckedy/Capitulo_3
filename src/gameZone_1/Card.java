/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

/**
 *
 * @author Usuario
 */
public class Card {
    
    private Suit suit;
    private Integer num;
    
    public Card(){
    this.num = 12; 
    this.suit = Suit.CORAZONES;
    }
    
    public void setSuit(Suit suit){
        this.suit = suit;
    }
    
    public Suit getSuit(){
        return this.suit;
    }
    
    public void setNumero(int num){
        this.num = num;
    }
    
    public int getNumero(){
        return this.num;
    }
}
