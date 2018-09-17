/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rt104wlanguagebasics;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
/**
 *
 * @author tre
 */
public class Rt104wLanguageBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char c1 = 'A';
        char c2 = 62;
        
        short qualityScore = 70;
        
        float gravitation = (float) 9.8;
        float weight = 50f;
        
        boolean sunny = true;
        boolean warm = false;
        
        DateTimeFormatter hour = DateTimeFormatter.ofPattern("HH");  
        DateTimeFormatter minute = DateTimeFormatter.ofPattern("mm"); 
        
        String greeting = "Bonjour";
        String pawPrint = "rt104w";
    }
    
}
