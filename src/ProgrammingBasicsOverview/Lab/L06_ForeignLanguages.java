package ProgrammingBasicsOverview.Lab;

import java.util.Scanner;

public class L06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String country = input.nextLine();
        switch (country) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Mexico":
            case "Argentina":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
