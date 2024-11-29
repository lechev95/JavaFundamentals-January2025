package ProgrammingBasicsOverview.Exercises;

import java.util.Scanner;

public class E03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        price = groups * 8.45;
                        if (groups >= 30) {
                            price -= price * 0.15;
                        }
                        break;
                    case "Business":
                        if (groups >= 100) {
                            groups -= 10;
                        }
                        price = groups * 10.9;
                        break;
                    case "Regular":
                        price = groups * 15;
                        if (groups >= 10 && groups <= 20) {
                            price -= price * 0.05;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        price = groups * 9.8;
                        if (groups >= 30) {
                            price -= price * 0.15;
                        }
                        break;
                    case "Business":
                        if (groups >= 100) {
                            groups -= 10;
                        }
                        price = groups * 15.6;
                        break;
                    case "Regular":
                        price = groups * 20;
                        if (groups >= 10 && groups <= 20) {
                            price -= price * 0.05;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        price = groups * 10.46;
                        if (groups >= 30) {
                            price -= price * 0.15;
                        }
                        break;
                    case "Business":
                        if (groups >= 100) {
                            groups -= 10;
                        }
                        price = groups * 16;
                        break;
                    case "Regular":
                        price = groups * 22.5;
                        if (groups >= 10 && groups <= 20) {
                            price -= price * 0.05;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
