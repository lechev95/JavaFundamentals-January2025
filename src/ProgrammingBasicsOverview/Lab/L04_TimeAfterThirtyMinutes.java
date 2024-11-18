package ProgrammingBasicsOverview.Lab;

import java.util.Scanner;

public class L04_TimeAfterThirtyMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = Integer.parseInt(input.nextLine());
        int minutes = Integer.parseInt(input.nextLine());

        if(minutes + 30 > 60){
            hours++;
            minutes -= 30;
        } else {
            minutes += 30;
        }

        if(hours == 24){
            hours = 0;
        }

        if(minutes < 10){
            System.out.println(hours + ":0" + minutes);
        } else{
            System.out.println(hours + ":" + minutes);
        }
    }
}
