/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rt104wbooks;

/**
 *
 * @author tre
 */
public class Rt104wBooks {
    
    public enum Category{
        ACTION, ART, BUSINESS, CHILDREN, DRAMA, FANTASY, HISTORY, HORROR, MYSTERY,
        ROMANCE, SATIRE, SCI_FI, SELF_HELP, OTHER, UNKNOWN;
    }
    
    public static class Book{
        private String name;
        private String author;
        private double price;
        private Category category;
        private int version; 
        private String publisher;
        
        public Book(){
            this.author = "";
            this.name = "";
            numberOfBooks++;
        }
        
        public Book(String name, String author){
            this();
            this.name = name;
            this.author = author;
            this.version = 0;
        }
        
        public Book(String name, String author, double price, Category category){
            this(name, author);
            this.price = price;
            this.category = category;
            this.version = 1;
        }
        
        public void setName(String name){
            this.name = name;
        }
        
        public void setAuthor(String author){
            this.author = author;
        }
        
        public void setPrice(double price){
            this.price = price;
        }
        
        public void setCategory(Category category){
            this.category = category;
        }
        
        public String getName(){
            return this.name;
        }
        
        public String getAuthor(){
            return this.author;
        }
        
        public double getPrice(){
            return this.price;
        }
        
        public Category getCategory(){
            return this.category;
        }
        
        public int getVersion(){
            return this.version;
        }
        
        public void setPublisher(String publisher){
            this.publisher = publisher;
        }
        
        public String getPublisher(){
            return this.publisher;
        }
                
    }

    public static int numberOfBooks = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book book1 = new Book("Grant", "Ron Chernow");
             book1.setPrice(22.00);
             book1.setCategory(Category.HISTORY);
             book1.setPublisher("Scholastic");
            
        Book book2 = new Book("Goodnight Moon", "Margaret", 8.94, Category.CHILDREN);
                     book2.setPublisher("Penguin");

        Book book3 = new Book();
             book3.setName("The Martian");
             book3.setAuthor("Andy Weir");
             book3.setPrice(15.63);
             book3.setCategory(Category.SCI_FI);
             book3.setPublisher("Scholastic");
     
             
        Book book4 = new Book("Harry Potter and the Prisoner of Azkaban", "JK Rowling", 20.95, Category.FANTASY);
             book4.setPublisher("Bell");

        
        Book book5 = new Book("Ranger's Apprentice", "John Flanaghan", 15.63, Category.FANTASY);
             book5.setPublisher("Penguin");

        
        Book book6 = new Book("Percy Jackson", "Rick Riordan", 100.87, Category.FANTASY);
             book6.setPublisher("Penguin");

        
        Book book7 = new Book("The Bible", "Many", 00.00, Category.OTHER);
             book7.setPublisher("Pope,lol");

             
             
        
        //print results
        System.out.println("Book 1:");
        System.out.printf("Name: %s", book1.getName());
        System.out.printf("\nAuthor: %s", book1.getAuthor());
        System.out.println("\nPrice: $" + book1.getPrice());
        System.out.println("Category: " + book1.getCategory());
        System.out.printf("Version: %d", book1.getVersion());
        System.out.printf("\nPublisher: %s\n", book1.getPublisher());
        
        System.out.println("\nBook 2:");
        System.out.printf("Name: %s", book2.getName());
        System.out.printf("\nAuthor: %s", book2.getAuthor());
        System.out.println("\nPrice: $" + book2.getPrice());
        System.out.println("Category: " + book2.getCategory());
        System.out.printf("Version: %d", book2.getVersion());
        System.out.printf("\nPublisher: %s\n", book2.getPublisher());

        System.out.println("\nBook 3:");
        System.out.printf("Name: %s", book3.getName());
        System.out.printf("\nAuthor: %s", book3.getAuthor());
        System.out.println("\nPrice: $" + book3.getPrice());
        System.out.println("Category: " + book3.getCategory());
        System.out.printf("Version: %d", book3.getVersion());
        System.out.printf("\nPublisher: %s\n", book3.getPublisher());
        
        System.out.println("\nBook 4:");
        System.out.printf("Name: %s", book4.getName());
        System.out.printf("\nAuthor: %s", book4.getAuthor());
        System.out.println("\nPrice: $" + book4.getPrice());
        System.out.println("Category: " + book4.getCategory());
        System.out.printf("Version: %d", book4.getVersion());
        System.out.printf("\nPublisher: %s\n", book4.getPublisher());
        
        System.out.println("\nBook 5:");
        System.out.printf("Name: %s", book5.getName());
        System.out.printf("\nAuthor: %s", book5.getAuthor());
        System.out.println("\nPrice: $" + book5.getPrice());
        System.out.println("Category: " + book5.getCategory());
        System.out.printf("Version: %d", book5.getVersion());
        System.out.printf("\nPublisher: %s\n", book5.getPublisher());
        
        System.out.println("\nBook 6:");
        System.out.printf("Name: %s", book6.getName());
        System.out.printf("\nAuthor: %s", book6.getAuthor());
        System.out.println("\nPrice: $" + book6.getPrice());
        System.out.println("Category: " + book6.getCategory());
        System.out.printf("Version: %d", book6.getVersion());
        System.out.printf("\nPublisher: %s\n", book6.getPublisher());
        
        System.out.println("\nBook 7:");
        System.out.printf("Name: %s", book7.getName());
        System.out.printf("\nAuthor: %s", book7.getAuthor());
        System.out.println("\nPrice: $" + book7.getPrice());
        System.out.println("Category: " + book7.getCategory());
        System.out.printf("Version: %d", book7.getVersion());
        System.out.printf("\nPublisher: %s\n", book7.getPublisher());
    }
    
}
