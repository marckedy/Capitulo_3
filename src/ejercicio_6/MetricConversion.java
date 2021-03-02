/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

/**
 *
 * @author Usuario
 */
public class MetricConversion {
    
    int num;
    double cm;
    double litros;
    
    public void setNumero(int num){
        this.num = num;
    }
    
    public int getNumero(){
        return this.num;
    }
    
    public double Centimetros(){
        this.cm=this.num*2.54;
        return this.cm;
    }
    
    public double Litros(){
        this.litros = this.num*3.7854;
        return this.litros;
    }
}
