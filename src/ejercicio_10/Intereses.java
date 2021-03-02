/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

/**
 *
 * @author Usuario
 */
public class Intereses {
    
    private double dinero;
    private double interes;
    
    public static final int TASA = 5;    //Constante
    
    public Intereses(double dinero){
        this.dinero = dinero;
        this.interes = calcularInteres();
    }
    
    public void setDinero(double dinero){
        this.dinero = dinero;
        this.interes = calcularInteres();
    }
    
    public double getDinero(){
        return this.dinero;
    }
    
    public double getIntereses(){
        return this.interes;
    }
    
    public double calcularInteres(){
        return (this.dinero*TASA)/100;
    }
}
