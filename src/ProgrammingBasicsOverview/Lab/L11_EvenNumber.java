package ProgrammingBasicsOverview.Lab;

import java.util.Scanner;

public class L11_EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        while (number % 2 != 0) {
            System.out.println("Please write an even number.");
            number = Integer.parseInt(input.nextLine());
        }

        System.out.printf("The number is: %d", Math.abs(number));
    }
}
