/*
 * Name: Olujimi Adetula
 * Purpose: Defining a book object
 */
package Objects;
//To create the Unique ID number
import java.util.UUID;
public class Book extends Library{
  
   //Class variable
   protected UUID id = UUID.randomUUID();
   protected String name, author, summary;
   protected int quantity;
   
   //Default Constructor
   public Book(){
    }
    
   //made Constructor
   public Book(UUID id,int q,String name, String author, String summary){
       this.id = id;
       this.quantity = q;
       this.name = name;
       this.author = author;
       this.summary = summary;
    }
   
    //Setters and Getters
    @Override
    public String toString(){
       return "\nName: "+ name+ "\nAuthor: "+ author + "\nSummary: "+ summary+"\n";
    }
    
    //Used to change the quantity of a book, during check Out
    public String checkOut(int amount){
        
        int q = this.quantity -amount;
        this.quantity=q;
        return this.quantity+"";
    }
    
    //Used to change the quanitty of the book, during return.
    public String checkIn(int amount){
      
        int q = this.quantity + amount;
        this.quantity=q;
        return this.quantity+"";
    }
    
}
