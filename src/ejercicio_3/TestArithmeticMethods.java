/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

/**
 *
 * @author Usuario
 */
public class TestArithmeticMethods {
    
    public static void main(String[] args) {
        
        ArithmeticMethods n = new ArithmeticMethods();
        
        n.setNumero1(13);
        n.setNumero2(121);
        
        System.out.println(n.displayNumberPlus10()+ " "+ n.displayNumberPlus10_2());
        System.out.println(n.displayNumberPlus100()+ " "+ n.displayNumberPlus100_2());
        System.out.println(n.displayNumberPlus1000()+ " "+ n.displayNumberPlus1000_2());
    }
}
