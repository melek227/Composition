/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author melek
 */
public class Adress {
   
   private String street;
   private String city;
   private String state;
   private String zipCode;

   // Constructor, getters and setters
   public Adress(String street, String city, String state, String zipCode){
       
       this.street=street;
       this.city=city;
       this.state=state;
       this.zipCode=zipCode;
       
    }
   
   
   public String getStreet(){
      return street;
   }
    
}
