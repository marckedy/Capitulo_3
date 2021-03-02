/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

/**
 *
 * @author Usuario
 */
public class TwoCharacters {
    
    public static void main(String[] args) {
        
        MyCharacter c = new MyCharacter();
        
        Character tamanio = Character.ALTO;
        Character cuerpo = Character.DELGADO;
        
        System.out.println(c.getOjos());
        System.out.println(c.getPiel());
        System.out.println(c.getGenero());
        System.out.println(tamanio);
        System.out.println(cuerpo);
    }
    
}
