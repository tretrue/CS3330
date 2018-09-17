/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rt104wlanguagebasics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;  
import java.util.Date;  
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
        char c2 = 65;
        
        short qualityScore = 70;
        
        float gravitation = (float) 9.8;
        float weight = 50f;
        
        boolean sunny = true;
        boolean warm = false;
        
        Calendar time = Calendar.getInstance();
        int hour = time.get(Calendar.HOUR_OF_DAY);
        int minute = time.get(Calendar.MINUTE);
        
        
        String greeting = "Bonjour";
        String pawPrint = "rt104w";
        
        if(c1 == c2){
            System.out.printf("%c and %c are the same.\n\n", c1, c2);
        }
        else{
            System.out.printf("%c and %c are NOT the same.\n\n", c1, c2);
        }
        
        if(qualityScore >= 0 && qualityScore <= 60){
            System.out.println("The quality is bad.\n");
        }
        else{
            System.out.println("Good quality\n");
        }   
        
        float force = (float)(weight*gravitation);
            System.out.println("Force = " + force + "\n");
           
        
        if(sunny == true && warm == true){
            System.out.println("Go hiking\n");
        }
        else if(sunny == false && warm == true){
            System.out.println("Go barbecue\n");
        }
        else{
            System.out.println("Stay home\n");
        }
        
        
        switch(hour){
            case 5: case 6: case 7: case 8: case 9: System.out.printf("The current time is %d:%d in the MORNING\n\n", hour, minute); break;
            
            case 10: case 11: case 12: case 13: case 14: case 15: case 16: System.out.printf("The current time is %d:%d in the MORNING\n\n", hour, minute); break;
            
            case 17: case 18: case 19: case 20: case 21: case 22: System.out.printf("The current time is %d:%d in the EVENING\n\n", hour, minute); break;
            
            case 23: case 0: case 1: case 2: case 3: case 4:System.out.printf("The current time is %d:%d in the NIGHT\n\n", hour, minute); break;
                        
        }
        
            if(hour < 0){
                System.out.println("You have the wrong time.\n");
            }
            else if(hour > 24){
                System.out.println("You have the wrong time.\n");
            }
            
            for(int i = 2; i < 7; i++){
                int count = i;
                int compute = count%3;
                
                if(compute == 0){
                    System.out.println("Count: " + count);
                }
                
            }
            System.out.printf("\n");
            
            int countDown = 5;
            while(countDown != 0){
                System.out.println("Count Down: " + countDown);
                countDown--;
            }
            
            System.out.println("Houston, we have liftoff!\n");
            
            System.out.print(invokeMe(greeting));
            
 
    }
 public static String invokeMe(String greeting){
        
        String myPawprint = "rltgpk";
        
        System.out.printf("%s, My pawprint is %s", greeting, myPawprint);
        
        DateTimeFormatter time = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");  
        LocalDateTime form = LocalDateTime.now();  
        System.out.println(" and today's date is " + time.format(form));  
        
        return "Goodbye!";

 }
}   
