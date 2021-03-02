/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico_12;

/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main(String[] args){
        
        Student estudiante = new Student();
        
        estudiante.serId(8);
        estudiante.setCreditHours(4);
        estudiante.setPoints(10);
        
        System.out.println(estudiante.getId());
        System.out.println(estudiante.getCreditHours());
        System.out.println(estudiante.getPoints());
        System.out.println(estudiante.gradePointAverage());
    }
}
