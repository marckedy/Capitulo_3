/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

/**
 *
 * @author Usuario
 */
public class TestMetricConversion {
    public static void main(String[] args) {
        
        MetricConversion convertir = new MetricConversion();
        
        convertir.setNumero(1);
        
        System.out.println(convertir.Centimetros());
        System.out.println(convertir.Litros());
    }
}
