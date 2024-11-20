package ProgrammingBasicsOverview.Lab;

import java.util.Scanner;

public class L07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String day = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        double price = 0.0;

        switch (day) {
            case "Weekday":
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                }
                break;
            case "Weekend":
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                }
                break;
        }

        if (age < 0) {
            System.out.println("Error!");
        } else {
            System.out.printf("%.0f$", price);
        }
    }
}
