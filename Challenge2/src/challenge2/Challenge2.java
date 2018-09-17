/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
/**
 *
 * @author tre
 */
public class Challenge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world!");
        
        
        System.out.println(invokeMe());
     }
    
    public static String invokeMe(){
        
        String myPawprint = "rltgpk";
        
        System.out.println("My pawprint is " + myPawprint);
        
        DateTimeFormatter time = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");  
        LocalDateTime form = LocalDateTime.now();  
        System.out.println("The time and date is " + time.format(form));  
        
        return "Goodbye!";

        
    }
}
