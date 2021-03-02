/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

/**
 *
 * @author Usuario
 */
public class TestGasPrices {
    
    public static void main(String[] args) {
        
        GasPrices barril = new GasPrices();
        
        barril.setDatos(100);
        
        System.out.println(barril.pricePerBarrel1());
        System.out.println(barril.pricePerBarrel2());
    }
    
}
