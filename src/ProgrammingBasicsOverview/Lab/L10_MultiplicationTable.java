package ProgrammingBasicsOverview.Lab;

import java.util.Scanner;

public class L10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
        }
    }
}
