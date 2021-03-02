/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;

/**
 *
 * @author Usuario
 */
public class TestPainting {
    
    public static void main(String[] args) {
        
        Painting paint = new Painting();
        
        paint.setArtist("MEPA");
        paint.setTitle("Programacion");
        
        double price = paint.getPrice();
        String title = paint.getTitle();
        String artist = paint.getArtist();
        
        System.out.println(title);
        System.out.println(artist);
        System.out.println(price);
        System.out.println(paint.getMedium());
        paint.CommissionExplain();
    }
}
