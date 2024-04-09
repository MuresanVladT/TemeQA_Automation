package src.library;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    Library(){
        this.books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void borrowBook(int index){
        Book book = books.get(index);
        if (book.isAvailable()){
            book.setAvailable(false);
            System.out.println("Cartea: " + book.getTitle() + " a fost imprumutata cu succes.");
        }
        else {
            System.out.println("Aceasta carte a fost imprumutata deja.");
        }
    }

    public void returnBook(int index) {
        Book book = books.get(index);
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Cartea: " + book.getTitle() + " a fost returnata cu succes.");
        } else {
            System.out.println("Aceasta carte nu a fost imprumutata.");
        }
    }

    public void displayAvailableBooks(){
        System.out.println("Carti disponibile: ");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("---" + book.getTitle() + " scrisa de:" + book.getAuthor() + " anul:" + book.getYear());
            }
        }
    }

    public void displayBorrowedBooks () {
        System.out.println("Carti imprumutate:");
        for (Book book : books) {
            if (!book.isAvailable()) {
                System.out.println("---" + book.getTitle() + " scrisa de:" + book.getAuthor() + " anul:" + book.getYear());
            }
        }
    }
}

