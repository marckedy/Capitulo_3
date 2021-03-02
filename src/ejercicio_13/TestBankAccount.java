/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13;

/**
 *
 * @author Usuario
 */
public class TestBankAccount {
    
    public static void main(String[] args) {
        
        BankAccount BankAccount = new BankAccount();
        
        BankAccount.setNumber(590);
        BankAccount.setName("Marco");
        BankAccount.setBalance(300);
        
        int number = BankAccount.getNumber();
        double balance = BankAccount.getBalance();
        double salary = BankAccount.deductMonthlyFee();
        String name = BankAccount.getName();
        
        TestBankAccount.showValues(number, name, balance, salary);
    }
    
    private static void showValues(int number, String name, double balance, double salary){
        
        BankAccount BankAccount = new BankAccount();
        
        System.out.println(number);
        System.out.println(name);
        System.out.println(balance);
        System.out.println(salary);
        
        BankAccount.explainAccountPolicy();
    }
}
