import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner numarx = new Scanner(System.in);
        System.out.println("introduceti primul numar");
        long numar01 = numarx.nextLong();

        Scanner numary = new Scanner(System.in);
        System.out.println("introduceti al doilea numar");
        long numar02 = numarx.nextLong();

        double inmultire = numar01 * numar02;
        double impartire = (double) numar01 / numar02;
        double scadere = numar01 - numar02;
        double modul = (double) numar01 % numar02;
        double adunare = numar01 + numar02;

        System.out.println("Numar1: " + numar01);
        System.out.println("Numar2: " + numar02);

        if (numar01 == numar02) {
            System.out.println("Numerele sunt egale");
        } else if (numar01 > numar02) {
            System.out.println("Nr 1 mai mare");
        } else System.out.println("Nr 2 mai mare");

        System.out.println("Adunare: " + adunare);
        System.out.println("Inmultire: " + inmultire);
        System.out.println("Impartire: " + impartire);
        System.out.println("Scadere: " + scadere);
        System.out.println("Modul: " + modul);

        numarx.close();
        numary.close();
    }
}
