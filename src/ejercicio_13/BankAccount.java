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
public class BankAccount {
    int accoundNumber;
    double accoundBalance;
    String name;
    
    public BankAccount(){
        this.accoundNumber = 123;
        this.name = "Marco";
        this.accoundBalance = 19.2;
    }
    
    public void setNumber(int accoundNumber){
        this.accoundNumber = accoundNumber;
    }
    
    public int getNumber(){
        return this.accoundNumber;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setBalance(double accoundBalance){
        this.accoundBalance = accoundBalance;
    }
    
    public double getBalance(){
        return this.accoundBalance;
    }
    
    
    public double deductMonthlyFee(){
        return this.accoundBalance-4;
    }
    
    public void explainAccountPolicy(){
        System.out.println("La tarifa de servicio se deducira $4.00 cada mes");
    }
}
