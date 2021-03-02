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
public class Percentages {
    
    double num1;
    double num2;
    double percent;
    
    public void setNumero1(double num1){
        this.num1 = num1;
    }
    
    public double getNumero1(){
        return this.num1;
    }
    
    public void setNumero2(double num2){
        this.num2 = num2;
    }
    
    public double getNumero2(){
        return this.num2;
    }
    
    public double computePercent(){
        this.percent = (100*this.num1)/this.num2;
        return this.percent;
    }
    
}
