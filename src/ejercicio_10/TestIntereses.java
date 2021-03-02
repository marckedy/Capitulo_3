/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

/**
 *
 * @author Usuario
 */
public class TestIntereses {
    public static void main(String[] args) {
        Intereses interes = new Intereses(20000);
        
        interes.setDinero(30000);
        
        System.out.println(interes.getIntereses());
        System.out.println(interes.getDinero());
    }
}
