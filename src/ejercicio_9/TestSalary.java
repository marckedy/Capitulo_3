/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

/**
 *
 * @author Usuario
 */
public class TestSalary {
    
    public static void main(String[] args) {
        
        Salary salary = new Salary();
        
        salary.setTarifa(300);
        salary.setRegulares(3);
        salary.setExtras(5);
        
        System.out.println(salary.Salario());
    }
}
