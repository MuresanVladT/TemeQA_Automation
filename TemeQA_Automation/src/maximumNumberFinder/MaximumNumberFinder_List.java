package src.maximumNumberFinder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumNumberFinder_List {

    public static void main(String[] args) {
        List<Integer> numbers = getInputFromUser();
        int max = findMaximum(numbers);
        System.out.println("Numarul maxim este: " + max);
    }

    private static List<Integer> getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu numarul de elemente: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Introdu elementele:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    private static int findMaximum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Lista nu poate fi nula sau goala.");
        }

        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int curent = numbers.get(i);
            if (curent > max) {
                max = curent;
            }
        }
        return max;
    }
}
