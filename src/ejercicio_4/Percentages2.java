/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

/**
 *
 * @author Usuario
 */
public class Percentages2 {
    
    public static void main(String[] args) {
        
        Percentages numero = new Percentages();
        
        numero.setNumero1(2);
        numero.setNumero2(5);
        
        System.out.println(numero.getNumero1()+" is "+numero.computePercent()+"% of "+numero.getNumero2());
    }
}
