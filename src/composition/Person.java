/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author melek
 */
public class Person {
    
  
   private String name;
   private Adress address;

   public Person(String name, Adress address) {
      this.name = name;
      this.address = address;
   }

   // Getter and Setter methods for name and address
   public String getName(){
     return name;
    
}
   
   public Adress getAddress(){
        return address;
     
        
   }
   
   

    
       
}


