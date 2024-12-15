package ProgrammingBasicsOverview.Exercises;

import java.util.Scanner;

public class E09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= orders; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCounter = Integer.parseInt(scanner.nextLine());
            double currPrice = price * days * capsuleCounter;
            System.out.printf("The price for the coffee is: $%.2f%n", currPrice);
            totalPrice += currPrice;
        }

        System.out.printf("Total: %.2f", totalPrice);
    }
}
