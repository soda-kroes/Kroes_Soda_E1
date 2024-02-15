import java.util.Scanner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArray = new int[0];

        System.out.println("You Can Enter Numbers.Enter 'a' to Exit Program.");
        while (true) {
            System.out.print("=> Enter a number: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("a")) {
                break;
            }
            int number = Integer.parseInt(input);
            numberArray = Arrays.copyOf(numberArray, numberArray.length + 1);
            numberArray[numberArray.length - 1] = number;
        }
        System.out.println("Your input numbers Is:");
        for (int number : numberArray) {
            System.out.println(number);
        }
    }
}