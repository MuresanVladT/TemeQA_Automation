package Tema1;

import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un număr: ");
        double numar = scanner.nextDouble();

        double sumaCu5 = numar + 5;
        double diferentaCu12_3 = numar - 12.3;
        double produsCuNegativ3_2 = numar * -3.2;
        double impartireLa4 = numar / 4;
        double modulCu6 = numar % 6;

        System.out.println("Suma cu 5: " + sumaCu5);
        System.out.println("Diferența cu 12.3: " + diferentaCu12_3);
        System.out.println("Produsul cu -3.2: " + produsCuNegativ3_2);
        System.out.println("Impartirea la 4: " + impartireLa4);
        System.out.println("Modulul cu 6: " + modulCu6);

        scanner.close();
    }
}
