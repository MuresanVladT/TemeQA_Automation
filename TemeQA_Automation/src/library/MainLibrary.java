package src.library;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMeniu:");
            System.out.println("1. Adaugare Carte");
            System.out.println("2. Imprumutare Carte");
            System.out.println("3. Returnare Carte");
            System.out.println("4. Afisare carti disponibile");
            System.out.println("5. Afisare carti imprumutate");
            System.out.println("6. Iesire");

            System.out.println("Introduceti optiunea dvs:");
            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Introduceti titlul cartii:");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.println("Introduceti autorul cartii:");
                    String autor = scanner.nextLine();
                    System.out.println("Introduceti anul publicarii:");
                    int year = scanner.nextInt();
                    library.addBook(new Book(title, autor, year));
                    System.out.println("Cartea a fost adaugata in biblioteca cu succes.");

                    break;
                case 2:
                    System.out.println("Introduceti ID-ul cartii pe care doriti sa o imprumutati:");
                    int borrowIndex = scanner.nextInt();
                    library.borrowBook(borrowIndex);

                    break;
                case 3:
                    System.out.println("Introduceti ID-ul cartii pe care doriti sa o returnati:");
                    int returnIndex = scanner.nextInt();
                    library.returnBook(returnIndex);

                    break;
                case 4:
                    library.displayAvailableBooks();

                    break;
                case 5:
                    library.displayBorrowedBooks();

                    break;
                case 6:
                    System.out.println("La revedere!");
                    System.exit(0);
                default:
                    System.out.println("Optiune invalida! Va rugam incercati din nou.");
            }
        }
    }
}
