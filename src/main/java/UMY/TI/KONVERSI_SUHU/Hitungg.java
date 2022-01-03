/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMY.TI.KONVERSI_SUHU;

/**
 *
 * @author AISYAH SUHERMAN
 */
public class Hitungg {
    public static double celciusToFahrenheit(double value)
    {
        return ((9 * value) / 5) + 32;
    }
    public static double celciusToReamur(double value)
    {
        return (4 * value) / 5;
    }
    public static double celciusToKelvin(double value)
    {
        return value + 273.15;
    }
    
    
    public static double reamurToCelcius(double value)
    {
        return (5*value)/4;
    }
    
    public static double reamurToFahrenheit(double value)
    {
        return ((9 * value) / 4) + 32;
    }
    
     public static double reamurToKelvin(double value)
    {
        return ((5 * value) / 4) + 273.15;
    }
   
    
    public static double fahrenheitToCelcius(double value)
    {
        return 0.5555 * (value-32); 
    }
    public static double fahrenheitToReamur(double value)
    {
        return 0.4444 * (value-32); 
    }
    public static double fahrenheitToKelvin(double value)
    {
        return 0.5555 * (value-32) + 273.15;
    }
    
     public static double kelvinToCelcius(double value)
    {
        return value - 273.15;
    }

      public static double kelvinToReamur(double value)
    {
        return 0.8 * (value-273.15) ;
    }
     public static double kelvinToFahrenheit(double value)
    {
        return 1.8 * (value-273.15) + 32;
    }
}

