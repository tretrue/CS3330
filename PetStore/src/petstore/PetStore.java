/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

import static petstore.Gender.MALE;



/**
 *
 * @author Professor Wergeles <Professor Wergeles at cs3330@missouri.edu>
 */
public class PetStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cat cat = new Cat("Susan", 2, Gender.FEMALE); 
        
        // implicit cast 
        Pet pet3 = cat; 
        
        // implicit cast
        Object obj = cat;
        
        // explicit cast
        Cat cat2 = (Cat)pet3; 
        // not all pet's are cats 
        
        cat2.meow();
        
        System.out.println("Yawn");
        
        cat2.meow(3);
        
        Pet test = new Pet(); 
        
        if(test instanceof Cat){
            Cat test2 = (Cat)test; 
        }
        else {
            System.out.println("test is not instance of cat"); 
        }
        
        Dog dog3 = new Dog("Duke", 5, Gender.MALE);
        
    }
    
    
}
