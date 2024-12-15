package ProgrammingBasicsOverview.Exercises;

import java.util.Scanner;

public class E07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0.0;

        while (!input.equalsIgnoreCase("start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f", coins);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        double price = 0.0;

        while (!input.equalsIgnoreCase("end")) {
            switch (input.toLowerCase()) {
                case "nuts":
                    price = 2.0;
                    break;
                case "water":
                    price = 0.7;
                    break;
                case "crisps":
                    price = 1.5;
                    break;
                case "soda":
                    price = 0.8;
                    break;
                case "coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            if(sum - price >= 0 && price > 0){
                System.out.printf("Purchased %s", input);
                sum -= price;

            } else if (price > 0){
                System.out.println("Sorry, not enough money");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}
