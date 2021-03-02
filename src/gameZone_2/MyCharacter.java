/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

/**
 *
 * @author Usuario
 */
public class MyCharacter {
    
    private Character ojos;
    private Character piel;
    private Character genero;
    private Character tamano;
    private Character cuerpo;
    
    public MyCharacter(){
        this.ojos = Character.AZULES;
        this.piel = Character.MORENO;
        this.genero = Character.HOMBRE;
    }
    
    public void setOjos(Character ojos){
        this.ojos = ojos;
    }
    
    public Character getOjos(){
        return this.ojos;
    }
    
    public void setPiel(Character piel){
        this.piel = piel;
    }
    
    public Character getPiel(){
        return this.piel;
    }
    
    public void setGenero(Character genero){
        this.genero = genero;
    }
    
    public Character getGenero(){
        return this.genero;
    }
    
    public void setTamano(Character tamano){
        this.tamano = tamano;
    }
    
    public Character getTamano(){
        return this.tamano;
    }
    
    public void setCuerpo(Character cuerpo){
        this.cuerpo = cuerpo;
    }
    
    public Character getCuerpo(){
        return this.cuerpo;
    }
    
}
