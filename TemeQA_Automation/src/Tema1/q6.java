package Tema1;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        citesteNumere();
    }

    public static void citesteNumere() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți primul număr: ");
        int numar1 = scanner.nextInt();

        System.out.print("Introduceți al doilea număr: ");
        int numar2 = scanner.nextInt();

        System.out.println("Numerele citite sunt: " + numar1 + " și " + numar2);

        scanner.close();
    }
}