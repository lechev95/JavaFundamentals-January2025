package ProgrammingBasicsOverview.Exercises;

import java.util.Scanner;

public class E11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());

        double hPrice = games / 2 * headset;
        double mPrice = games / 3 * mouse;
        double kPrice = games / 6 * keyboard;
        double dPrice = games / 12 * display;

        System.out.printf("Rage Expenses: %.2f lv.%n", hPrice + mPrice + kPrice + dPrice);

    }
}
