/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstone;

/**
 *
 * @author tre
 */
public class MyFirstOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world!");
        
        for(int i = 0; i < 100; i++)
        {                
            System.out.print(i + ", ");
        }

    System.out.println();
    
    System.out.println(weAreSleepy());
    
}

public static String weAreSleepy(){
    
    String firstString = "Hello ";

    String concat = firstString.concat("we are sleepy");
    
    System.out.println(concat);
    
    String replace = "ladies and gentlemen".replace("and","/");

    return concat.concat(replace);

   }
}