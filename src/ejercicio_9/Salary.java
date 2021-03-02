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
public class Salary {
    
    private int regulares;
    private int extras;
    private double tarifa;
    
    
    
    public void setRegulares(int regulares){
        this.regulares = regulares;
    }
    
    public int getRegulares(){
        return this.regulares;
    }
    
    public void setExtras(int extras){
        this.extras = extras;
    }
    
    public int getExtras(){
        return this.extras;
    }
    
    public void setTarifa(double tarifa){
        this.tarifa = tarifa;
    }
    
    public double getTarifa(){
        return this.tarifa;
    }
    
    public double Salario(){
        return (this.regulares*this.tarifa) + ((this.extras*this.tarifa)*1.5);
    }
    
}
