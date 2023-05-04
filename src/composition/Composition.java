/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composition;

/**
 *
 * @author melek
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      Adress adress = new Adress("123 Main St", "Anytown", "CA", "12345");
      Person person = new Person("John Doe", adress); 
      
      //composition bir classtan nesne türetirken parametre olarak başka bir classın verilmesi

      System.out.println(person.getName()); // Output: John Doe
      System.out.println(person.getAddress().getStreet());
        
        
        
        
    }
    
}
