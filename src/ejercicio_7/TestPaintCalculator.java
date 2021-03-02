/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

/**
 *
 * @author Usuario
 */
public class TestPaintCalculator {
    public static void main(String[] args){
        
        PaintCalculator paint = new PaintCalculator();
        
        paint.setLongitud(15);
        paint.setAncho(20);
        paint.setAlto(10);
        
        
        System.out.println(paint.Area());
        System.out.println(paint.Galones());
        System.out.println(paint.Precio());
    }
}
