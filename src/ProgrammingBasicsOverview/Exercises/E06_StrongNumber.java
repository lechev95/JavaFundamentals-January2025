package ProgrammingBasicsOverview.Exercises;

import java.util.Scanner;

public class E06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int comparator = number;
        int total = 0;

        while (number != 0) {
            int result = 1;
            int remainder = number % 10;
            number /= 10;
            for (int i = 1; i <= remainder; i++) {
                result *= i;
            }
            total += result;
        }

        if (total == comparator) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
