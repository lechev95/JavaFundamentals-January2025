package ProgrammingBasicsOverview.Lab;

import java.util.Scanner;

public class L02_Passed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double passed = Double.parseDouble(input.nextLine());
        if (passed >= 3.00) {
            System.out.println("Passed!");
        }
    }
}
