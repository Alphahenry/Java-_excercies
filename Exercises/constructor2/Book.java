package constructor2;
//class book which is the blueprint
public class Book {

    //instance variables showing properties of the blueprint book
    private String title;
    private String author;
    private  double cost;

    //constructor to initializing the properties
    public Book(String title, String author, double cost){
        this.author = author;
        this.title = title;
        this.cost = cost;
    }

    //a method to diaplay a books information
    public void display_info(){
        System.out.println("The information  is: " + "Title: " + title + "author: " + author+ "cost: " + cost);

    }
}
