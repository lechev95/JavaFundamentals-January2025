package ProgrammingBasicsOverview.Lab;

import java.util.Scanner;

public class L07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String day = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        int price;

        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    price = 12;
                }
                break;
            case "Weekend":
                break;
            case "Holiday":
                break;
        }
    }
}
