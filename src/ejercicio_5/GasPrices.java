/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

/**
 *
 * @author Usuario
 */
public class GasPrices {
    
    double barril;
    double galon1;
    double galon2;
    double total1;
    double total2;
    
    public void setDatos(double barril){
        this.barril = barril;
    }
    
    public double pricePerBarrel1(){
        this.galon1 = 100/3.5;
        this.total1 = this.barril/this.galon1;
        return this.total1;
    }
    
    public double pricePerBarrel2(){
        this.galon2 = 100/4.0;
        this.total2 = this.barril/this.galon2;
        return this.total2;
    }
}
