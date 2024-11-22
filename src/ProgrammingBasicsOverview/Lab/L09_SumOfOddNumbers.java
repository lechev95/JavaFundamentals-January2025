package ProgrammingBasicsOverview.Lab;

import java.util.Scanner;

public class L09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                n++;
            } else {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
