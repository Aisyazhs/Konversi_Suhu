/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMY.TI.KONVERSI_SUHU;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author AISYAH SUHERMAN
 */
@Controller
public class SUHUCONTROLLER {
    @RequestMapping("/Fahrenheit")
    @ResponseBody
    public String getFahrenheit(HttpServletRequest dt, Model temp){
        
        int Fahre = Integer.parseInt(dt.getParameter("temperature"));
        int find = Integer.parseInt(dt.getParameter("ket"));
        
        double hitung = Hitungg.celciusToFahrenheit(Fahre);
        double Hitung = Hitungg.fahrenheitToCelcius(find);
        
        return "Celcius = " + Fahre + " C" + "<p>" +
                "Convert Fahreinheit = " + hitung + " F" + "<p>" + "<hr>" +
                "Fahreinhet = " + find + " F" + "<p>" +
                "Convert Celcius = " + Hitung + " C";
    }
    
    @RequestMapping("/Reamur")
    @ResponseBody
    public String getReamur(HttpServletRequest dt, Model temp){
        
        int Reamur = Integer.parseInt(dt.getParameter("temperature"));
        int find = Integer.parseInt(dt.getParameter("ket"));
        
        double hitung = Hitungg.celciusToReamur(Reamur);
        double Hitung = Hitungg.reamurToCelcius(find);
        
        return "Celcius = " + Reamur + " C" + "<p>" +
                "Convert Reamur = " + hitung + " R" + "<hr><p>" +
                "Reamur = " + find + " R" + "<p>" +
                "Convert Celcius = " + Hitung + " C";
    }
    
    @RequestMapping("/Kelvin")
    @ResponseBody
    public String getKelvin(HttpServletRequest dt, Model temp){
        
        int Kelvin = Integer.parseInt(dt.getParameter("temperature"));
        int find = Integer.parseInt(dt.getParameter("ket"));
        
        double hitung = Hitungg.celciusToKelvin(Kelvin);
        double Hitung = Hitungg.kelvinToCelcius(find);
        
        return "Celcius = " + Kelvin + "C" + "<p>" +
                "Convert Kelvin = " + hitung + "K" + "<hr><p>" +
                "Kelvin = " + find + " K" + "<p>" +
                "Convert Celcius = " + Hitung + " C";
                
    }
    
    @RequestMapping("/temperature")
    @ResponseBody
    public String gettemperature (HttpServletRequest dt, Model temp){
        
        int obj = Integer.parseInt(dt.getParameter("temperature"));
        
        
        double CF = Hitungg.celciusToFahrenheit(obj);
        double CR = Hitungg.celciusToReamur(obj);
        double CK = Hitungg.celciusToKelvin(obj);
        
        
        double FC = Hitungg.fahrenheitToCelcius(obj);
        double FR = Hitungg.fahrenheitToReamur(obj);
        double FK = Hitungg.fahrenheitToKelvin(obj);
        
        
        double RC = Hitungg.reamurToCelcius(obj);
        double RF = Hitungg.reamurToFahrenheit(obj);
        double RK = Hitungg.reamurToKelvin(obj);
        
        double KC = Hitungg.kelvinToCelcius(obj);
        double KR = Hitungg.kelvinToReamur(obj);
        double KF = Hitungg.kelvinToFahrenheit(obj);
        
        return "Nilai = " + obj + "<p>" + "<b>From Celcius To</b>" + "<p>" +
                "Fahrenheit = " + CF+ " F" + "<p>" +
                "Reamur = " + CR + " R" + "<p>" + 
                "Kelvin = " + CK + " K"+ "<p>" + "<hr>" +
                "<b>From Fahrenheit To </b>" + "<p>" +
                "Celcius = " + FC+ " C" + "<p>" +
                "Reamur = " + FR+ " R" + "<p>" +
                "Kelvin = " + FK + " K" +"<p>" + "<hr>" +
                "<b>From Reamur To </b>" + "<p>" +
                "Celcius = " + RC+ " C" + "<p>" +
                "Fahrenheit = " + RF+ " F" + "<p>" +
                "Kelvin = " + RK + " K" + "<p>" + "<hr>" +
                "<b>From Kelvin To </b>" + "<p>" +
                "Celcius = " + KC+ " C" + "<p>" +
                "Reamur = " + KR+ " R" + "<p>" +
                "Fahrenheit = " + KF + " F";
    }
    
}