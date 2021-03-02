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
public class ArithmeticMethods {
    
    int num1;
    int num2;
    int num3;
    
    public void setNumero1(int num1){
        this.num1 = num1;
    }
    
    public void setNumero2(int num2){
        this.num2 = num2;
    }
    
    public int displayNumberPlus10(){
        num3 = this.num1 + 10;
        return num3;
    }
    
    public int displayNumberPlus10_2(){
        num3 = this.num2 + 10;
        return num3;
    }
    
    public int displayNumberPlus100(){
        num3 = this.num1 + 100;
        return num3;
    }
    
    public int displayNumberPlus100_2(){
        num3 = this.num2 + 100;
        return num3;
    }
    
    public int displayNumberPlus1000(){
        num3 = this.num1 + 1000;
        return num3;
    }
    
    public int displayNumberPlus1000_2(){
        num3 = this.num2 + 1000;
        return num3;
    }
}
