/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

/**
 *
 * @author Usuario
 */
public class Insurance {
    
    int currentYear;
    int birthYear;
    int decade;
    int salary;
    
    public void setCurrentYear(int year){
        this.currentYear = year;
    }
    
    public void setBirthYear(int year){
        this.birthYear = year;
    }
    
    public void Decade(){
        this.decade = (this.currentYear-this.birthYear)/10;
    }
    
    public int Salary(){
        Decade();
        this.salary = (this.decade + 15)*20;
        return this.salary;
    }
}
