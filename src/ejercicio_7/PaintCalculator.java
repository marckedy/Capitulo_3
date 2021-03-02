/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

/**
 *
 * @author Usuario
 */
public class PaintCalculator {
    
    double length;
    double width;
    double height;
    double area;
    double galon;
    double precio;
    
    public void setLongitud(double length){
        this.length = length;
    }
    
    public void setAncho(double width){
        this.width = width;
    }
    
    public void setAlto(double height){
        this.height = height;
    }
    
    public double Area(){
        this.area = 2*(this.length*this.height);
        this.area = this.area + (2*(this.width*this.height));
        return this.area;
    }
    
    public double Galones(){
        this.galon = this.area/350;
        return this.galon;
    }
    
    public double Precio(){
        precio = galon*32;
        return this.precio;
    }
}
