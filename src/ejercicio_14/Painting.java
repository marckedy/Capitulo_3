/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;

/**
 *
 * @author Usuario
 */
public class Painting {
    
    private double galleryCommission;
    private double price;
    private String title;
    private String artist;
    private String medium;
    
    public static final double COMMISSION = 0.20; 
    
    public Painting(){
        this.title = "Pintura";
        this.artist = "Marco";
        this.medium = "Acuarela";
        this.price = 100;
        this.galleryCommission = COMMISSION;
    }
    
    public void setPrice(double price){
        this.price = price*COMMISSION;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public String getArtist(){
        return this.artist;
    }
    
    public void setMedium(String medium){
        this.medium = medium;
    }
    
    public String getMedium(){
        return this.medium;
    }
    
    public double getGalleryCommission(){
        return this.galleryCommission;
    }
    
    public void CommissionExplain(){
        System.out.println("Porcenetaje de comision de Galeria es de %" + COMMISSION);
    }
    
}
