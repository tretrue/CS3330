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
public class Pet {
    
    public String type; 
    private String name; 
    public int age; 
    public Gender gender;  
    
    public Pet(){ 
        this.age = 0; 
    }
    
    public Pet(String type, String name){
        this(); 
        this.type = type; 
        this.name = name; 
    }
    
    public Pet(String type, String name, int age, Gender gender){
        this(type, name);  
        this.age = age; 
        this.gender = gender; 
    }
    
    public String getName(){
        return this.name; 
    }
    public void setName(String name){
        this.name = name; 
    }
    
    public String getType(){
        return this.type; 
    }
    public void setType(String type){
        this.type = type; 
    }
    
    public int getAge(){
        return this.age; 
    }
    public void birthday(){
        this.age++; 
    }
}
