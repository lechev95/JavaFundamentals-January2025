package ProgrammingBasicsOverview.Lab;

import java.util.Scanner;

public class L03_PassedOrFailed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade = Double.parseDouble(input.nextLine());
        if (grade >= 3.00){
            System.out.println("Passed!");
        } else{
            System.out.println("Failed!");
        }
    }
}
