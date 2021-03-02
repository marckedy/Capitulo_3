/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

/**
 *
 * @author Usuario
 */
public class TestInsurance {
    
    public static void main(String[] args) {
        
        Insurance salary = new Insurance();
        
        salary.setCurrentYear(2034);
        salary.setBirthYear(2000);
        
        System.out.println(salary.Salary());
    }
}
