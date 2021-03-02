/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_1;

/**
 *
 * @author Usuario
 */
public class TestCarlysEventPriceWithMethods {
    
    
    public static void main(String[] args) {
        
        CarlysEventPriceWithMethods evento = new CarlysEventPriceWithMethods(10);
        
        evento.setInvitados(3);
        
        evento.imprimir();
        
        evento.setNumeroEvento("M1K3");
        
        System.out.println("Numero de evento: " + evento.getNumeroEvento());
        
        
        
    }
}
