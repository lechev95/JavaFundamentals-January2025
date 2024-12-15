package ProgrammingBasicsOverview.Exercises;

import java.util.Scanner;

public class E10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        double singleSaberPrice = Double.parseDouble(scanner.nextLine());
        double singleRobePrice = Double.parseDouble(scanner.nextLine());
        double singleBeltPrice = Double.parseDouble(scanner.nextLine());
        int freeBelts = 0;

        if(count >= 6){
            freeBelts = count / 6;
        }

        int sabresCount = (int) Math.ceil(count * 1.1);

        double totalPrice = singleSaberPrice * sabresCount + singleRobePrice * count + singleBeltPrice * (count - freeBelts);
        if(budget >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }
        else{
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }
    }
}
