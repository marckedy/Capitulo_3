/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

/**
 *
 * @author Usuario
 */
public class Sandwich {
    
    private String ingredientes;
    private String pan;
    private double precio;
    
    public void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }
    
    public String getIngredientes(){
        return this.ingredientes;
    }
    
    public void setPan(String pan){
        this.pan = pan;
    }
    
    public String getPan(){
        return this.pan;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
}
