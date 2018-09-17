/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

/**
 *
 * @author Professor Wergeles <Professor Wergeles at cs3330@missouri.edu>
 */
public class Dog extends Pet {
    
    private static int numberOfDogsCreated = 0; //class field
    
    private int id = 0; //instance field
    
    private static final String GENUS = "Canis"; //constant var should be in all caps
    
    private String position = "standing";
  
    
      
      public Dog(String name, int age, Gender gender){
        super("Dog", name, age, gender); 
        id = ++numberOfDogsCreated;
    }
      
      public void sit(){
          position = "seated";
      }
      
      public void standPretty(){
          position = "standing";
      }
      
      public String getPosition(){
          return position;
      }
      /*
      public static getID(int i){
          return id; //cant do, static methods cant access instance variables
      }
      */
      
      /* Cant do this 
      public static void setGenus(){
          //GENUS = "Something";
      }
      */
      
      public static String getGenus(){
          return GENUS;
      }
      
      public int getID(){
          return id;
      }
      
      public static int getNumOfDogs(){
          return numberOfDogsCreated;
      }
      
    @Override
    public int getAge(){
        return age += 7; 
    }

    public void bark(int num){
        for(int i=0; i<num; i++){
            System.out.println("Bark!"); 
        }
    }
    
    public void bark(){
        bark(1); 
    }
    
}
