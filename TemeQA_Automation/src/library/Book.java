package src.library;

public class Book {

    String title;

    String author;

    int year;

    boolean available;

    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    int getYear(){
        return year;
    }
    boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
