/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico_12;



public class Student {
    
    private int id;
    private int creditHour;
    private int points;
    
    public Student(){
        this.id = 9999;
        this.creditHour = 3;
        this.points = 12;
    }
    
    public void serId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setCreditHours(int creditHour){
        this.creditHour = creditHour;
    }
    
    public int getCreditHours(){
        return this.creditHour;
    }
    
    public void setPoints(int points){
        this.points = points;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public int gradePointAverage(){
        return this.getPoints()/ this.getCreditHours();
    }
    
}
