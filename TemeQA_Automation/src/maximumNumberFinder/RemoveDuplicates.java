package src.maximumNumberFinder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = getInputFromUser();
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Lista fara duplicate: " + uniqueNumbers);
    }

    private static ArrayList<Integer> getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu numarul de elemente: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Introdu elementele:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers) {
        HashSet<Integer> set = new HashSet<>(numbers);
        return new ArrayList<>(set);
    }
}
