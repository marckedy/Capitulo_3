/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_2;

/**
 *
 * @author Usuario
 */
public class SammysRentalPrice {
    
    private int tiempoSegundos;
    private double precio;
    private final String LEMA = "El mejor tiempo rentado";
    
    public void setTiempoSegundos(int tiempoSegundos) {
        this.tiempoSegundos = tiempoSegundos;
    }
    
    public int getTiempoSegundos() {
        return this.tiempoSegundos;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public String getLEMA() {
        return this.LEMA;
    }
    
    public void imprimir(){
        Rental renta = new Rental();
        
        renta.setNumeroContrato(this.tiempoSegundos);
        renta.setHorasYMinutos();
        
        this.precio = renta.getPrecio();
        
        System.out.print(renta.getNumeroHoras());
        System.out.println(" : " + renta.getNumeroSegundos() + " hr");
        System.out.println("Total: $ " + this.precio);
        System.out.println(this.LEMA);
    }
    
    
    
}
