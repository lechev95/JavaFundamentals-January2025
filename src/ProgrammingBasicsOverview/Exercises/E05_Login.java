package ProgrammingBasicsOverview.Exercises;

import java.lang.reflect.Array;
import java.util.Scanner;

public class E05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        int count = 0;

        while (count < 4) {
            String password = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(password);
            stringBuilder.reverse();
            if (username.contentEquals(stringBuilder)) {
                System.out.printf("User %s logged in.", username);
                return;
            }
            count++;

            if(count == 4){
                System.out.printf("User %s blocked!", username);
            }
            else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
