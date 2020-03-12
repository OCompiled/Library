/*
 * Name: Olujimi Adetula
 * Purpose: Allow user to add, remove books from a Library, and to their favorite. Also allows the checking out and retruning of books.* 
 */
package Objects;

import java.util.*;
public class Library {
    
   //Stack holding the genres of books
   static Stack<LinkedHashMap> genres = new Stack<>();
   //Class object
   static Library test = new Library();
   //Favorite Map
   static LinkedHashMap<String, Book> fav = new LinkedHashMap<>();
   //Book variables for adding new books
   static Book b0,b22,b23,b24,b25,b26;
   
    //Holds the list of genres
   static String[] nameOfGenres = {"Adventure","Contemporary","Dystopian","Fantasy","Horror","Thriller","Romance"};
   
   //The genres   
   static LinkedHashMap<String, Book> Adventure = new LinkedHashMap<String,Book>();
   static LinkedHashMap<String, Book> Contemporary = new LinkedHashMap<String,Book>();
   static LinkedHashMap<String, Book> Dystopian = new LinkedHashMap<String,Book>();
   static LinkedHashMap<String, Book> Fantasy = new LinkedHashMap<String,Book>();
   static LinkedHashMap<String, Book> Horror = new LinkedHashMap<String, Book>();
   static LinkedHashMap<String, Book> Thriller = new LinkedHashMap<String, Book>();
   static LinkedHashMap<String, Book> Romance = new LinkedHashMap<String, Book>();

   static UUID a = UUID.randomUUID();
    public static void main (String[]args){

        for(int i=0; i<3; i++){
             a = UUID.randomUUID();
        }

        //Creating Sample book objects
       Book b1 = new Book(a,5,"On the Road","Jack Kerouac","Is about the travels of Kerouac and his friends across the United States");
       Book b2 = new Book(a,3,"Lord of the Files","William Golding","Is about a groupd of British boys stranded on an uninhabited island and their disastrous attempt to govern themselves");
       Book b3 = new Book(a,2,"Last of the Breed", "Louis L'Amour","Is about Native American united States Air Force pilot Major Joseph Makatozi, shot down by the Soviets over the ocean between Russia and Alaska and then captured");
       Book b4 = new Book(a,3,"We Are Us", "Tara Leigh","Is about the author's love life, and how he was hers, and she was his, and he broke her");
       Book b5 = new Book(a,1, "Last Couple Standing","Matthew Norman","Is about a couple determined not to get divorced, and hence enter an experiment that is way over their heads.");
       Book b6 = new Book(a,2,"These Ghosts Are Family","Maisy Card","Is about Abel's decision and tells the story of the Paisley family from colonial Jamaica to present day Harlem");
       Book b7 = new Book(a,3,"1994","George OrWell","Is about a world where the government control every aspect of the people's lives. 2+2 =5. \"Big Brother is Watching you\"");
       Book b8 = new Book(a,2,"The Handmaid's Tale","Margaret Atwood","Is about a totalitarian society in what was the United States");
       Book b9 = new Book(a,3,"American War","Omar El Akkad","Is about a near- future United States of America, ravaged by climate change, in which a second Civil War has broken out over fossil fuels");
       Book b10 = new Book(a,1,"Lord of the Rings "," J.R.R. Tolkien "," ");
       Book b11 = new Book(a,6,"The Hobbit ","J.R.R Tolkien "," ");
       Book b12 = new Book(a,3,"The name of the Wind "," Patrick Rothfuss "," ");
       Book b13 = new Book(a,2,"The Bad Seed ","William March "," ");
       Book b14 = new Book(a,4,"Beloved "," Toni Morrison "," ");
       Book b15 = new Book(a,3,"The Bloody Chamber "," Angela Carter "," ");
       Book b16 = new Book(a,4,"The wife who knew too much ","Michele Campbell "," ");
       Book b17 = new Book(a,4,"Blood World  ","Chris Mooney "," ");
       Book b18 = new Book(a,3,"The Nemesis Manifesto ","Eric Van Lustbader "," ");
       Book b19 = new Book(a,6,"Pride and Prejudice ","Jane Austen "," ");
       Book b20 = new Book(a,7,"The Fault in Our Stars ","John Green "," ");
       Book b21 = new Book(a,8,"The Help ","Kathryn Stockett "," ");
       
       
       //Adding the Book object to the HashMap
       Adventure.put("On the Road",b1);
       Adventure.put("Lord of the Files", b2);
       Adventure.put("Last of the Breed",b3);
       
       Contemporary.put("We Are Us",b4);
       Contemporary.put("Last Couple Standing",b5);
       Contemporary.put("These Ghosts Are Family", b6);
       
       Dystopian.put("1994",b7);
       Dystopian.put("The Handmaid's Tale",b8);
       Dystopian.put("American War",b9);
       
       Fantasy.put("Lord of the Ring",b10);
       Fantasy.put("The Hobbit",b11);
       Fantasy.put("The name of the Wind",b12);
       
       Horror.put("The Bad Seed",b13);
       Horror.put("Beloved",b14);
       Horror.put("The Bloody Chamber",b15);
       
       Thriller.put("The wife who knew too much",b16);
       Thriller.put("Blood World",b17);
       Thriller.put("The Nemesis Manifesto",b18);
       
       Romance.put("Pride and Prejudice",b19);
       Romance.put("The Fault in Our Stars",b20);
       Romance.put("The Help",b21);
       
       //Adding LinkedHashMap to Stack
       genres.push(Adventure);
       genres.push(Contemporary);
       genres.push(Dystopian);
       genres.push(Fantasy);
       genres.push(Horror);
       genres.push(Thriller);
       genres.push(Romance);

        int selection =-1;
        int bookAmount =-1;
        Scanner scan = new Scanner(System.in);
        boolean isValid = false;

        //Menu
        while(true){
            
            //printing the menu
            System.out.println("\n Welcome to the Top-Night Library");
            System.out.println("0- Exit Library ");
            System.out.println("1- To look at books collection");
            System.out.println("2- To set a book has favorite");
            System.out.println("3- To look at favorite books ");
            System.out.println("4- To add a new book to Library collection");
            System.out.println("5- To remove a book from Collection");
            System.out.println("6- To check out a book");
            System.out.println("7- To return a book");

            
            //Catching the mismatch, and out of bound entry Exception
            try{
                 selection = scan.nextInt();
                if(selection>7 || selection <-1){
                    System.out.println("Enter only number's between 0-7");
                    scan.nextLine();
                }
               }
            catch(InputMismatchException e ){
                System.out.println("Enter only number's between 0-7");
                scan.nextLine();
            } 
            
            //Actions to the menu
            switch(selection){
                case 0:
                    System.out.println("Thank you for visiting the Library, enjoy");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Avaliable Genres: Adventure, Contemporary, Dystopian, Fantasy, Horror, Thriller, Romance");
                    System.out.println("Enter one of the following genere names");
                    String nameOfGenere = scan.next();
                    //Checking the value in name
                    test.check(nameOfGenere);
                    System.out.println("-------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Avaliable Genres: Adventure, Contemporary, Dystopian, Fantasy, Horror, Thriller, Romance");
                    scan.nextLine();
                    System.out.println("Enter the name of the genre");
                    String favGenre = scan.next();
                    scan.nextLine();
                    System.out.println("Enter the name of the book");
                    String favBook = scan.nextLine();
                    test.checkFav(favGenre, favBook);
                    System.out.println("-------------------------------------------------------");
                    break;    
                case 3:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Avaliable Genres: Adventure, Contemporary, Dystopian, Fantasy, Horror, Thriller, Romance");
                    test.displayFav();
                    System.out.println("-------------------------------------------------------");
                    break;
                
                case 4:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Avaliable Genres: Adventure, Contemporary, Dystopian, Fantasy, Horror, Thriller, Romance");
                    System.out.println("How many books would you like to add? [MAX of 5]");
   
                    //Catching the mismatch
                    try{
                        bookAmount = scan.nextInt();
                    }
                    catch(InputMismatchException e ){
                            System.out.println("Enter only number's between 1-5");
                            scan.nextLine();
                     } 
                    
                    //Adding the amount of Book specified.
                    for(int i=1; i<= bookAmount;i++){
                        switch (i) {
                            case 1:
                                test.addBook(b22);
                                break;
                            case 2:
                                test.addBook(b23);
                                break;
                            case 3:
                                test.addBook(b24);
                                break;
                            case 4:      
                                test.addBook(b25);
                                break;
                            case 5:
                                test.addBook(b26);
                                break;
                            default:
                                System.out.println("Library is full, please try again later.");
                                break;
                        }
                    }
                    System.out.println("-------------------------------------------------------");
                    break;
               case 5:
                   System.out.println("-------------------------------------------------------");
                   System.out.println("Avaliable Genres: Adventure, Contemporary, Dystopian, Fantasy, Horror, Thriller, Romance");
                    test.removeBook();
                    System.out.println("-------------------------------------------------------");
                    break;
               case 6:
                   System.out.println("-------------------------------------------------------");
                   System.out.println("Avaliable Genres: Adventure, Contemporary, Dystopian, Fantasy, Horror, Thriller, Romance");
                    test.bookCheckOut();
                    System.out.println("-------------------------------------------------------");
                    break;
               case 7:
                   System.out.println("-------------------------------------------------------");
                   System.out.println("Avaliable Genres: Adventure, Contemporary, Dystopian, Fantasy, Horror, Thriller, Romance");
                   test.bookReturn();
                   System.out.println("-------------------------------------------------------");
                   break;
            } 
        }
    }
    
    //Option 7 returning Book
    private void bookReturn(){
        Scanner s = new Scanner(System.in);
        String genre, name;
        int quantity;
        LinkedHashMap<String, Book> us;
        
        System.out.println("What is the name of the genre");
        genre = s.nextLine();
        System.out.println("What is the name of the Book");
        name = s.nextLine();
        System.out.println("How many would you like to return");
        quantity = s.nextInt();

        for(int i =0; i<genres.size(); i++){
            if(genre.equals(nameOfGenres[i])){
                us = genres.get(i);
                System.out.println("CheckIn complete,We now have "+us.get(name).checkIn(quantity)+ " of: " +name);
            }
        }
    }
    
    //Option 6 checking out a book from colelction
    private void bookCheckOut(){
        Scanner s = new Scanner(System.in);
        String genre, name;
        int quantity;
        LinkedHashMap<String, Book> us;
                        
        System.out.println("What is the name of the genre");
        genre = s.nextLine();
        System.out.println("What is the name of the Book");
        name = s.nextLine();
        System.out.println("How many would you like to check out");
        quantity = s.nextInt();

        for(int i =0; i<genres.size(); i++){
            if(genre.equals(nameOfGenres[i])){
                us = genres.get(i);
                System.out.println("CheckOut complete, Only "+us.get(name).checkOut(quantity)+ "remain of: " +name);
            }
        }
    }
    
    //Option 5: Removing book from Collection
    private void removeBook(){
        //Creating object/variables.
        Scanner sc = new Scanner(System.in);
        String genre,bookName;
        
        //Collecting input
        System.out.println("What is the name of the genre");
        genre = sc.nextLine();
        System.out.println("What is the name of the book");
        bookName = sc.nextLine();
        
        //Looping thru to find the value
        for(int i=0; i<genres.size(); i++){
            if(genre.equals(nameOfGenres[i])){
                genres.get(i).remove(bookName);
            }
        }
    }
    
    //Option 4: To add a book to the library
    private void addBook(Book newBook){
       Scanner s = new Scanner(System.in);
       String name, author, summary, genre; 
       int quantity;
       
       //Collectiong info about the Book to add
       System.out.println("Enter the Genre you will like to add this to");
       genre = s.nextLine();
       System.out.println("Enter the name of the book");
       name= s.nextLine();
       System.out.println("Enter the name of the author");
       author = s.nextLine();
       System.out.println("Enter a Summary");
       summary = s.nextLine();
       System.out.println("Enter qauntity of book");
       quantity = s.nextInt();
       
       //Creating the Book Object
       newBook = new Book(a,quantity, name, author, summary);

       //Finding the genre, and adding the book object to the genre
        for(int i=0; i<genres.size(); i++){
            if(genre.equals(nameOfGenres[i])){
                genres.get(i).put(name, newBook);
            }
        }
    }
    
    //Option 3: To display the favorite books
    private void displayFav(){
        if(fav.isEmpty()){
            System.out.println("You must select a favorite book with option 2 first");
        }else{
        fav.entrySet().forEach((reader) -> {
          System.out.println(reader.getValue());
           });
        }
    }

    //Option 2: part 2::  Adding favoite book, to favorite List.
    private void favorite(LinkedHashMap<String,Book>gen,String favGenres, String favBook){

        //Looking for the value of the Key in the LinkedHashMap.
        gen.get(favBook);
        int pos = new ArrayList<>(gen.keySet()).indexOf(favBook);
        System.out.println(pos);
        Book value;
        value = (new ArrayList<>(gen.values())).get(pos);
       fav.put(favGenres, value);
       fav.entrySet().forEach((read) -> {
            System.out.println("\nThe following book has been added to your favorite: \n"+read.getValue());
       });
    }
    
    //Option 2: part 1:: Checking if the user input matches the genre.
    private void checkFav (String favGenres, String favBook){
        //While within the size of the Stack
        for(int i=0; i<genres.size(); i++){
            if(favGenres.equalsIgnoreCase(nameOfGenres[i])){
                //Get the location of the Genre in the Array, and give its position to the Stack
               test.favorite(genres.get(i), favGenres, favBook);
            }
        }
    }
    //Option 1: part 2:: Checks the name of the Genere is valid
    private void check(String name){
        if(name.length() >0){
            
            if(name.equalsIgnoreCase("Adventure"))
                test.collection(Adventure);
            if(name.equalsIgnoreCase("Contemporary"))
                test.collection(Contemporary);
            if(name.equalsIgnoreCase("Dystopian"))
                test.collection(Dystopian);
            if(name.equalsIgnoreCase("Fantasy"))
                test.collection(Fantasy);
            if(name.equalsIgnoreCase("Horror"))
                test.collection(Horror);
            if(name.equalsIgnoreCase("Thriller"))
                test.collection(Thriller);
            if(name.equalsIgnoreCase("Romance"))
                test.collection(Romance);
        } else
            System.out.println("Error: Invalid input");
    }
    
    //Option 1: Takes the genere, and displays the books in that genere.
    private void collection (Map<String, Book> gen){
        gen.entrySet().forEach((reader) -> {
          System.out.println(reader.getValue());
        });
    }
}
    
